package com.ErrorNotes.Notes.Modeles;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "solution")
public class Solution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String lien;
    String tuto;
    String site;
    String methode;
    String description;

    @ManyToOne
    private Probleme probleme;
}
