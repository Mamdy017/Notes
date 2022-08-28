package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Modeles.Utilisateur;

import java.util.List;

public interface ProblemeService {
    public Object poserProbleme(Probleme probleme);
    public String changerEtatProbleme(long id_probleme,long id_etat);
    public void ajouterSolution(long id_solution);
    public Object afficherUtilistateur(long id_probleme);
    public Object rechercherParMotCle(String motcle);

}
