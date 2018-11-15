package ru.ldwx.notes.service;

import ru.ldwx.notes.model.Note;

import java.util.Collection;

public interface NoteService {
    Note save(Note note);

    boolean delete(int id);

    Note get(int id);

    Collection<Note> getAll();
}
