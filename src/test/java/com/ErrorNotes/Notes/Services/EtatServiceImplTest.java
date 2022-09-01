package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Etat;
import com.ErrorNotes.Notes.Repositories.EtatRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EtatServiceImplTest {

    @Autowired
    EtatRepository etatRepository;

    @Test
    void changerEtat() {
        Etat etatcourant = etatRepository.findById(1L).orElse(null);
        Etat etat = etatRepository.save(etatcourant);
        etatcourant.setEtat(etat.getEtat());
        //return etatcourant.getEtat();
    }

    @Test
    void insertDefault() {

        Etat etatcourant = etatRepository.findById(1L).orElse(null);
        Etat etat = etatRepository.save(etatcourant);
        etatcourant.setEtat(etat.getEtat());

        etatRepository.insererEtat();
        Assert.assertNotNull(etat.getEtat());
        Assert.assertNotNull(etat.getId());
       // return "Etat insérer avec succès !";
    }
}