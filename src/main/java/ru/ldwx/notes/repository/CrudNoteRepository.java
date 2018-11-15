package ru.ldwx.notes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.ldwx.notes.model.Note;

import java.util.List;
import java.util.Optional;

public interface CrudNoteRepository extends JpaRepository<Note, Integer> {

    @Transactional
    @Modifying
    @Query("DELETE FROM Note n WHERE n.id=:id")
    int delete(@Param("id") int id);

    @Override
    @Transactional
    Note save(Note note);

    @Override
    Optional<Note> findById(Integer id);

    @Override
    List<Note> findAll();
}
