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
        System.out.println(RobotNameUtil.partOperation(getPartName(),getBrandName()));
    }

    @Override
    public int getPrice() {
        return (int) (part.getPartPrice() * brand.getMarkupIndex());
    }

    @Override
    public final String getBrandName() {
        return RobotNameUtil.convertingConstantToName(brand.name());
    }

    @Override
    public final String getPartName() {
        return RobotNameUtil.convertingConstantToName(part.name());
    }
}