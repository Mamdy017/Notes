package com.ErrorNotes.Notes.Controllers;

import com.ErrorNotes.Notes.Modeles.Commentaire;
import com.ErrorNotes.Notes.Services.CommentaireService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "COmmentaire")
@RequestMapping("/commentaire")
public class CommentaireController {
    @Autowired
    public CommentaireService commentaireService;
    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/ajouter")
    public Commentaire commentaire(@RequestBody Commentaire commentaire){
        return commentaireService.creer(commentaire);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/supprimer/{id_user}")
    public String supprimer(@PathVariable long id_user){
        return commentaireService.supprimer(id_user);
    }
}
