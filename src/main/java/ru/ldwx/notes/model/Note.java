package ru.ldwx.notes.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "notes")
public class Note extends AbstractBaseEntity{
    private String content;
    private LocalDateTime created;
    private boolean done;

    public Note() {
    }

    public Note(Note note) {
        this(note.getId(), note.getContent(), note.getCreated(), note.isDone());
    }

    public Note(Integer id, String content, LocalDateTime created, boolean done) {
        super(id);
        this.content = content;
        this.created = created;
        this.done = done;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
