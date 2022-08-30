package com.ErrorNotes.Notes.Controllers;

import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Services.ProblemeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/probleme")
public class ProblemeController {
    @Autowired
    ProblemeServiceImpl problemeServiceimpl;
    @PostMapping("/poserprobleme")
    public Object create(@RequestBody Probleme probleme) {
        return problemeServiceimpl.poserProbleme(probleme);
    }
    @PutMapping("/changeretat/{idprobleme}/{idetat}")
    public String changerEtat(@PathVariable("idprobleme") long id_probleme,@PathVariable("idetat") long id_etat) {
        return problemeServiceimpl.changerEtatProbleme(id_probleme,id_etat);
    }
    @GetMapping("/rechercher/{motcle}")
    public Object rechercherMotCle(@PathVariable("motcle") String motcle) {
        return problemeServiceimpl.rechercherParMotCle(motcle);
    }
}
