package by.teachmeskills.robot.parts;

import by.teachmeskills.robot.enums.BrandsAndMarkupIndex;
import by.teachmeskills.robot.enums.PartsAndPrices;
import by.teachmeskills.robot.interfaces.IRobotPart;
import by.teachmeskills.robot.util.RobotPartUtil;

public class RobotPart implements IRobotPart {
    private PartsAndPrices part;
    private BrandsAndMarkupIndex brand;

    public RobotPart(PartsAndPrices part, BrandsAndMarkupIndex brand) {
        this.part = part;
        this.brand = brand;
    }

    @Override
    public void info() {
        System.out.println(RobotPartUtil.partOperation(getPartName(),getBrandName()));
    }

    @Override
    public int getPrice() {
        return (int) (part.getPartPrice() * brand.getMarkupIndex());
    }

    @Override
    public final String getBrandName() {
        return RobotPartUtil.convertingConstantToName(brand.name());
    }

    @Override
    public final String getPartName() {
        return RobotPartUtil.convertingConstantToName(part.name());
    }
}
