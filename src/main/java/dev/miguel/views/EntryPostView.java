package dev.miguel.views;

import dev.miguel.controllers.EntryController;
import java.util.Scanner;

public class EntryPostView extends View {

    private final EntryController controller;
    private final Scanner sc = new Scanner(System.in);

    public EntryPostView(EntryController controller) {
        this.controller = controller;
    }

    public void render() {
        System.out.println("\nIngrese el título:");
        String title = sc.nextLine();

        System.out.println("Ingresa la fecha (dd/mm/yyyy):");
        String date = sc.nextLine();

        System.out.println("Ingrese la descripción:");
        String description = sc.nextLine();

        System.out.println("\nSelecciona una emoción:");
        System.out.println("1. Alegría\n2. Tristeza\n3. Ira\n4. Asco\n5. Miedo\n6. Ansiedad\n7. Envidia\n8. Vergüenza\n9. Aburrimiento\n10. Nostalgia");
        int emotion = Integer.parseInt(sc.nextLine());

        controller.addEntry(title, date, description, emotion);

        System.out.println("Momento vivido añadido correctamente.\n");
        // Aquí termina, y el control regresa a HomeView
    }
}
