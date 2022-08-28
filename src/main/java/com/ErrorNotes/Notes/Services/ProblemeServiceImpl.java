package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Etat;
import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Modeles.Utilisateur;
import com.ErrorNotes.Notes.Repositories.EtatRepository;
import com.ErrorNotes.Notes.Repositories.ProblemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemeServiceImpl implements ProblemeService {
    @Autowired
    private ProblemeRepository problemeRepository;
    @Autowired
    EtatRepository etatRepository;
    @Override
    public Object poserProbleme(Probleme probleme) {
        Etat etatExistant = etatRepository.findById(probleme.getEtat().getId()).orElse(null);
        if (etatExistant==null) {
            return "L'état n'est pas valide !";
        } else
        return problemeRepository.save(probleme);

    }

    @Override
    public String changerEtatProbleme(long id_probleme,long id_etat) {
        Probleme problemeAncienEtat = problemeRepository.findById(id_probleme).orElse(null);

        if (problemeAncienEtat==null) return "Ce problème n'existe pas !";
        else {
            Etat nouveletat = problemeAncienEtat.getEtat();
            nouveletat.setId(id_etat);
            problemeAncienEtat.setEtat(nouveletat);
            problemeRepository.save(problemeAncienEtat);
            return "Etat du problème changer en : "+problemeAncienEtat.getEtat().getEtat();
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
            return probleme.getUtilistaeur();
        }
    }

    @Override
    public List<Probleme> rechercherParMotCle(String motcle) {
        return problemeRepository.rechercherDescription(motcle);
    }
}
