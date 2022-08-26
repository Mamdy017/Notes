package com.ErrorNotes.Notes.Controllers;

import com.ErrorNotes.Notes.Services.EtatService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/etat")
public class EtatController {

    @Autowired
    final private EtatService etatService;

    @PostMapping("/insererEtat")
    String InsererEtat(){
        etatService.insertDefault();
        return "Etat Inserer avec success";

    }


}
