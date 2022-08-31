package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Modeles.Solution;
import com.ErrorNotes.Notes.Repositories.ProblemeRepository;
import com.ErrorNotes.Notes.Repositories.SolutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SolutionServiceImpl implements SolutionService {

    @Autowired
     public SolutionRepository solutionRepository;
    public  ProblemeRepository problemeRepository;
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

    @Override
    public Object solution(long idprobleme) {
        Solution solution= solutionRepository.solution(idprobleme);
        if (solution==null){
            return "Pas de solution relative à ce probleme";
        }  else {
         return
                 "Nom :\t\t" + solution.getProbleme().getUtilisateur().getNom()+
                 "\nprenom :\t" + solution.getProbleme().getUtilisateur().getPrenom()+
                 "\nContact :\t" + solution.getProbleme().getUtilisateur().getContact()+
                 "\nTitre du probleme :"+ solution.getProbleme().getTitre() +
                 "\nDescription du probleme :"+ solution.getProbleme().getDescription() +
                 "\nTemps passer sur le probleme :"+ solution.getProbleme().getTemps() +
                 "\nTitre du probleme :"+ solution.getProbleme().getEtat().getEtat() +
                 "\nSolution :" +solution.getDescription()+
                 "\nlien: " +solution.getLien()+
                 "\nTuto: " +solution.getTuto()+
                 "\nMethode: " +solution.getMethode()+
                 "\nSite: " +solution.getSite();

        }
       // return solutionRepository.solution(idprobleme);
    }

}
