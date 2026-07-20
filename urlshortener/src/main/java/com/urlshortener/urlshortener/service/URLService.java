package com.urlshortener.urlshortener.service;
import java.util.*;
import org.springframework.stereotype.Service;
import com.urlshortener.urlshortener.repository.URLRepository;
import com.urlshortener.urlshortener.util.ShortCodeGenerator;
@Service
public class URLService {
    private URLRepository repository= new URLRepository();
      public String shortenURL(String longURL){
        HashMap<String,String>codeToUrl= repository.getCodeToUrl();
        HashMap<String,String>urlToCode=repository.getUrlToCode();

        if(urlToCode.containsKey(longURL)){
            return urlToCode.get(longURL);
        }
        String code;
        do{
            code= ShortCodeGenerator.generateCode();

        }
        while(codeToUrl.containsKey(code));
        codeToUrl.put(code,longURL);
        urlToCode.put(longURL,code);
        return code;
    }
    public String resolveURL(String code){
        return repository.getCodeToUrl().get(code);
    }

}
