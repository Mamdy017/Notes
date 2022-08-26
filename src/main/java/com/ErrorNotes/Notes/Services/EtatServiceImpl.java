package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Etat;
import com.ErrorNotes.Notes.Repositories.EtatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//enum etat_values {initié,encours,résolu,fermé}
public class EtatServiceImpl implements EtatService {
    @Autowired
    EtatRepository etatRepository;


    @Override
    public String changerEtat(String etat) {
        Etat etatcourant = etatRepository.findById(1L).orElse(null);
        etatcourant.setEtat(etat);
        return etatcourant.getEtat();
    }

    @Override
    public void insertDefault() {
        etatRepository.insererEtat();
    }
}
