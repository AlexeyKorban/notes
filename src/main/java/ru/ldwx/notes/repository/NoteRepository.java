package ru.ldwx.notes.repository;

import ru.ldwx.notes.model.Note;

import java.util.Collection;

public interface NoteRepository {
    Note save(Note note);

    boolean delete(int id);

    Note get(int id);

    Collection<Note> getAll();
}
