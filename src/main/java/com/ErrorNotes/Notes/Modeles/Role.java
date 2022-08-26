package com.ErrorNotes.Notes.Modeles;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String role;
}
