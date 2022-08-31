package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Solution;
import com.ErrorNotes.Notes.Modeles.Utilisateur;

public interface SolutionService {

   public Solution creer(Solution solution);
    public String supprimer(Long id_solution);
    Object solution(long id);


}
