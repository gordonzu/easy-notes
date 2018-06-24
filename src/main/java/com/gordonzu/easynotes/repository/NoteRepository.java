package com.gordonzu.easynotes.repository;

import com.gordonzu.easynotes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface NoteRepository extends JpaRepository<Note, Long> {
}
