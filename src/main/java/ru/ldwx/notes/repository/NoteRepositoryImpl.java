package ru.ldwx.notes.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.ldwx.notes.model.Note;

import java.util.Collection;

@Repository
public class NoteRepositoryImpl implements NoteRepository{
    @Autowired
    private CrudNoteRepository repository;

    @Override
    public Note save(Note note) {
        return repository.save(note);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id) != 0;
    }

    @Override
    public Note get(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Collection<Note> getAll() {
        return repository.findAll();
    }
}
