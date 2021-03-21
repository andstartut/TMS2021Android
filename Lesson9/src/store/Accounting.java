package store;

import interfaces.IAccounting;
import products.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Accounting implements IAccounting {

    @Override
    public Map<String, Integer> getProductTypes(List<Product> productList, Map<Integer, Integer> productMap) {
        Map<String, Integer> typesMap = new HashMap<>();
        for (Product product : productList) {
            if (typesMap.containsKey(product.getType().getType())) {
                typesMap.put(product.getType().getType(), typesMap.get(product.getType().getType()) + 1);
            } else {
                typesMap.put(product.getType().getType(), 1);
            }
        }
        return typesMap;
    }

    public int getCommonNumberOfProducts(Map<Integer, Integer> productMap) {
        int commonNumberOfProducts = 0;
        for (Map.Entry<Integer, Integer> productId : productMap.entrySet()) {
            commonNumberOfProducts += productId.getValue();
        }
        return commonNumberOfProducts;
    }

    @Override
    public int getMiddlePrice(List<Product> productList, Map<Integer, Integer> productMap) {
        float middlePrice = 0;
        for (Map.Entry<Integer, Integer> productId : productMap.entrySet()) {
            for (Product product : productList) {
                if (productId.getKey() == product.getId()) {
                    middlePrice += product.getPrice() * productId.getValue();
                }
            }
        }
        return (int) (middlePrice / getCommonNumberOfProducts(productMap));
    }

    @Override
    public void getMiddlePriceOfType(List<Product> productList, Map<Integer, Integer> productMap) {
        Map<String, Integer> counterOfNumbersType = new HashMap<>();
        for (Product product : productList) {
            String type = product.getType().getType();
            if (counterOfNumbersType.containsKey(type)) {
                counterOfNumbersType.put(type, counterOfNumbersType.get(type) + product.getPrice());
            } else {
                counterOfNumbersType.put(type, product.getPrice());

            }
        }
        for (String keys : counterOfNumbersType.keySet()) {
            System.out.println(keys + " = " + counterOfNumbersType.get(keys) / getProductTypes(productList, productMap).get(keys));
        }
    }
}
