package com.ErrorNotes.Notes.Services;


import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Modeles.Utilisateur;


public interface UtilisateurService {

    //public void commenter(long id_solution);
    public Probleme poserProbleme();
    public String changerMotdepasse(long id, String mdp);
    public String changerNom(long id, String nom);
    public String donnerRole(long id_utilisateur,long id_role);
    public Utilisateur creer(Utilisateur utilisateur);
    public String supprimer(Long id);

}
