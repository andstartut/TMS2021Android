package outputs;

import products.Product;

import java.util.List;
import java.util.Set;

public class ListFilter {
    public static String beautifulList(List<Product> list) {
        return list.toString()
                .replace("[", "")
                .replace("]", "");
    }

    public static String arrayToList(Set<String> list) {
        return list.toString()
                .replace("[", "")
                .replace(",\s", "\n")
                .replace("]", "");
    }
}
