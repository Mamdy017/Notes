package com.ErrorNotes.Notes.Controllers;

import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Modeles.Utilisateur;
import com.ErrorNotes.Notes.Repositories.ProblemeRepository;
import com.ErrorNotes.Notes.Repositories.UtilisateurRepository;
import com.ErrorNotes.Notes.Services.ProblemeService;
import com.ErrorNotes.Notes.Services.ProblemeServiceImpl;
import com.ErrorNotes.Notes.Services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.beans.BeanProperty;
import java.util.List;

@RestController
@RequestMapping("/probleme")
public class ProblemeController {
    @BeanProperty
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Autowired
    ProblemeService problemeService;
    @Autowired
    UtilisateurRepository utilisateurRepository;
    @Autowired
    UtilisateurService utilisateurService;

    @PostMapping("/poserprobleme/{contact}/{mdp}")
    public Object create(@RequestBody Probleme probleme,@PathVariable String contact,@PathVariable String mdp) {
        Utilisateur utilisateur=utilisateurRepository.findByContact(contact);

        try {
            if (passwordEncoder().matches(mdp,utilisateur.getMotdepasse())) {
            return problemeService.poserProbleme(probleme);
        }else {
            return "Mot de passe incorrect";
        }

        }catch (Exception e){
            return "Une erreur est survenue";
        }


    }
    @PutMapping("/changeretat/{idprobleme}/{idetat}")
    public String changerEtat(@PathVariable("idprobleme") long id_probleme,@PathVariable("idetat") long id_etat) {
        return problemeService.changerEtatProbleme(id_probleme,id_etat);
    }
    @GetMapping("/afficher")
    public Object afficherProbleme(){
        return problemeService.afficherProbleme();
    }
    @GetMapping("/rechercher/{motcle}")
    public Object rechercherMotCle(@PathVariable("motcle") String motcle) {
        return problemeService.rechercherParMotCle(motcle);
    }
}
