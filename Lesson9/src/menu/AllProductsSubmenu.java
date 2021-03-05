package menu;

import exceptions.SearchProductException;
import inputs.Console;
import outputs.ListFilter;
import products.Product;
import store.Store;

import java.util.List;

class AllProductsSubmenu extends Menu {
    private static final int SORT_BY_PRICE = 1;
    private static final int SORT_BY_QUEUE = 2;
    protected AllProductsSubmenu(Store store) {
        super(store);
    }

    protected void getSubmenu() {
        System.out.println("What kind of sorting do you want?");
        System.out.println("1. Sort by price");
        System.out.println("2. Sort by queue");
        consoleListener();
    }

    private void consoleListener() {
        switch (Console.input().nextInt()) {
            case SORT_BY_PRICE -> {
                try {
                    System.out.println(listFilter(store.getAllProductsSortedByPrice()));
                } catch (SearchProductException e) {
                    System.out.println(e);
                    System.out.println("Please, enter a new product.");
                }
            }
            case SORT_BY_QUEUE -> {
                try {
                    System.out.println(listFilter(store.getAllProducts()));
                } catch (SearchProductException e) {
                    System.out.println(e);
                    System.out.println("Please, enter a new product.");
                }
            }
        }
    }

    private String listFilter(List<Product> string) {
        return ListFilter.beautifulList(string);
    }
}
