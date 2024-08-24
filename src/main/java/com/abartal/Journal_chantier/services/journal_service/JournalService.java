package com.abartal.Journal_chantier.services.journal_service;

import com.abartal.Journal_chantier.entities.Journal;

import java.util.List;

public interface JournalService {

    List<Journal> getAllJournals();

    Journal getJournal(Long journal_id);

    Journal addJournal(Journal journal);

    Journal updateJournal(Journal journal, Long journal_id);

    Journal deleteJournal(Long journal_id);

}
