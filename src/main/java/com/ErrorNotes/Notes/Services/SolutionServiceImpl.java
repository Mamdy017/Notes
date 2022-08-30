package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Solution;
import com.ErrorNotes.Notes.Repositories.SolutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SolutionServiceImpl implements SolutionService {

    @Autowired
     public SolutionRepository solutionRepository;
    @Override
    public Solution creer(Solution solution) {
        return solutionRepository.save(solution);
    }

    @Override
    public String supprimer(Long id_solution) {
        Solution solution=solutionRepository.findById(id_solution).orElse(null);
        if (solution==null) return "Cette solution n'existe pas";
        else {
            solutionRepository.deleteById(id_solution);
            return "Suppression effectuée !";
        }

    }
}
