package by.teachmeskills.robot.parts;

import by.teachmeskills.robot.enums.BrandsAndMarkupIndex;
import by.teachmeskills.robot.enums.PartsAndPrices;
import by.teachmeskills.robot.interfaces.IRobotPart;

public class RobotPart implements IRobotPart {
    private PartsAndPrices part;
    private BrandsAndMarkupIndex brand;

    public RobotPart(PartsAndPrices part, BrandsAndMarkupIndex brand) {
        this.part = part;
        this.brand = brand;
    }

    @Override
    public void info() {
        System.out.println(getPartName() + "'s " + getBrandName() + " is moved");
    }

    @Override
    public int getPrice() {
        return (int) (part.getPartPrice() * brand.getMarkupIndex());
    }

    @Override
    public final String getBrandName() {
        return convertingConstantToName(brand.name());
    }

    @Override
    public final String getPartName() {
        return convertingConstantToName(part.name());
    }

    /**
     * Getting a beautiful name using String and StringBuilder.
     * Maybe I need to move this method to another class?
     */
    private String convertingConstantToName(String constantName) {
        StringBuilder name = new StringBuilder();
        String[] nameArray = constantName.toLowerCase().split("");
        nameArray[0] = nameArray[0].toUpperCase();
        for (String letter : nameArray) {
            name.append(letter);
        }
        return name.toString();
    }
}
