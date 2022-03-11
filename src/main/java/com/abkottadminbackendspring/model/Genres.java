package com.abkottadminbackendspring.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genres {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long genresId;

    @Column(name = "genres")
    @NotNull
    private String genres;

}