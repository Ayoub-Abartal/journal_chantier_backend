package com.abartal.Journal_chantier.services.journal_service;

import com.abartal.Journal_chantier.entities.Journal;
import com.abartal.Journal_chantier.entities.Project;
import com.abartal.Journal_chantier.repositories.JournalRepository;
import com.abartal.Journal_chantier.repositories.ProjectRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalServiceImpl implements JournalService{

    private JournalRepository journalRepository;

    private ProjectRepository projectRepository;

    public JournalServiceImpl(JournalRepository journalRepository, ProjectRepository projectRepository){
        this.journalRepository = journalRepository;
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Journal> getAllJournals() {
        return journalRepository.findAll();
    }

    @Override
    public Journal getJournal(Long journal_id) throws Exception {

        return journalRepository.findById(journal_id).orElseThrow(()->new Exception("Journal not found"));
    }

    @Override
    @Transactional
    public Journal addJournal(Journal journal, Long project_id) throws Exception {
        Project project = projectRepository.findById(project_id).orElseThrow(()-> new Exception("Project not found"));

        journal.setProject(project);
        return journalRepository.save(journal);

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
