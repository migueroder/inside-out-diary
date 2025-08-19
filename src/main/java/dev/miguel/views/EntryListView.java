package dev.miguel.views;

import dev.miguel.controllers.EntryController;
import dev.miguel.models.Entry;
import java.util.List;

public class EntryListView extends View {

    private final EntryController controller;

    public EntryListView(EntryController controller) {
        this.controller = controller;
    }

    public void render() {
        List<Entry> entries = controller.getAllEntries();

        if (entries.isEmpty()) {
            System.out.println("\nNo hay momentos registrados aún.");
        } else {
            System.out.println("\nLista de momentos vividos:");
            int index = 1;
            for (Entry entry : entries) {
                System.out.println(index + ". Ocurrió el: " + entry.getDate()
                        + ". Título: " + entry.getTitle()
                        + ". Descripción: " + entry.getDescription());
                index++;
            }
        }
    }
}
