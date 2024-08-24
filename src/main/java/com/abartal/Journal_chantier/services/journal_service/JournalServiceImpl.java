package com.abartal.Journal_chantier.services.journal_service;

import com.abartal.Journal_chantier.entities.Journal;
import com.abartal.Journal_chantier.repositories.JournalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalServiceImpl implements JournalService{

    private JournalRepository journalRepository;

    public JournalServiceImpl(JournalRepository journalRepository){
        this.journalRepository = journalRepository;
    }

    @Override
    public List<Journal> getAllJournals() {
        return journalRepository.findAll();
    }

    @Override
    public Journal getJournal(Long journal_id) {
        return null;
    }

    @Override
    public Journal addJournal(Journal journal) {
        return null;
    }

    @Override
    public Journal updateJournal(Journal journal, Long journal_id) {
        return null;
    }

    @Override
    public Journal deleteJournal(Long journal_id) {
        return null;
    }
}
