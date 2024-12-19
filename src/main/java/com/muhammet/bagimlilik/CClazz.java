package com.muhammet.bagimlilik;

public class CClazz {
    private PClazz pClazz;

    public CClazz(PClazz pClazz){
        this.pClazz = pClazz;
    }

    public double detayIslem(String detayAdi){
        // Bağımlılık diye ifade ettiğimiz şey tam bu noktada başka bir sınıf new lemek
        int deger =  pClazz.islem();
        System.out.println("bu işlemde "+ detayAdi+ " kullanılarak ...: "+ deger+ "sonucuna ulaşılmıştır..");
        return deger* 0.009;
    }
}
