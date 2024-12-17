package com.muhammet;

import com.muhammet.repository.SatisRepository;
import com.muhammet.repository.SatisRepositorySaveImpl;
import com.muhammet.repository.SatisRepositoryUpdateImpl;

public class Runner {
    public static void main(String[] args) {
        /**
         * Clean Code - Temiz Kod - iyi yıkanmış temizlenmiş kod değildir :)
         * ----------------
         * kodun daha anlaşılır, sade olmasını kastederiz. (code smell - olmamalı)
         * -----
         * *** Sınıflarımızı oluştururken soyutlama yapmalıyız. soyutlama yaparken
         * sınıflar temel olarak entity sınıfı değil ise görev üstlenen belli amaçları
         * olan sınıflardır. Burada sınıfların görevlerini yazarken görev yapacak olan
         * methodun mutlaka TEK GÖREV inin olmasına dikkat etmeliyiz. (Single Responsibility  - Tek Sorumuluk İlkesi)
         * -----
         * *** Sınıflarımız içerisinde mümkün olduğu kadar az ve gerekli miktarda method kullanmalıyız.
         * temel olarak belli bir sayı belirtmek doğru olmasa da 10-15 method arası ideal dir.
         * aynı görevi yapan farklı isimlerde sınıflar olmasın. Interface kullanarak belli methodlar
         * ve yeni eklenecek methodlar için tanımlamaları yapmak fardalıdır.
         * save(), musteriKaydet(), customerAdd(), saveCustomer() ....
         * -----
         * *** Tekrar eden kodlardan kurtulun. (DRY - Don't Repeat Yourself)
         * ÖRN: bir ekran var ve inputlara girişler yapılıyor. Buradai, kaydet, güncelle, yeni, temizle
         * butonları olsun ve bu buotnlar işlemlerini yaptıktan sınra ekrandaki bilgileri temizlesin.
         * inputUserName.clear();
         * inputPassword.clear();
         *
         * private void temizle(){
         *     // repeated code
         * }
         * -----
         * 
         */


    }
}
