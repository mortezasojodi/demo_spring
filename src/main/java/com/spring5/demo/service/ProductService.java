package com.spring5.demo.service;

import com.spring5.demo.controller.reponseDto.ProductResponse;
import com.spring5.demo.controller.requestDto.ProductRequest;
import com.spring5.demo.exeption.NotFoundException;
import com.spring5.demo.mapper.ProductMapper;
import com.spring5.demo.model.Product;
import com.spring5.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductResponse> findAll() {
        List<Product> models = productRepository.findAll();
        return models.stream().map(productMapper::toProductResponse).toList();
    }

    public boolean add(ProductRequest request) {
        var entity = productMapper.toEntity(request);
        productRepository.save(entity);
        return true;
    }

    public boolean update(int Id, ProductRequest request) {
        var model = productRepository.findById(Id).orElseThrow(() -> new NotFoundException("PACKAGING_ID_NOT_FOUND_ERROR"));
        productMapper.toEntityUpdate(request, model);
        productRepository.save(model);
        return true;
    }
}
