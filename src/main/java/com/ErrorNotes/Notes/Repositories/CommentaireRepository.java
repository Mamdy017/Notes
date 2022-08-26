package com.ErrorNotes.Notes.Repositories;

import com.ErrorNotes.Notes.Modeles.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepository extends JpaRepository<Commentaire,Long> {
}
