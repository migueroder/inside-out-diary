package dev.miguel.controllers;

import java.util.List;
import dev.miguel.models.Entry;
import dev.miguel.dtos.EntryDTO;
import dev.miguel.repositories.EntryRepository;

public class EntryController {

    private final EntryRepository repository;

    public EntryController(EntryRepository repository) {
        this.repository = repository;
    }

    public void addEntry(String title, String date, String description, int emotion) {
        EntryDTO dto = new EntryDTO(title, date, description, emotion);
        repository.save(dto);
    }

    public List<Entry> getAllEntries() {
    return repository.findAll();
    }
}
