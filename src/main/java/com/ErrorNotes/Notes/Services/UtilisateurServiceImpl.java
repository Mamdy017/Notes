package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Modeles.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;


public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    public UtilisateurService utilisateurService;

    /*@Override
    public void commenter(long id_solution) {


    }

    @Override
    public Commentaire commenter(Long id_solution) {
        return null;
    }**/

    @Override
    public Probleme poserProbleme() {
        return null;
    }

    @Override
    public String changerMotdepasse(Long mdp) {
        return null;
    }

    @Override
    public Utilisateur changerNom(String nom) {
        return null;
    }

    @Override
    public Utilisateur donnerRole(String role) {
        return null;
    }

    @Override
    public Utilisateur creer(Utilisateur utilisateur) {
        return utilisateur;
    }

}
