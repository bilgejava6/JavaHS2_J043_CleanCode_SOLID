package com.muhammet.singletonDP;

public class RunnerT {
    public static void main(String[] args) {
        musteriEkle();
        musteriEkle2();
        musteriEkle3();

    }

    private static void musteriEkle(){
        Musteri musteri = new Musteri("Deniz","TAŞ");
        MusteriRepository repository = MusteriRepository.getInstance();
        repository.save(musteri);
    }


    private static void musteriEkle2(){
        Musteri musteri = new Musteri("Kaan","TAŞ");
        MusteriRepository repository = MusteriRepository.getInstance();
        repository.save(musteri);
    }

    private static void musteriEkle3(){
        Musteri musteri = new Musteri("BAha","TAŞ");
        MusteriRepository repository = MusteriRepository.getInstance();
        repository.save(musteri);
    }


}
