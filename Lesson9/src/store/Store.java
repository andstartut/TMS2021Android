package store;

import exceptions.SearchProductException;
import exceptions.StorageException;
import interfaces.IStore;
import products.Product;

import java.util.*;

public class Store implements IStore {
    Storage storage = new Storage();
    List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct(Product product, int quantity) throws SearchProductException, StorageException {
        if (StoreUtil.isTheProductPresent(productList, product.getId())) {
            throw new SearchProductException(product.getName() + " is already in the list");
        }
        productList.add(product);
        storage.addNewProductToStorage(product.getId(), quantity);
    }

//    @Override
//    public void addProduct(List<Product> newList) throws SearchProductException {
//        for (Product newProduct : newList) {
//            for (Product product : productList) {
//                if (newProduct.getId() == (product.getId())) {
//                    throw new SearchProductException(newProduct.getName() + " is already in the list");
//                }
//            }
//            productList.add(newProduct);
//            Storage.addToStorage(newProduct.getId());
//        }
//    }

    public List<Product> getProductList() {
        return syncIdProductListAndStorage(productList, storage.getStorageOfProductsMap());
    }

    private List<Product> syncIdProductListAndStorage(List<Product> list, Map<Integer, Integer> map) {
        String id = "";
        if (list.size() > map.size()) {
            for (Product product : list) {
                if (!map.containsKey(product.getId())) {
                    id = id.concat(String.valueOf(product.getId()));
                    list.remove(product);
                    break;
                }
            }
            System.out.println("Collections was synced." + id + " was deleted");
        }
        return list;
    }

    @Override
    public List<Product> getAllProducts() throws SearchProductException {
        return getProductList();
    }

    @Override
    public List<Product> getAllProductsSortedByPrice() throws SearchProductException {
        List<Product> copyProductList = new ArrayList<>(StoreUtil.copyProductList(getProductList()));
        copyProductList.sort(Comparator.comparingInt(Product::getPrice));
        return copyProductList;
    }

    @Override
    public List<Product> getAllProductsSortedById() throws SearchProductException {
        List<Product> copyProductList = new ArrayList<>(StoreUtil.copyProductList(getProductList()));
        copyProductList.sort(Comparator.comparingInt(Product::getId));
        return copyProductList;
    }

    @Override
    public List<Product> getAllProductsSortedByName() throws SearchProductException {
        List<Product> copyProductList = new ArrayList<>(StoreUtil.copyProductList(getProductList()));
        copyProductList.sort(Comparator.comparing(Product::getName));
        return copyProductList;
    }

    @Override
    public boolean deleteProduct(int id) throws SearchProductException {
        Product product = StoreUtil.searchProductByID(getProductList(), id);
        if (product == null) {
            throw new SearchProductException("The Product with this ID:" + id + " was not found");
        } else {
            productList.remove(product);
            storage.deleteFromStorage(id);
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

    public Storage getStorage() {
        return storage;
    }

}
