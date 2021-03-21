import enums.ProductType;
import exceptions.SearchProductException;
import exceptions.StorageException;
import menu.Menu;
import products.Product;
import store.Store;

public class Run {
    public static void main(String[] args) {
        Store store = new Store();

        Product toyota = new Product(3, "Toyota Avensis", ProductType.SEDAN, 15000);
        Product bugatti = new Product(2, "Bugatti Veyron", ProductType.SPORTCAR, 1500000);
        Product bmw = new Product(4, "BMW X3", ProductType.SUV, 35000);
        Product williamsF1 = new Product(1, "Williams FW14B", ProductType.RACE, 1000000);
        Product williamsF2 = new Product(7, "Williams FW14B", ProductType.RACE, 900000);
        try {
            store.addProduct(toyota, 6);
            store.addProduct(bmw, 1);
            store.addProduct(williamsF1, 1);
            store.addProduct(bugatti, 1);
            store.addProduct(williamsF2, 4);
        } catch (SearchProductException | StorageException e) {
            e.printStackTrace();
        }

        new Menu(store).getMainMenu();
    }
}
