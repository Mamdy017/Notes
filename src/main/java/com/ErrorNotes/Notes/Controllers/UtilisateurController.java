package com.ErrorNotes.Notes.Controllers;


import com.ErrorNotes.Notes.Modeles.Role;
import com.ErrorNotes.Notes.Modeles.Utilisateur;
import com.ErrorNotes.Notes.Services.UtilisateurService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;

@RestController
@Api(value = "Utilisateur")
@RequestMapping("/users")
public class UtilisateurController {


    //Appel de la classe service.

    @Autowired
    UtilisateurService utilisateurService ;

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("creer")
    public Object create (@RequestBody Utilisateur utilisateur){
        //try {
            return utilisateurService.creer(utilisateur);
        /*} catch (DataIntegrityViolationException e) {
            return "Cet utilisateur existe déjà !";
        }*/

    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/update/{id}")
    public  String update(@RequestBody Utilisateur utilisateur,@PathVariable Long id){
        return utilisateurService.Modifier(utilisateur,id);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/modifier_mdp/{id}/{mdp}")
    public String update (@PathVariable Long id, @RequestBody String mdp){
        return utilisateurService.changerMotdepasse(id, mdp);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/modifier_nom/{id}/{nom}")
    public String modifier (@PathVariable Long id, @RequestBody String nom){
        return utilisateurService.changerNom(id, nom);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
   @PutMapping("/role/{id_utilisateur}/{id_role}")
    public String donner(@PathVariable long id_utilisateur, @PathVariable long id_role){
        return utilisateurService.donnerRole(id_utilisateur,id_role);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/user/{id}")
    public String supprimer(@PathVariable long id){
        return utilisateurService.supprimer(id);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/connecter")
    public Object connecter(@Param("contact") String contact,@Param("motdepasse") String mdp) {
        try {
            return utilisateurService.connecter(contact,mdp);
        } catch (NullPointerException e) {
            return "Cet utilisateur n'existe pas !";
        }

    }



}
