package com.ErrorNotes.Notes.Services;

import com.ErrorNotes.Notes.Modeles.Commentaire;

public interface CommentaireService {

    public Commentaire creer(Commentaire commentaire);
    public String supprimer(long id_commentaire);
}
