package com.abartal.Journal_chantier.repositories;

import com.abartal.Journal_chantier.entities.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepository extends JpaRepository<Journal,Long> {

}
