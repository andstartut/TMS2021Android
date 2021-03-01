package shop;

import exceptions.SearchProductException;
import products.Product;

import java.util.Iterator;
import java.util.List;

class ShopUtil {
    public static Product searchProductByID(List<Product> productList, int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public static boolean isTheProductPresent(List<Product> productList, int id) {
        boolean hasPresent = false;
        for (Product product : productList) {
            if (product.getId() == id) {
                hasPresent = true;
                break;
            }
        }
        return hasPresent;
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
