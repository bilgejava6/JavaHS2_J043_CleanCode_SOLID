package com.muhammet.repository;

import java.util.List;

public class SatisRepositorySaveImpl implements  SatisRepository<Long,String>{
    @Override
    public List<String> getAllSaleFromProductId(Long productId) {
        return List.of();
    }

    @Override
    public String save(String s) {
        return "";
    }

    @Override
    public String update(String s) {
        return "";
    }

    @Override
    public boolean delete(Long aLong) {
        return false;
    }

    @Override
    public String findById(Long aLong) {
        return "";
    }

    @Override
    public List<String> findAll() {
        return List.of();
    }
}
