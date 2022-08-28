package com.ErrorNotes.Notes.Modeles;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "probleme")
public class Probleme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String titre;
    String  description;
    String temps;
    @ManyToOne
    private Utilisateur utilistaeur;
    @ManyToOne
    @JsonIgnore
    private Etat etat;
}
