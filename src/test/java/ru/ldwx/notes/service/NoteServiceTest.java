package ru.ldwx.notes.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.ldwx.notes.model.Note;

import java.time.LocalDateTime;
import java.util.Arrays;

import static ru.ldwx.notes.TestData.*;

@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
@Sql(scripts = "classpath:db/populateDB.sql", config = @SqlConfig(encoding = "UTF-8"))
public class NoteServiceTest {
    @Autowired
    private NoteService service;

    @Test
    public void save() {
        service.save(new Note(null, "Test", LocalDateTime.of(2018, 11, 15, 18, 0), false));
        Assert.assertEquals(3, service.getAll().size());
    }

    @Test
    public void delete() {
        service.delete(NOTE1_ID);
        Assert.assertEquals(1, service.getAll().size());
    }

    @Test
    public void get() {
        assertMatch(NOTE1, service.get(NOTE1_ID));
    }

    @Test
    public void getAll() {
        assertMatch(Arrays.asList(NOTE1, NOTE2), service.getAll());
    }
}