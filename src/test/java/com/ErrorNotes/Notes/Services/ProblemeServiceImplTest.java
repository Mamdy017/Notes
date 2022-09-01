package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Etat;
import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Modeles.Utilisateur;
import com.ErrorNotes.Notes.Repositories.ProblemeRepository;
import com.ErrorNotes.Notes.Repositories.UtilisateurRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProblemeServiceImplTest {

    @Autowired
    ProblemeRepository problemeRepository;

    @Autowired
    UtilisateurRepository utilisateurRepository;

  /*  @Test
    Object poserProbleme(Probleme probleme) {
        Utilisateur utilisateur1 = utilisateurRepository.findById(probleme.getUtilisateur().getId()).orElse(null);
        if (utilisateur1== null) return "Utilisateur non trouvé !";
        else {
            probleme.setEtat(new Etat(1L));
           Probleme probleme2 = problemeRepository.save(probleme);
        }
        return problemeRepository.rechercherDescription("mm");
    }*/

    @Test
    void changerEtatProbleme() {
    }

    @Test
    void ajouterSolution() {
    }

    @Test
    void afficherUtilistateur() {
    }

    @Test
    void rechercherParMotCle() {
    }

    @Test
    void afficherProbleme() {
    }
}