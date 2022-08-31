package com.ErrorNotes.Notes.Controllers;

import com.ErrorNotes.Notes.Modeles.Solution;
import com.ErrorNotes.Notes.Services.SolutionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "Solution")
@RequestMapping("/solution")
public class SolutionController {

    @Autowired
    public SolutionService solutionService;

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/creer")
    public Solution create(@RequestBody Solution solution){
        return solutionService.creer(solution);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/supprimer/{id_solution}")
    public String suppr(@PathVariable Long id_solution){
        return solutionService.supprimer(id_solution);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/afficher/{idprobleme}")
    public Object solution(@PathVariable long idprobleme ){
        return solutionService.solution(idprobleme);
    }

}
