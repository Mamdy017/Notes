package com.ErrorNotes.Notes.Modeles;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "etat")
public class Etat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String etat;
}
