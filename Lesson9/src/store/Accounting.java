package store;

import interfaces.IAccounting;
import products.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Accounting implements IAccounting {

    @Override
    public List<String> getProductTypes(List<Product> productList, Map<Integer, Integer> productMap) {
        List<String> typesList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> productId : productMap.entrySet()) {
            for (Product product : productList) {
                if (productId.getKey() == product.getId()) {
                    typesList.add(product.getType().getType());
                }
            }
        }
        return typesList;
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
        float sumOfOneId = 0F;
        for (Product product : productList) {
            int countOfProducts = productMap.get(product.getId());
            String productType = product.getType().getType();
            sumOfOneId = product.getPrice() * countOfProducts;
            if (productMap.containsKey(product.getId())) {
                if (counterOfNumbersType.get(productType) == null) {
                    counterOfNumbersType.put(productType, countOfProducts);
                } else {
                    counterOfNumbersType.put(productType, counterOfNumbersType.get(productType) + countOfProducts);
                }
            }
        }
        for (String keys : counterOfNumbersType.keySet()) {
            System.out.println(keys + " = " + (int) sumOfOneId * counterOfNumbersType.get(keys));
        }
    }
}
