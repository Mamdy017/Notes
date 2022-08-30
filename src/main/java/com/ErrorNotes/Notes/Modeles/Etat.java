package com.ErrorNotes.Notes.Modeles;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "etat")
public class Etat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String etat;
    public Etat(long id) {
        this.id = id;
    }
}
