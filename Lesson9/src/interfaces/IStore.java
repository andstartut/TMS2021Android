package interfaces;

import exceptions.SearchProductException;
import exceptions.StorageException;
import products.Product;

import java.util.List;

public interface IStore {
    void addProduct(Product product, int quantity) throws SearchProductException, StorageException;
    List<Product> getAllProducts() throws SearchProductException;
    List<Product> getAllProductsSortedByAscending() throws SearchProductException;
    List<Product> getAllProductsSortedByDescending() throws SearchProductException;
    List<Product> getAllProductsSortedById() throws SearchProductException;
    List<Product> getAllProductsSortedByName() throws SearchProductException;
    boolean deleteProduct(int id) throws SearchProductException, StorageException;
    void editProduct(Product product) throws SearchProductException, StorageException;
}
