package com.abkottadminbackendspring.service;

import com.abkottadminbackendspring.model.Category;
import com.abkottadminbackendspring.model.Genres;
import com.abkottadminbackendspring.repository.GenresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenresService {
    @Autowired
    GenresRepository genresRepository;

    public Genres addGenres(Genres genres){
        Genres newGenres=genresRepository.save(genres);
        return newGenres;
    }

    public Genres getGenres(Long genresId){
        Genres genres=genresRepository.findById(genresId).orElse(null);
        return genres;
    }

    public List<Genres> getAllGenres(){
        List<Genres> genres=genresRepository.findAll();
        return genres;
    }

    public Genres updateGenres(Genres genres){
        if (genres!=null) {
            Genres existingGenres = new Genres();
            existingGenres.setGenresId(genres .getGenresId());
            existingGenres.setGenres(genres.getGenres());

            genresRepository.save(existingGenres);
            return existingGenres;
        }
        else {
            return null;
        }
    }

    public void deleteGenres(long genresId){
        genresRepository.deleteById(genresId);
    }

}
