package ru.ldwx.notes.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static ru.ldwx.notes.TestData.NOTE1;

@ContextConfiguration({
        "classpath:spring/spring-app.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
public class NoteServiceTest {
    @Autowired
    private NoteService service;

    @Test
    public void save() {
        service.save(NOTE1);
        Assert.assertEquals(1, service.getAll().size());
    }

    @Test
    public void delete() {
    }

    @Test
    public void get() {
    }

    @Test
    public void getAll() {
    }
}