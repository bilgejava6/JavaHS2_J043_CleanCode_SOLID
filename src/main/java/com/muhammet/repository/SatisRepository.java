package com.muhammet.repository;

import java.util.List;

public interface SatisRepository<ID,T> extends Repository<ID,T>{
    /**
     * Bu method ürün id sinden o ürünle ilgili satışları listeler
     * @param productId - Ürün id sini vermelisin.
     * @return filtrelenen tüm satıları liste olarak döner.
     */
    List<T> getAllSaleFromProductId(ID productId);
}
