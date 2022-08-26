package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Modeles.Utilisateur;
import com.ErrorNotes.Notes.Repositories.ProblemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProblemeServiceImpl implements ProblemeService {
    @Autowired
    private ProblemeRepository problemeRepository;
    @Override
    public Probleme poserProbleme(Probleme probleme) {
        return problemeRepository.save(probleme);
    }

    @Override
    public void changerEtatProbleme() {

    }

    @Override
    public void ajouterSolution(long id_solution) {

    }

    @Override
    public Utilisateur afficherUtilistateur(long id_utilisateur) {
        return null;
    }
}
