package com.abkottadminbackendspring.controller;

import com.abkottadminbackendspring.model.Languages;
import com.abkottadminbackendspring.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/languages")
@RestController
public class LanguagesController{
    @Autowired
    LanguageService languageService=new LanguageService();

    @PostMapping("/add")
    public Languages addProduct(@RequestBody Languages languages){
        languageService.addLanguages(languages);
        return languages;
    }

    @GetMapping("/get/{languageId}")
    public Languages getProduct(@PathVariable long languageId){
        Languages languages=languageService.getLanguage(languageId);
        return languages;
    }

    @GetMapping("/")
    public List<Languages> getAllProducts(){
        List<Languages> languages=languageService.getAllLanguages();
        return languages;
    }

    @PostMapping("/update/{languageId}")
    public Languages updateLanguage(@PathVariable long languageId,@RequestBody Languages languages){
        languages.setLanguageId(languageId);
        Languages newLanguages=languageService.updateLanguage(languages);
        return newLanguages;
    }


    @GetMapping("/delete/{languageId}")
    public void deleteProduct(@PathVariable long productId){
        languageService.deleteLanguage(productId);
    }


}
