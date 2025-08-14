package dev.miguel.controllers;

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
}
