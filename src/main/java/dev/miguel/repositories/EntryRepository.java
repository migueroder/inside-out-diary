package dev.miguel.repositories;

import dev.miguel.db.DiaryDatabase;
import dev.miguel.dtos.EntryDTO;
import dev.miguel.models.Entry;

public class EntryRepository {

    private final DiaryDatabase database;

    public EntryRepository(DiaryDatabase database) {
        this.database = database;
    }

    public void save(EntryDTO dto) {
        Entry entry = new Entry(dto.getTitle(), dto.getDate(), dto.getDescription(), dto.getEmotion());
        database.getEntries().add(entry);
    }
}
