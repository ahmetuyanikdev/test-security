package com.springapp.mvc.encoder;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encoder {

    public static void  main(String [] args){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("admin"));
    }

}
