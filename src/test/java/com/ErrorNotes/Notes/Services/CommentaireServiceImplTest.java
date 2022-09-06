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
    public String creer() {
/*
        Utilisateur utilisateur= new Utilisateur();
        utilisateur.setNom("DJENIKA");
        utilisateur.setPrenom("Aboubacar");
        utilisateur.setContact("709809786");
        //utilisateur.setId(1L);
        commentaire.setUtilistaeur(utilisateur);
        Solution solution= new Solution();
        solution.setDescription("Le test marche !");
        solution.setLien("https://www.bezkoder.com/spring-boot-jpa-crud-rest-api/");
        solution.setTuto("Youtube channel");
        solution.setSite("bezkoder.com");
        //solution.setId(3L);

        //commentaire.setId(2L);
        commentaire.setSolution(solution);*/
        Commentaire commentaire = new Commentaire();
        commentaire.setDescription("fcghj");
        Commentaire commentaire1 = commentaireServiceImpl.creer(commentaire);

        Assert.assertNotNull(commentaire1);
        Assert.assertNotNull(commentaire1.getId());

        if (commentaire1 == null){
            return "la fonctionnalité ne marche pas !";
        } else {
            return "la fonctionnalité marche ";
        }


 /*       @Test
        void ajoutCommentaire() {
            Commentaire commentaire = new Commentaire();
            Solution solution = solutionService.RecupererIdSolution(1L);
            Utilisateur user = utilisateurService.TrouverParEmail("tiec@gmail.com");
            if (user==null){
                System.out.println("Email Incorrect!");
            }
            else if (!user.getPassword().equals("admin")){
                System.out.println("Mot de passe incorrect!");
            }
            else {
                commentaire.setCommentaire("Très bien Frangin");
                commentaire.setDateCommentaire(new Date());
                commentaire.setSolution(solution);
                commentaire.setUtilisateur(user);
                commentaireService.AjoutCommentaire(commentaire);
                System.out.println("Commentaire Ajouté avec succès");
            }
        }
*/

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