package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Modeles.Utilisateur;

public interface ProblemeService {
    public Probleme poserProbleme(Probleme probleme);
    public void changerEtatProbleme();
    public void ajouterSolution(long id_solution);
    public Utilisateur afficherUtilistateur(long id_utilisateur);

}
