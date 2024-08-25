package com.abartal.Journal_chantier.web;

import com.abartal.Journal_chantier.entities.Journal;
import com.abartal.Journal_chantier.services.journal_service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JournalController {


    @Autowired
    private JournalService journalService;

    public JournalController(JournalService journalService) {
        this.journalService = journalService;
    }

    /***
     *
     * CREATE Operation
     *
     * */

    @PostMapping(path="/journal/add/{project_id}")
    public ResponseEntity<Journal> createProject(@RequestBody Journal journal, @PathVariable Long project_id){
        try{
            Journal createdJournal = journalService.addJournal(journal,project_id);

            return ResponseEntity.ok(createdJournal);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    /***
     *
     * Search Operations
     *
     * */

    @GetMapping(path="journal/search/{journal_id}")
    public ResponseEntity<Journal> getJournal(@PathVariable Long journal_id) {
        try {
            Journal searchedJournal = journalService.getJournal(journal_id);
            return ResponseEntity.ok(searchedJournal);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

}
