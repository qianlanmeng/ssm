package com.lk.service;

import com.lk.domain.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAll();

    void save( Product product);
}
