package com.ErrorNotes.Notes.Repositories;

import com.ErrorNotes.Notes.Modeles.Etat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface EtatRepository extends JpaRepository<Etat,Long> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO etat(etat) values('initié') ,('encours'),('résolu'),('fermé')",nativeQuery = true)
    void insererEtat();
}
