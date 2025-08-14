package dev.miguel;

import dev.miguel.controllers.EntryController;
import dev.miguel.db.DiaryDatabase;
import dev.miguel.repositories.EntryRepository;
import dev.miguel.views.HomeView;

public class App {
    public static void main(String[] args) {
        // Crear base de datos en memoria
        DiaryDatabase database = new DiaryDatabase();

        // Crear repositorio y controlador
        EntryRepository repository = new EntryRepository(database);
        EntryController controller = new EntryController(repository);

        // Mostrar el menú principal
        HomeView homeView = new HomeView(controller);
        homeView.render();
    }
}
