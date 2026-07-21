package com.urlshortener.urlshortener.repository;
import java.util.HashMap;
public class URLRepository {
    
    private HashMap<String,String>codeToUrl= new HashMap<>();
    private HashMap<String,String>urlToCode= new HashMap<>();

    public HashMap<String,String> getCodeToUrl(){
        return codeToUrl;
    }
    public HashMap<String,String>getUrlToCode(){
        return urlToCode;
    }
}
