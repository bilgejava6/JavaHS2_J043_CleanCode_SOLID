package com.muhammet;

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
         * **** Methodlarımızı yazarken gövdelerinde methodun işlevselliğine göre kodlama yaparız ancak,
         * bu kodlamalar bazen fazla uzun olabilirler. Bu nedenle kodlarınız belirlerken çok karmaşık
         * çok fazla iş yapacak kodlar yerine yada spesifik işleri görevleri olan kodlamalar yazpın
         * yani kısacası bir method gövdesini 15-20 satırdan fazla olmayacak şekilde kodlamaya özen
         * gösteriniz. Methodlar içinde kullanılması düşünülen değişkenlerin sayısını da kısıtlamak
         * gereklidir. İthiyaca göre değişse de genellikle bir method içerisinde 2-3 değişken
         * tanımlamak yeterli olacaktır.
         * -----
         * **** Metodların içerisinde ister istemez for, if, while try...catch gibi blokları kullanırız
         * ancak karar yapılarını bir method içerisinde 7-8 karar aşamasını geçmemesine özen gösteriniz.
         * -----
         * **** Normalde projeye başlanıldığında methodların içerisi boş ve temizdir, ancak sonradan
         * projeye gelen case ler methodların farklı işlemler yapmasına ve gelişmesine neden olur
         * bu yüzden methodların içleri şişmeye başlar, Belli aralıklarla kodlarınızı "code review"
         * yapmalısınız. Yani kodlarınız elden geçirerek mümkün olabildiği kadar temizlemey
         * belli noktalar notlar düşmeye çalışmalısınız.
         * -----
         * **** Kodlarınızı gözden geçirirken bazen tekrar eden kodlar, aynı işi yapan methodlar
         * gereksiz kullanılmayan sınıflar ortaya çıkabilir, bunları bildirerek ivedilikle temizlenmesini
         * istemelisiniz yada siz temizlemelisiniz.
         * -----
         * **** Methodların isimlendirilmesi, methodlara isim verirken dikkat edilecek temel konu
         * methodun ne iş yapacağı olmalıdır. Buna göre isim belirlemeli ve isim belirleken
         * kısaltmalardan uzak durmalısınız.MEthod isimleri uzuuuuuuuun olmalıdır. isimlendirme
         * yaparken EMİR kipi kullanmalısınız.
         * DİKKAT!!! Eğer bir method a isim veremiyorsanız o method sorunludur. Çünkü çok fazla
         * görev yapacak şekilde kurgulanmıştır.
         * saveProduct, deleteByUserId(),
         * List<Post> findByIschallengeAndStatusAndFinishdateGreaterThanAndUseridNotInAndUseridNotAndIsuserchallengeIsFalse(
         *                                                                                                String ischallenge,
         *                                                                                                int status,
         *                                                                                                long timestamp,
         *                                                                                                List<String> ids,
         *                                                                                                String userid);
         *
         */


    }
}
