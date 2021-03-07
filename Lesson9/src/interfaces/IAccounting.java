package interfaces;

import products.Product;

import java.util.List;
import java.util.Map;

public interface IAccounting {
    List<String> getProductTypes(List<Product> productList, Map<Integer, Integer> productMap);

    int getCommonNumberOfProducts(Map<Integer, Integer> productMap);

    int getMiddlePrice(List<Product> productList, Map<Integer, Integer> productMap);

    void getMiddlePriceOfType(List<Product> productList, Map<Integer, Integer> productMap);
}
