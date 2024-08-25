package com.abartal.Journal_chantier.services.journal_service;

import com.abartal.Journal_chantier.entities.Journal;

import java.util.List;

public interface JournalService {

    List<Journal> getAllJournals();

    Journal getJournal(Long journal_id) throws Exception;

    Journal addJournal(Journal journal, Long project_id) throws Exception;

    Journal updateJournal(Journal journal, Long journal_id);

    Journal deleteJournal(Long journal_id);

}
