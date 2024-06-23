package com.assignment.journal.Controller;

import com.assignment.journal.Dao.Journal;
import com.assignment.journal.Service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/journals")
public class JournalController {

    @Autowired
    private JournalService journalService;

    @GetMapping
    public ResponseEntity<List<Journal>> getAllJournals() {
        return ResponseEntity.ok(journalService.getAllJournals());
    }
}

