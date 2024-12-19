package com.muhammet.singletonDP;

import java.util.Random;

public class Musteri {
    private Long id;
    private String ad;
    private String soyad;

    public Musteri(String ad, String soyad) {
        this.id = new Random().nextLong(2_999,2_999_999);
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Musteri{");
        sb.append("id=").append(id);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", soyad='").append(soyad).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
