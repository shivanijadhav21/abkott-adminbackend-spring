package com.abkottadminbackendspring.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.File;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long videoId;

    @Column(name = "videoTitle")
    @NotNull
    private String videoTitle;

    @Column(name = "videoInformation")
    @NotNull
    private String  videoInformation;

//    @Column(name = "videoFile")
//    @NotNull
//    private File videoFile;

    @Column(name = "languages")
    @NotNull
    private String languages;

    @Column(name = "genres")
    @NotNull
    private String genres;
}
