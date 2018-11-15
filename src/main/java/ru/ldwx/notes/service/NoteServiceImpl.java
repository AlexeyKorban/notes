package ru.ldwx.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ldwx.notes.model.Note;
import ru.ldwx.notes.repository.NoteRepository;

import java.util.Collection;

@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository repository;

    @Autowired
    public NoteServiceImpl(NoteRepository repository) {
        this.repository = repository;
    }

    @Override
    public Note save(Note note) {
        return repository.save(note);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }

    @Override
    public Note get(int id) {
        return repository.get(id);
    }

    @Override
    public Collection<Note> getAll() {
        return repository.getAll();
    }
}
