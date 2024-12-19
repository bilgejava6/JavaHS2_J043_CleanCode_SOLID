package com.muhammet.liskov;

import com.muhammet.liskov.entity.User;
import com.muhammet.liskov.repository.UserRepository;

public class Runner {
    public static void main(String[] args) {
        /**
         *
         *
         *
         */

        UserRepository userRepository = new UserRepository();
        userRepository.save(new User());
        userRepository.findAll();
    }
}
