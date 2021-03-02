package store;

import exceptions.SearchProductException;
import interfaces.IShop;
import products.Product;

import java.util.*;

public class Store implements IShop {
    List<Product> productList = new ArrayList<>();
    List<Product> copyProductList = new ArrayList<>();

    @Override
    public void addProduct(Product product) throws SearchProductException {
        if (StoreUtil.isTheProductPresent(productList, product.getId())) {
            throw new SearchProductException(product.getName() + " is already in the list");
        }
        productList.add(product);
    }

    public void addProduct(List<Product> newList) throws SearchProductException {
        for (Product newProduct : newList) {
            for (Product product : productList) {
                if (newProduct.getId() == (product.getId())) {
                    throw new SearchProductException(newProduct.getName() + " is already in the list");
                }
            }
            productList.add(newProduct);
        }
    }

    @Override
    public List<Product> getAllProducts() throws SearchProductException {
        return productList;
    }

    @Override
    public List<Product> getAllProductsSortedByPrice() throws SearchProductException {
        List<Product> copyProductList = new ArrayList<>(StoreUtil.copyProductList(productList));
        copyProductList.sort(Comparator.comparingInt(Product::getPrice));
        return copyProductList;
    }

    @Override
    public List<Product> getAllProductsSortedById() throws SearchProductException {
        List<Product> copyProductList = new ArrayList<>(StoreUtil.copyProductList(productList));
        copyProductList.sort(Comparator.comparingInt(Product::getId));
        return copyProductList;
    }

    @Override
    public List<Product> getAllProductsSortedByName() throws SearchProductException {
        List<Product> copyProductList = new ArrayList<>(StoreUtil.copyProductList(productList));
        copyProductList.sort(Comparator.comparing(Product::getName));
        return copyProductList;
    }

    @Override
    public boolean deleteProduct(int id) throws SearchProductException {
        Product product = StoreUtil.searchProductByID(productList, id);
        if (product == null) {
            throw new SearchProductException("The Product with this ID:" + id + " was not found");
        } else {
            productList.remove(product);
            return true;
        }
    }

    @Override
    public void editProduct(Product product) throws SearchProductException {
        if (!deleteProduct(product.getId())) {
            throw new SearchProductException(product.getId() + " does not exist");
        }
        productList.add(product);
    }
}
