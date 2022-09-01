package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Commentaire;
import com.ErrorNotes.Notes.Modeles.Solution;
import com.ErrorNotes.Notes.Modeles.Utilisateur;
import com.ErrorNotes.Notes.Repositories.CommentaireRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CommentaireServiceImplTest {

    @Autowired
    CommentaireService commentaireService;

    @Autowired
    CommentaireServiceImpl commentaireServiceImpl;

    @Test
    public void creer() {
        Commentaire commentaire = new Commentaire();
        commentaire.setDescription("fcghj");
        Commentaire commentaire1=commentaireServiceImpl.creer(commentaire);

        /*Commentaire commentairetest = new Commentaire();
        commentairetest.setId(1L);
        commentairetest.setDescription("C'est Abdoul qui est entrain de faire ce test");
        //commentairetest.setSolution(new Solution());
        //commentairetest.setUtilistaeur(new Utilisateur());

        Commentaire commentairesauvegarder = commentaireRepository.save(commentairetest);
        Assert.assertNotNull(commentairesauvegarder);
        Assert.assertNotNull(commentairetest.getId());
        System.out.println("bon travail");*/

        }

    @Test
    public void supprimer() {
        /*Commentaire commentairetest = new Commentaire();
        commentairetest.setId(1L);
        commentairetest.setDescription("test de supression de commentaire");

        Commentaire commentairesauvegarder = commentaireRepository.save(commentairetest);
        Assert.assertNotNull(commentairesauvegarder);
        Assert.assertNotNull(commentairetest.getId());
        commentaireRepository.deleteById(commentairesauvegarder.getId());*/
    }
}