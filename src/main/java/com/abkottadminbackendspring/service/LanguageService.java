package com.abkottadminbackendspring.service;

import com.abkottadminbackendspring.model.Languages;
import com.abkottadminbackendspring.repository.LanguagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {
    @Autowired
    LanguagesRepository languagesRepository;

    public Languages addLanguages(Languages languages){
        Languages newLanguages=languagesRepository.save(languages);
        return newLanguages;
    }

    public Languages getLanguage(Long languageId){
        Languages languages=languagesRepository.findById(languageId).orElse(null);
        return languages;
    }

    public List<Languages> getAllLanguages(){
        List<Languages> languages=languagesRepository.findAll();
        return languages;
    }

    public Languages updateLanguage(Languages languages){
        if (languages!=null) {
            Languages existingProduct = new Languages();
            existingProduct.setLanguageId(languages.getLanguageId());
            existingProduct.setLanguages(languages.getLanguages());

            languagesRepository.save(existingProduct);
            return existingProduct;
        }
        else {
            return null;
        }
    }

    public void deleteLanguage(long languageId){
        languagesRepository.deleteById(languageId);
    }


}
