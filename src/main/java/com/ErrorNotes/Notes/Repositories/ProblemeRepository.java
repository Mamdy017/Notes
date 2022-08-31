package com.ErrorNotes.Notes.Repositories;

import com.ErrorNotes.Notes.Modeles.Probleme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProblemeRepository extends JpaRepository<Probleme,Long> {
    @Query(value = "SELECT * from probleme where description like %:motcle% or titre like %:motcle%",nativeQuery = true)
    public List<Probleme> rechercherDescription(String motcle);
    @Query(value = "SELECT probleme.nom FROM probleme,utilisateur WHERE probleme.utilisateur_id=utilisateur.id;",nativeQuery = true)
    List<Probleme> afficherNecessaire();
}
