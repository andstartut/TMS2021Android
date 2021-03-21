package products;

import enums.ProductType;

public class Product {
    private final int id;
    private String name;
    private ProductType type;
    private int price;

    public Product(int id, String name, ProductType type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProductType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    //    private int setId() {
//        return Math.abs(name.hashCode() + type.hashCode());
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  '\n' + "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type.getType() +
                ", price=" + price;
    }
}
