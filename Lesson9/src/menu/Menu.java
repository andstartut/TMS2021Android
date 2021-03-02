package menu;

import inputs.Console;
import interfaces.IMenu;
import store.Store;

public class Menu implements IMenu {
    Store store;

    public Menu(Store store) {
        this.store = store;
    }

    public void getMainMenu() {
        System.out.println("--------------------------");
        System.out.println("Choose from these choices:");
        System.out.println("1: Get list of all products");
        System.out.println("2: Add product");
        System.out.println("3: Delete product");
        System.out.println("4: Edit product");
        System.out.println("5: Quit");
        consoleListener();
    }

    private void consoleListener() {
        switch (Console.input().nextInt()) {
            case 1 -> {
                new AllProductsSubmenu(store).getSubmenu();
                getMainMenu();
            }
            case 2 -> {
                new AddProductSubmenu(store).getSubmenu();
                getMainMenu();
            }
            case 3 -> {
                new DeleteProductSubmenu(store).getSubmenu();
                getMainMenu();
            }
            case 4 -> {
                new EditProductSubmenu(store).getSubmenu();
                getMainMenu();
            }
            case 5 -> System.exit(0);
        }
    }
}
