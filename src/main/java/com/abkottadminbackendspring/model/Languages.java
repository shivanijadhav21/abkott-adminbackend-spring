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
public class Languages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long languageId;

    @Column(name="languages")
    @NotNull
    private String languages;
}
