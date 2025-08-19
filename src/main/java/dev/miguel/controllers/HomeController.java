package dev.miguel.controllers;

import dev.miguel.db.DiaryDatabase;
import dev.miguel.repositories.EntryRepository;
import dev.miguel.views.HomeView;

public class HomeController {
    
    DiaryDatabase database = new DiaryDatabase();

        EntryRepository repository = new EntryRepository(database);
        EntryController controller = new EntryController(repository);

    public HomeController() {
        index();
    } 

    public void index() {
        HomeView homeView = new HomeView(controller);
        homeView.render();
    }

}