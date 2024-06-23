package com.assignment.journal.Service;

import com.assignment.journal.Dao.Journal;
import com.assignment.journal.Repos.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService {

    @Autowired
    private JournalRepository journalRepository;

    public void saveJournal(Journal journal) {
        journalRepository.save(journal);
    }

    public List<Journal> getAllJournals() {
        return journalRepository.findAll();
    }
}
