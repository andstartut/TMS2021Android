package by.teachmeskills.robot.interfaces;

import by.teachmeskills.robot.enums.PartsAndPrices;

public interface IRobotPartFactory {
    IRobotPart createPart(PartsAndPrices partName);
}
