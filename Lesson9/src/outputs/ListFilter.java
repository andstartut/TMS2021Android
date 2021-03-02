package outputs;

import products.Product;

import java.util.List;

public class ListFilter {
    public static String beautifulList(List<Product> list) {
        return list.toString()
                .replace("[", "")
                .replace("]", "");
    }
}
