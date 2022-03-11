package com.abkottadminbackendspring.controller;

import com.abkottadminbackendspring.model.Category;
import com.abkottadminbackendspring.model.Genres;
import com.abkottadminbackendspring.service.GenresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/genres")
@RestController
public class GenresController {
    @Autowired
    GenresService genresService=new GenresService();

    @PostMapping("/add")
    public Genres addGenres(@RequestBody Genres genres){
        genresService.addGenres(genres);
        return genres;
    }

    @GetMapping("/get/{genresId}")
    public Genres getGenres(@PathVariable long genresId){
        Genres genres=genresService.getGenres(genresId);
        return genres;
    }

    @GetMapping("/")
    public List<Genres> getAllGenres(){
        List<Genres> genres=genresService.getAllGenres();
        return genres;
    }

    @PostMapping("/update/{genresId}")
    public Genres updateGenres(@PathVariable long genresId,@RequestBody Genres genres){
        genres.setGenresId(genresId);
        Genres newGenres=genresService.updateGenres(genres);
        return newGenres;
    }


    @GetMapping("/delete/{genresId}")
    public void deleteGenres(@PathVariable long genresId){
        genresService.deleteGenres(genresId);
    }


}
