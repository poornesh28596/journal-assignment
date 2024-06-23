package com.assignment.journal.Service;

import com.assignment.journal.Dao.Journal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJournalConsumerService {
    @Autowired
    private JournalService journalService;

    @KafkaListener(topics = "user-event", groupId = "journal-group")
    public void consume(String message) {
        Journal journal = new Journal();
        journal.setEvent(message);
        journalService.saveJournal(journal);
        System.out.println("Consumed message: " + message);
    }
}
