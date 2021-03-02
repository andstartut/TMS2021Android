package store;

import exceptions.SearchProductException;
import products.Product;

import java.util.List;

class StoreUtil {
    public static Product searchProductByID(List<Product> productList, int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public static boolean isTheProductPresent(List<Product> productList, int id) {
        return searchProductByID(productList, id) != null;
    }

    public static List<Product> copyProductList(List<Product> productList) throws SearchProductException {
        if (productList.isEmpty()) {
            throw new SearchProductException("The list is empty");
        }
        return List.copyOf(productList);
    }

//    public static boolean searchProduct(List<Product> productList, Product product) {
//        boolean hasPresent = false;
//        Iterator<Product> productIterator = productList.iterator();
//        while (productIterator.hasNext()) {
//            if (productIterator.next() == product) {
//                hasPresent = true;
//            }
//        }
//        return hasPresent;
//    }
}
