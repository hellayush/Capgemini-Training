package com.gal.algo;

import org.springframework.stereotype.Component;
//create an obj for this class

@Component //Asking IOC Container(Appliction Context)
public class PasswordHasher {
    public String hash(String password)
    {
        return new StringBuilder(password).reverse().toString();
    }
    public PasswordHasher()
    {
        System.out.println("PasswordHAsher Created");
    }
}
