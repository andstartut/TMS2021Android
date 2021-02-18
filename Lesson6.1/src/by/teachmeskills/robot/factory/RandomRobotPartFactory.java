package by.teachmeskills.robot.factory;

import by.teachmeskills.robot.enums.BrandsAndMarkupIndex;
import by.teachmeskills.robot.enums.PartsAndPrices;
import by.teachmeskills.robot.interfaces.IRobotPart;
import by.teachmeskills.robot.interfaces.IRobotPartFactory;
import by.teachmeskills.robot.parts.RobotPart;

import java.util.Random;

import static by.teachmeskills.robot.enums.BrandsAndMarkupIndex.*;

public final class RandomRobotPartFactory implements IRobotPartFactory {
    private BrandsAndMarkupIndex brand = null;
    private static final int ENUM_LENGTH = BrandsAndMarkupIndex.values().length;
    private final Random random = new Random();

    @Override
    public IRobotPart createPart(PartsAndPrices partName) {
        return new RobotPart(partName, selectBrand());
    }

    private BrandsAndMarkupIndex selectBrand() {
        switch (random.nextInt(ENUM_LENGTH)) {
            case 0 -> brand = SAMSUNG;

            case 1 -> brand = SONY;

            case 2 -> brand = TOSHIBA;
        }
        return brand;
    }
}
