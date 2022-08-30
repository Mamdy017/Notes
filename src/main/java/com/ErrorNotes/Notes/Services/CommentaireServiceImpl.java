package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Commentaire;
import com.ErrorNotes.Notes.Repositories.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentaireServiceImpl implements CommentaireService {

    @Autowired
    public CommentaireRepository commentaireRepository;
    @Override
    public Commentaire creer(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }

    @Override
    public String supprimer(long id_commentaire) {
        Commentaire commentaire=commentaireRepository.findById(id_commentaire).orElse(null);
        if (commentaire==null) return "Cet commentaire n'existe pas ";
        else {
            commentaireRepository.deleteById(id_commentaire);
            return "Commentaire supprimé avec succès";
        }
    }
}
