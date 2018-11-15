package ru.ldwx.notes;

import ru.ldwx.notes.model.Note;

import java.time.LocalDateTime;

import static ru.ldwx.notes.model.AbstractBaseEntity.START_SEQ;

public class TestData {
    public static final int NOTE1_ID = START_SEQ;
    public static final int NOTE2_ID = START_SEQ + 1;
    public static final int NOTE3_ID = START_SEQ + 2;

    public static final Note NOTE1 = new Note(NOTE1_ID, "Тесты это прекрасно", LocalDateTime.now(), false);
    public static final Note NOTE2 = new Note(NOTE2_ID, "Тесты это отлично", LocalDateTime.of(2018, 11, 15, 15, 0), false);
    public static final Note NOTE3 = new Note(NOTE3_ID, "Тесты это полезно", LocalDateTime.of(2018, 11, 15, 16, 0), true);
}
