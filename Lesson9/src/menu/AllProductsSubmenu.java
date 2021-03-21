package menu;

import exceptions.SearchProductException;
import inputs.Console;
import outputs.ListFilter;
import products.Product;
import store.Store;

import java.util.List;

class AllProductsSubmenu extends Menu {
    private static final int SORT_BY_PRICE_ASCENDING = 1;
    private static final int SORT_BY_PRICE_DESCENDING = 2;
    private static final int SORT_BY_QUEUE = 3;
    protected AllProductsSubmenu(Store store) {
        super(store);
    }

    protected void getSubmenu() {
        System.out.println("What kind of sorting do you want?");
        System.out.println("1. Sort by ascending order");
        System.out.println("2. Sort by descending order");
        System.out.println("3. Sort by queue");
        consoleListener();
    }

    private void consoleListener() {
        switch (Console.input().nextInt()) {
            case SORT_BY_PRICE_ASCENDING -> {
                try {
                    System.out.println(listFilter(store.getAllProductsSortedByAscending()));
                } catch (SearchProductException e) {
                    System.out.println(e);
                    System.out.println("Please, enter a new product.");
                }
            }
            case SORT_BY_PRICE_DESCENDING -> {
                try {
                    System.out.println(listFilter(store.getAllProductsSortedByDescending()));
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
