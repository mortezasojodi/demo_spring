package com.spring5.demo.controller;

import com.spring5.demo.controller.reponseDto.ProductResponse;
import com.spring5.demo.controller.requestDto.ProductRequest;
import com.spring5.demo.model.Product;
import com.spring5.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @GetMapping("/product/find-all")
    public List<ProductResponse> index() {
        return service.findAll();

    }

    @PostMapping("/product/")
    public boolean add(@RequestBody ProductRequest request) {
        return service.add(request);

    }

    @PutMapping("/product/{id}")
    public boolean update(@PathVariable int id, @RequestBody ProductRequest request) {
        return service.update(id, request);

    }
}

