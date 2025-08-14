package dev.miguel.db;

import dev.miguel.models.Entry;
import java.util.ArrayList;
import java.util.List;

public class DiaryDatabase {
    private final List<Entry> entries = new ArrayList<>();

    public List<Entry> getEntries() {
        return entries;
    }
}
