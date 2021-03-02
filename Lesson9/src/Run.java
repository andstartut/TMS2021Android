import enums.ProductType;
import exceptions.SearchProductException;
import menu.Menu;
import products.Product;
import store.Store;

public class Run {
    public static void main(String[] args) {
        Store store = new Store();
        new Menu(store).getMainMenu();

//        Product williamsF1 = new Product(3, "Toyota Avensis", ProductType.SEDAN, 15000);
//        store.addProduct(williamsF1);
//        Product bugatti = new Product(2, "Bugatti Veyron", ProductType.SPORTCAR, 1500000);
//        store.addProduct(bugatti);
//        Product bmw = new Product(4, "BMW X3", ProductType.SUV, 35000);
//        store.addProduct(bmw);
//        Product toyota = new Product(1, "Williams FW14B", ProductType.RACE, 1000000);
//        store.addProduct(toyota);
//        System.out.println(store.getAllProductsSortedByPrice());
//        store.deleteProduct(bugatti.getId());
//        List<Product> listProducts = new ArrayList<>();
//        listProducts.add(new Product(4, "VW Polo", ProductType.SEDAN, 13000));
//        listProducts.add(new Product(2, "Bugatti Veyron", ProductType.SPORTCAR, 900000));
//        listProducts.add(new Product(5, "Alfa Romeo Gullia", ProductType.SPORTCAR, 89000));
//        listProducts.add(new Product(3, "Toyota Avensis", ProductType.SEDAN, 15000));
//        store.addProduct(listProducts);
//        store.editProduct(new Product(3, "Toyota Corolla", ProductType.SEDAN, 15000));
//        System.out.println(store.getAllProducts());
    }
}
