package menu;

import inputs.Console;
import interfaces.IMenu;
import store.Store;

public class Menu implements IMenu {
    Store store;
    private static final int ALL_PRODUCTS = 1;
    private static final int ADD_PRODUCT = 2;
    private static final int ADD_MORE_PRODUCTS = 3;
    private static final int DELETE_PRODUCTS = 4;
    private static final int EDIT_PRODUCT = 5;
    private static final int BUY_PRODUCTS = 6;
    private static final int ACCOUNTING = 7;
    private static final int QUIT = 8;

    public Menu(Store store) {
        this.store = store;
    }

    public void getMainMenu() {
        System.out.println("--------------------------");
        System.out.println("Choose from these choices:");
        System.out.println("1: Get list of all products");
        System.out.println("2: Add product");
        System.out.println("3: Add more products");
        System.out.println("4: Delete products");
        System.out.println("5: Edit product");
        System.out.println("6: Buy products");
        System.out.println("7: Accounting");
        System.out.println("8: Quit");
        consoleListener();
    }

    private void consoleListener() {
        switch (Console.input().nextInt()) {
            case ALL_PRODUCTS -> {
                new AllProductsSubmenu(store).getSubmenu();
                getMainMenu();
            }
            case ADD_PRODUCT -> {
                new AddProductSubmenu(store).getSubmenu();
                getMainMenu();
            }
            case ADD_MORE_PRODUCTS -> {
                new AddMoreProductsSubmenu(store).getSubmenu();
                getMainMenu();
            }
            case DELETE_PRODUCTS -> {
                new DeleteProductSubmenu(store).getSubmenu();
                getMainMenu();
            }
            case EDIT_PRODUCT -> {
                new EditProductSubmenu(store).getSubmenu();
                getMainMenu();
            }
            case BUY_PRODUCTS -> {
                new BuyProductsSubmenu(store).getSubmenu();
                getMainMenu();
            }
            case ACCOUNTING -> {
                new AccountingSubmenu(store).getSubMenu();
                getMainMenu();
            }
            case QUIT -> System.exit(0);
        }
        System.out.println("You input wrong value");
        getMainMenu();
    }
}
