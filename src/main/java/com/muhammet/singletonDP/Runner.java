package com.muhammet.singletonDP;

public class Runner {
    public static void main(String[] args) {
        Musteri musteri = new Musteri("Ali","TAŞ");
        MusteriRepository repository = MusteriRepository.getInstance();
        repository.save(musteri);
    }
}
