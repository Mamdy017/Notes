package com.ErrorNotes.Notes.Controllers;

import com.ErrorNotes.Notes.Modeles.Commentaire;
import com.ErrorNotes.Notes.Services.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/commentaire")
public class CommentaireController {
    @Autowired
    public CommentaireService commentaireService;

    @PostMapping("/ajouter")
    public Commentaire commentaire(@RequestBody Commentaire commentaire){
        return commentaireService.creer(commentaire);
    }

    @PostMapping("/supprimer/{id_user}")
    public String supprimer(@PathVariable long id_user){
        return commentaireService.supprimer(id_user);
    }
}
