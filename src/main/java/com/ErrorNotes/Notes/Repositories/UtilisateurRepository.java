package com.ErrorNotes.Notes.Repositories;

import com.ErrorNotes.Notes.Modeles.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

    @Query(value = "SELECT utilisateur.nom,utilisateur.prenom,utilisateur.contact FROM utilisateur WHERE utilisateur.contact=? AND utilisateur.motdepasse=?;",nativeQuery = true)
    public Utilisateur connecter(String contact,String mdp);
    @Autowired
    Utilisateur findAllById(Long id);

    Utilisateur findByContact(String contact);
}
