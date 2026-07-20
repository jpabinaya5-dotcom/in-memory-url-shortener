package com.urlshortener.urlshortener.util;

import java.util.Random;

public class ShortCodeGenerator {
     private static final String CHARACTERS= "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final int LENGTH=6;
    private static Random random= new Random();
    public static String generateCode(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<LENGTH;i++){
            int index= random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }
}
