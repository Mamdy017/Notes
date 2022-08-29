package com.ErrorNotes.Notes.Services;


import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Modeles.Utilisateur;
import org.springframework.stereotype.Service;



public interface UtilisateurService {

    //public void commenter(long id_solution);
    public Probleme poserProbleme();
    public String changerMotdepasse(Long mdp);
    public Utilisateur changerNom(String nom);
    public Utilisateur donnerRole(String role);
    public Utilisateur creer(Utilisateur utilisateur);

}
