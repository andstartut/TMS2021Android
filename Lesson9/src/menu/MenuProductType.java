package menu;

import enums.ProductType;

class MenuProductType {

    protected static void outputTypesToList() {
        ProductType[] type = enums.ProductType.values();
        for (int i = 0; i < type.length; i++) {
            System.out.println(i + ": " + type[i].getType());
        }
    }

    protected static ProductType giveOutTypeByNumber(int numberOfType) throws ArrayIndexOutOfBoundsException {
        int ArrayLength = ProductType.values().length;
        if (numberOfType > ArrayLength) throw new ArrayIndexOutOfBoundsException();
        return ProductType.values()[numberOfType];
    }
}
