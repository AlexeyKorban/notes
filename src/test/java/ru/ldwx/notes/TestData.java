package ru.ldwx.notes;

import ru.ldwx.notes.model.Note;

import java.time.LocalDateTime;

public class TestData {
    public static final int NOTE1_ID = 10000;
    public static final int NOTE2_ID = 10001;

    public static final Note NOTE1 = new Note(NOTE1_ID, "Тесты это прекрасно", LocalDateTime.now(), false);
    public static final Note NOTE2 = new Note(NOTE1_ID, "Тесты это отлично", LocalDateTime.MAX, false);
    public static final Note NOTE3 = new Note(NOTE1_ID, "Тесты это полезно", LocalDateTime.MIN, true);
}
