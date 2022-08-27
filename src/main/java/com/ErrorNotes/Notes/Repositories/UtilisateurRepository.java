package com.ErrorNotes.Notes.Repositories;

import com.ErrorNotes.Notes.Modeles.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

    @Autowired
    Utilisateur findAllById(Long id);
}
