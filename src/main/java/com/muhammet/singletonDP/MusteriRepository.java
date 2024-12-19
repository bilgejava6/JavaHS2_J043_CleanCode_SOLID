package com.muhammet.singletonDP;

import java.util.List;

public class MusteriRepository {

    private static MusteriRepository INSTANCE;

    public static MusteriRepository getInstance(){
        if(INSTANCE == null){
            INSTANCE = new MusteriRepository();
        }
        return INSTANCE;
    }

    private MusteriRepository(){

    }

    public void save(Musteri musteri) {}
    public Musteri findById(Long id) {
        return null;
    }
    public List<Musteri> getAll(){
        return null;
    }
}
