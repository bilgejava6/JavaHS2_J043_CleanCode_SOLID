package com.muhammet.liskov.repository;

import java.util.List;

public abstract class RepositoryImpl<T> implements Repository<T> {
    public void save(T entity){

    }

    public List<T> findAll(){
        return List.of();
    }
}
