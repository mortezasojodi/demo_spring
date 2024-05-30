package com.spring5.demo.mapper;

import com.spring5.demo.controller.reponseDto.ProductResponse;
import com.spring5.demo.controller.requestDto.ProductRequest;
import com.spring5.demo.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ProductMapper {
    ProductResponse toProductResponse(Product product);

    Product toEntity(ProductRequest product);

    void toEntityUpdate(ProductRequest product, @MappingTarget Product entity);
}