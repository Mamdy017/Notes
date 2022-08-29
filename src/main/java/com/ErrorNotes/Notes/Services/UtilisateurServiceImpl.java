package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Probleme;
import com.ErrorNotes.Notes.Modeles.Role;
import com.ErrorNotes.Notes.Modeles.Utilisateur;
import com.ErrorNotes.Notes.Repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    public UtilisateurRepository utilisateurRepository;

    @Override
    public Probleme poserProbleme() {
        return null;
    }

    @Override
    public String changerMotdepasse(long id, String mdp) {

        Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
            if (utilisateur==null)
                return "Cet utilisateur n'existe pas !";
            else {
                utilisateur.setMotdepasse(mdp);
                utilisateurRepository.save(utilisateur);
                return "Le Mot de passe de " + utilisateur.getNom() +" a été changé avec succès !";
            }

}

    @Override
    public String changerNom(long id_user, String nom) {
        Utilisateur utilisateur=utilisateurRepository.findById(id_user).orElse(null);
        if (utilisateur==null) return "Cet utilisateur n'existe pas !";
        else {
            utilisateur.setNom(nom);
            utilisateurRepository.save(utilisateur);
            return "Le nom a été changé avec succès !";
        }

    }

    @Override
    public String donnerRole(long id_utilisateur,long id_role) {
        Utilisateur utilisateurcourant = utilisateurRepository.findById(id_utilisateur).orElse(null);
        if(utilisateurcourant == null) return "Cet utilisateur n'existe pas !";
        else {
            utilisateurcourant.setRole(new Role(id_role));
            utilisateurRepository.save(utilisateurcourant);
            return "Le rôle a été changé en "+ utilisateurcourant.getRole().getRole() +" avec succès";
        }

    }

    @Override
    public Utilisateur creer(Utilisateur utilisateur) {

        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public String supprimer(Long id) {
        Utilisateur utilisateur=utilisateurRepository.findById(id).orElse(null);
        if (utilisateur==null) return "Cet utilisateur n'exixte pas";
        else {
            utilisateur.getId();
            utilisateurRepository.deleteById(id);
            return "L'utilisateur a été supprimer avec succès";
        }

    }

}
