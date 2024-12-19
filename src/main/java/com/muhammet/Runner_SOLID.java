package com.muhammet;

public class Runner_SOLID {
    public static void main(String[] args) {
        /**
         * SOLID, ACID, AGILE, Design Patterns
         *
         * Amaç,
         * 1- Kodlamanın esnek ve geliştirilebilir olmasını sağlamak,
         * 2- Kodlarınız daha anlaşılır ve okunaklı olur,
         * 3- Kodlarımız modüler olur, böylelikle esneye bildiği gibi
         * kodlarımız başka projlerde de kullanılabilir olur,
         * 4- Kodların test edilebilirliği artar,
         * 5- SOLID, kodlama maliyetlerinizi düşürür, zamandan tasarruf edersiniz.
         * -------------
         *
         * S - Single Responsibility Principle (Tek Sorumluluk İlkesi)
         * Interface, Class, Method gibi kavramların kendi gövleri ile iligili alanlarda
         * kalmaları ve tek iş yapmalarının sağlanması gereklidir.
         * IUserRepository -> User entity sinin DB yönetimini yürüten interface
         * ICrud, IService, UserService
         * save(), findAllByUserNameAndPassword(), getAllByName()
         *
         * O - Open Closed Principle (Açıklık Kapalılık İlkesi)
         * Kodlarınız Değişime kapalı olmalı, ancak gelişime açık olmalılar.
         * // Servis Katmanı (Product, User, Sale v.s)-> findAll(), findById(ID id), findAllByUserName(String regex);
         * -> kod ekleme işlemleri miras yöntemi ile geliştirilere eklenir. yeni method, yeni dınıflar şeklinde ilerler
         *
         * L - Liskov Substitution Principle (Liskov Prensibi)
         * Mümkün olduğu kadar gereksiz methodlardan uzak durun. Eğer bir method başka bir method ile aynı yada yakın
         * işi yapıyorsa bunu başka bir method, sınıf içinde tanımlayarak miras alıp kullanın.
         *
         * I - Interface Segregation Principle
         * Uygulamalarımız içerisinde genellikle kodlarda tutarlılık ve temiz yazım için interface oluşturur ve
         * kullanırız. Her bir sınıf için bir soyut sınıf ya da interface oluşturuluyor. Tekrar eden ve
         * neredeyse tüm sınıflarda kullanılan methodları tek bir interface yada interface ler hiyerarşisinde
         * saklamak doğru olacaktır.
         *
         * D - Dependency Inversion Principle
         * Bir uygulamayı yazarken, Ortak kodlamalar ve işlevler için interface,abstract class ve parent class ları
         * kullanarak inheritance yapıyoruz. Sınıflar bir birlerini miras alamaya başladıkça bir birlerine olan
         * bağımlılıları artmaktadır, bu sıkı bağımlılık kodun geliştirilebilir olmasının önüne geçmekte ve
         * geliştirmeyi yavaşlatmakta bazende imkansız hale getirmektedir. Bu nedenle bağımlılıkları
         * gevşetmek ve tersine çevirmek daha doğru olacaktır.
         *
         * A Class ->
         * B Class -> extents A,
         * C Class -> B bclazz = new B();
         * -------
         * Polymorphism - Çok Biçimlilik
         *
         */
    }
}
