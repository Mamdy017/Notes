package com.ErrorNotes.Notes.Repositories;

import com.ErrorNotes.Notes.Modeles.Solution;
import com.ErrorNotes.Notes.Modeles.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SolutionRepository extends JpaRepository<Solution,Long> {

    @Query(value = "SELECT * FROM `solution`,probleme,utilisateur,commentaire,etat WHERE solution.probleme_id=:id AND probleme.etat_id=etat.id AND probleme.utilisateur_id=utilisateur.id AND commentaire.solution_id=solution.id;",nativeQuery = true)
    public Solution solution(long id);


}
