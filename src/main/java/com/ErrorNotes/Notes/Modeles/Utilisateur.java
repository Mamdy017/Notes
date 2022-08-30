package com.ErrorNotes.Notes.Modeles;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    String prenom;
    @Column(unique = true)
    String contact;
    String motdepasse;
    @Transient
    String confirmpasse;
    @ManyToOne
    private  Role role;

}
