package com.ErrorNotes.Notes.Controllers;

import com.ErrorNotes.Notes.Modeles.Solution;
import com.ErrorNotes.Notes.Services.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/solution")
public class SolutionController {

    @Autowired
    public SolutionService solutionService;


    @PostMapping("/creer")
    public Solution create(@RequestBody Solution solution){
        return solutionService.creer(solution);
    }
    @DeleteMapping("/supprimer/{id_solution}")
    public String suppr(@PathVariable Long id_solution){
        return solutionService.supprimer(id_solution);
    }
    @GetMapping("/afficher/{idprobleme}")
    public Object solution(@PathVariable long idprobleme ){
        return solutionService.solution(idprobleme);
    }

}
