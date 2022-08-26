package com.ErrorNotes.Notes.Repositories;

import com.ErrorNotes.Notes.Modeles.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
}
