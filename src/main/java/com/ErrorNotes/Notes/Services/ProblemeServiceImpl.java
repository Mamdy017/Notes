package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Etat;
import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Modeles.Utilisateur;
import com.ErrorNotes.Notes.Repositories.EtatRepository;
import com.ErrorNotes.Notes.Repositories.ProblemeRepository;
import com.ErrorNotes.Notes.Repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemeServiceImpl implements ProblemeService {
    @Autowired
    private ProblemeRepository problemeRepository;
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Autowired
    EtatRepository etatRepository;
    @Override
    public Object poserProbleme(Probleme probleme) {
        Utilisateur utilisateurcourant = utilisateurRepository.findById(probleme.getUtilisateur().getId()).orElse(null);
        if (utilisateurcourant == null) return "Utilisateur non trouvé !";
        else {
            probleme.setEtat(new Etat(1L));
            return problemeRepository.save(probleme);
        }

    }

    @Override
    public String changerEtatProbleme(long id_probleme,long id_etat) {
        Probleme problemeAncienEtat = problemeRepository.findById(id_probleme).orElse(null);
        Etat nouveletat = etatRepository.findById(id_etat).orElse(null);

        if (problemeAncienEtat==null) return "Ce problème n'existe pas !";
        if (nouveletat == null) return "Etat invalide !";
        else {
            problemeAncienEtat.setEtat(new Etat(id_etat));
            problemeRepository.save(problemeAncienEtat);
            return "Etat du problème changer en : " +nouveletat.getEtat();
        }
    }

    @Override
    public void ajouterSolution(long id_solution) {

    }

    @Override
    public Object afficherUtilistateur(long id_probleme) {
        Probleme probleme = problemeRepository.findById(id_probleme).orElse(null);
        if (probleme == null) return "Ce problème n'existe pas !";
        else {
            return probleme.getUtilisateur();
        }
    }

    @Override
    public Object rechercherParMotCle(String motcle) {
        List<Probleme> resultat;
        resultat = problemeRepository.rechercherDescription(motcle);
        if (resultat.size() == 0) return "Problème introuvable!";
        else return resultat;
    }

    @Override
    public Object afficherProbleme() {
        if (problemeRepository.findAll().size() == 0) return "Il n'y a aucun problème sur la plateforme pour le moment";
        else return problemeRepository.findAll();
    }
}
