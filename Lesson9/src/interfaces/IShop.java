package interfaces;

import exceptions.SearchProductException;
import products.Product;

import java.util.List;

public interface IShop {
    void addProduct(Product product) throws SearchProductException;
    List<Product> getAllProducts();
    boolean deleteProduct(int id) throws SearchProductException;
    void editProduct(Product product) throws SearchProductException;
}
