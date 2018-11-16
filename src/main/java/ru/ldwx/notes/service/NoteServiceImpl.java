package ru.ldwx.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ldwx.notes.model.Note;
import ru.ldwx.notes.repository.NoteRepository;

import java.util.Collection;

import static ru.ldwx.notes.util.ValidationUtil.checkNotFound;

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
    public void delete(int id) {
        checkNotFound(repository.delete(id), "id = " + id);
    }

    @Override
    public Note get(int id) {
        return checkNotFound(repository.get(id), "id = " + id);
    }

    @Override
    public Collection<Note> getAll() {
        return repository.getAll();
    }
}
