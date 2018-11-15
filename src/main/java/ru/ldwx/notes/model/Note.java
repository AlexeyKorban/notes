package ru.ldwx.notes.model;

import java.time.LocalDateTime;

public class Note extends AbstractBaseEntity{
    private String content;
    private LocalDateTime created;
    private boolean done;

    public Note(int id, String content, LocalDateTime created, boolean done) {
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
