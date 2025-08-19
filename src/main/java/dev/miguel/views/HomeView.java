package dev.miguel.views;

import dev.miguel.controllers.EntryController;
import java.util.Scanner;

public class HomeView extends View {

    private final EntryController entryController;
    private final Scanner sc = new Scanner(System.in);

    public HomeView(EntryController entryController) {
        this.entryController = entryController;
    }

    public void render() {
    while (true) {
        System.out.println("\nMy Diario:");
        System.out.println("1. Añadir momento");
        System.out.println("2. Ver todos los momentos disponibles");
        System.out.println("3. Eliminar un momento");
        System.out.println("4. Filtrar los momentos");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        int option = Integer.parseInt(sc.nextLine());

        switch (option) {
            case 1:
                new EntryPostView(entryController).render(); // ejecuta UNA VEZ y vuelve al menú
                break;
            case 2:
                new EntryListView(entryController).render();
                break;
            case 5:
                System.out.println("Saliendo...");
                return;
            default:
                System.out.println("Opción no válida.");
            }
        }
    }

}
