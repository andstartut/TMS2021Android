package menu;

import inputs.Console;
import products.Product;
import store.Accounting;
import store.Store;

import java.util.List;
import java.util.Map;

public class AccountingSubmenu extends Menu {
    private final static int PRODUCT_TYPE = 1;
    private final static int COMMON_NUMBERS_OF_PRODUCTS = 2;
    private final static int MIDDLE_PRICE = 3;
    private final static int MIDDLE_PRICE_OF_TYPES = 4;
    private Accounting accounting = store.getAccounting();
    private Map<Integer, Integer> storageMap = store.getStorage().getStorageOfProductsMap();
    private List<Product> productList = store.getProductList();

    public AccountingSubmenu(Store store) {
        super(store);
    }

    public void getSubMenu() {
        System.out.println("1: Product Types");
        System.out.println("2: Common number of products");
        System.out.println("3: Middle price");
        System.out.println("4: Middle price of types");
        consoleListener();
    }

    private void consoleListener() {
        switch (Console.input().nextInt()) {
            case PRODUCT_TYPE: {
                System.out.println(accounting.getProductTypes(productList, storageMap));
                break;
            }
            case COMMON_NUMBERS_OF_PRODUCTS: {
                System.out.println(accounting.getCommonNumberOfProducts(storageMap));
                break;
            }
            case MIDDLE_PRICE: {
                System.out.println(accounting.getMiddlePrice(productList, storageMap));
                break;
            }
            case MIDDLE_PRICE_OF_TYPES: {
                accounting.getMiddlePriceOfType(productList, storageMap);
                break;
            }
        }
    }
}
