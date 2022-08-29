package com.ErrorNotes.Notes.Controllers;


import com.ErrorNotes.Notes.Modeles.Role;
import com.ErrorNotes.Notes.Modeles.Utilisateur;
import com.ErrorNotes.Notes.Services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UtilisateurController {

    //Appel de la classe repositories pour la persistance des données.
    @Autowired
    public UtilisateurService utilisateurService ;

    //Fonctionnialité de commenter par l'utilisateur
    /*@Override
    @PostMapping("/commenter/{id}")
    public Commentaire create (@RequestBody Utilisateur utilisateur) {
        return utilisateurService.commenter(id_solution);
    }**/

    @PostMapping("Creer")
    public Utilisateur create (@RequestBody Utilisateur utilisateur){
        return utilisateurService.creer(utilisateur);
    }

    @PutMapping("/modifier_mdp/{id}")
    public String update (@PathVariable Long id, @RequestBody Utilisateur utilisateur){
        return utilisateurService.changerMotdepasse(utilisateur.getId());
    }

    @PutMapping("/modifier_nom/{id}")
    public Utilisateur modifier (@PathVariable Long id, @RequestBody Utilisateur utilisateur){
        return utilisateurService.changerNom(utilisateur.getNom());
    }

   @GetMapping("/role/{id}")
    public Utilisateur donner  (@PathVariable Long id, @RequestBody Utilisateur utilisateur){
        return utilisateurService.donnerRole(String.valueOf(id));
    }



}
