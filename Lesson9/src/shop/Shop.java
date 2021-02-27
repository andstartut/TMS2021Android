package shop;

import exceptions.SearchProductException;
import interfaces.IShop;
import products.Product;

import java.util.*;

public class Shop implements IShop {
    List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct(Product product) throws SearchProductException {
        if (ShopUtil.isTheProductPresent(productList, product.getId())) {
            throw new SearchProductException(product.getName() + " is already in the list");
        }
        productList.add(product);
    }

    public void addProduct(List<Product> newList) throws SearchProductException {
        for (Product product : productList) {
            for (Product newProduct : newList) {
                if (newProduct.getId() == (product.getId())) {
                    throw new SearchProductException(newProduct.getName() + " is already in the list");
                }
            }
        }
        productList.addAll(newList);
    }

    @Override
    public List<Product> getAllProducts() {
        productList.sort(Comparator.comparingInt(Product::getPrice));
        return productList;
    }

    public List<Product> getList() {
        return productList;
    }

    @Override
    public boolean deleteProduct(int id) throws SearchProductException {
        if (ShopUtil.searchProductByID(productList, id) == null) {
            throw new SearchProductException("The Product with this ID:" + id + " was not found");
        } else {
            Product product = ShopUtil.searchProductByID(productList, id);
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
