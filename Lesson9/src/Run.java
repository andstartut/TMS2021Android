import enums.ProductType;
import exceptions.SearchProductException;
import products.Product;
import shop.Shop;

public class Run {
    public static void main(String[] args) throws SearchProductException {
        Shop shop = new Shop();
        Product williamsF1 = new Product(1, "Williams FW14B", ProductType.RACE, 1500000);
        shop.addProduct(williamsF1);
        Product bugatti = new Product(2, "Bugatti Veyron", ProductType.SPORTCAR, 1000000);
        shop.addProduct(bugatti);
        Product toyota = new Product(3, "Toyota Avensis", ProductType.SEDAN, 15000);
        shop.addProduct(toyota);
        System.out.println(shop.getAllProducts());
        shop.deleteProduct(bugatti.getId());
        shop.editProduct(new Product(3, "Toyota Corolla", ProductType.SEDAN, 15000));
        System.out.println(shop.getList());
    }
}
