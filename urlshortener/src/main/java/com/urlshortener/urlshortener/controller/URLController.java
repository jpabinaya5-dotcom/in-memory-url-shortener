package com.urlshortener.urlshortener.controller;


import com.urlshortener.urlshortener.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin
//import com.urlshortener.urlshortener.service.URLService;
public class URLController {
    @Autowired
    private URLService service;
    @PostMapping("/shorten")
    public String shorten(@RequestBody String longURL){
        return service.shortenURL(longURL);
    }
    @GetMapping("/resolve/{code}")
    public String resolve(@PathVariable String code){
        return service.resolveURL(code);
    }
}
