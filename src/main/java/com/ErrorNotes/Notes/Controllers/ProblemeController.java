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
    public Probleme create(@RequestBody Probleme probleme) {
        return problemeServiceimpl.poserProbleme(probleme);
    }
}
