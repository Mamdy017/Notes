package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Modeles.Utilisateur;

public interface UtilisateurService {
    public void commenter(long id_solution);
    public Probleme poserProbleme();
    public Utilisateur changerMotdepasse(String mdp);
    public Utilisateur changerNom(String nom);
    public String donnerRole(String role);
}
