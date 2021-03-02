package menu;

import enums.ProductType;

class MenuProductType {

    public static void outputTypesToList() {
        ProductType[] type = enums.ProductType.values();
        for (int i = 0; i < type.length; i++) {
            System.out.println(i + ": " + type[i].getType());
        }
    }

    public static ProductType giveOutTypeByCount(int numberOfType) {
        return ProductType.values()[numberOfType];
    }
}
