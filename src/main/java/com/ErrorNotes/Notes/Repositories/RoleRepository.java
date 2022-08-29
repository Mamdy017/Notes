package com.ErrorNotes.Notes.Repositories;

import com.ErrorNotes.Notes.Modeles.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;


public interface RoleRepository extends JpaRepository<Role,Long> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO `role` (`role`) VALUES ('admin'), ('user');",nativeQuery = true )
    void insererRole();
}
