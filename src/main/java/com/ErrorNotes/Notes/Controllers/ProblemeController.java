package com.ErrorNotes.Notes.Controllers;

import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Services.ProblemeServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "Problème")
@RequestMapping("/probleme")
public class ProblemeController {
    @Autowired
    ProblemeServiceImpl problemeServiceimpl;

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/poserprobleme")
    public Object create(@RequestBody Probleme probleme) {
        return problemeServiceimpl.poserProbleme(probleme);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/changeretat/{idprobleme}/{idetat}")
    public String changerEtat(@PathVariable("idprobleme") long id_probleme,@PathVariable("idetat") long id_etat) {
        return problemeServiceimpl.changerEtatProbleme(id_probleme,id_etat);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/afficher")
    public Object afficherProbleme(){
        return problemeServiceimpl.afficherProbleme();
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/rechercher/{motcle}")
    public Object rechercherMotCle(@PathVariable("motcle") String motcle) {
        return problemeServiceimpl.rechercherParMotCle(motcle);
    }
}
