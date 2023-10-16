package com.systex.libs;

import java.util.Random;

public class captcha {
    public static void main(String[] args) {

    }
    public static  String generateCaptcha(){
        char charr[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for(int x =0; x<5;++x){
            sb.append(charr[r.nextInt(charr.length)]);
        }
        return  sb.toString();

    }
}
