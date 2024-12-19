package com.muhammet.liskov.repository;


import com.muhammet.liskov.entity.Product;

import java.util.Optional;

public class ProductRespoitory extends RepositoryImpl<Product>{

    public Optional<Product> findByName(String productName) {
        return Optional.empty();
    }
}
