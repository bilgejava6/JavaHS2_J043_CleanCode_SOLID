package com.muhammet.repository;

import java.util.List;

public interface Repository<ID, T> {
    T save(T t);
    T update(T t);
    boolean delete(ID id);
    T findById(ID id);
    List<T> findAll();
}
