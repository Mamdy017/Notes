package com.ErrorNotes.Notes.Controllers;


import com.ErrorNotes.Notes.Modeles.Role;
import com.ErrorNotes.Notes.Modeles.Utilisateur;
import com.ErrorNotes.Notes.Services.UtilisateurService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UtilisateurController {


    //Appel de la classe service.

    @Autowired
    UtilisateurService utilisateurService ;

    @PostMapping("creer")
    public Utilisateur create (@RequestBody Utilisateur utilisateur){

        return utilisateurService.creer(utilisateur);
    }
@PutMapping("/update/{id}")
    public  String update(@RequestBody Utilisateur utilisateur,@PathVariable Long id){
        return utilisateurService.Modifier(utilisateur,id);
    }
    @PutMapping("/modifier_mdp/{id}/{mdp}")
    public String update (@PathVariable Long id, @RequestBody String mdp){
        return utilisateurService.changerMotdepasse(id, mdp);
    }

    @PutMapping("/modifier_nom/{id}/{nom}")
    public String modifier (@PathVariable Long id, @RequestBody String nom){
        return utilisateurService.changerNom(id, nom);
    }

   @PutMapping("/role/{id_utilisateur}/{id_role}")
    public String donner(@PathVariable long id_utilisateur, @PathVariable long id_role){
        return utilisateurService.donnerRole(id_utilisateur,id_role);
    }

    @DeleteMapping("/user/{id}")
    public String supprimer(@PathVariable long id){
        return utilisateurService.supprimer(id);
    }



}
