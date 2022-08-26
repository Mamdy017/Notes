package com.ErrorNotes.Notes.Modeles;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name ="commentaire")
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String description;
    @ManyToOne
    private Utilisateur utilistaeur;
    @ManyToOne
    private  Commentaire commentaire;
}
