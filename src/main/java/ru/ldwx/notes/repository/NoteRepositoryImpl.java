package ru.ldwx.notes.repository;

import org.springframework.stereotype.Repository;
import ru.ldwx.notes.model.Note;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class NoteRepositoryImpl implements NoteRepository{
    private Map<Integer, Note> storage = new ConcurrentHashMap<>();
    private AtomicInteger idGenerator = new AtomicInteger(10001);

    @Override
    public Note save(Note note) {
        if (note.isNew()) {
            note.setId(idGenerator.incrementAndGet());
        }
        return storage.put(note.getId(), note);
    }

    @Override
    public boolean delete(int id) {
        return storage.remove(id) != null;
    }

    @Override
    public Note get(int id) {
        return storage.get(id);
    }

    @Override
    public Collection<Note> getAll() {
        return storage.values();
    }
}
