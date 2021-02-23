package by.teachmeskills.robot.factory;

import by.teachmeskills.robot.enums.PartsAndPrices;
import by.teachmeskills.robot.interfaces.IRobotFactory;
import by.teachmeskills.robot.interfaces.IRobotPartFactory;

public final class RobotFactory implements IRobotFactory {
    private IRobotPartFactory partFactory;

    public RobotFactory(IRobotPartFactory partFactory) {
        this.partFactory = partFactory;
    }

    @Override
    public Robot createRobot() {
        return new Robot(
                partFactory.createPart(PartsAndPrices.HEAD),
                partFactory.createPart(PartsAndPrices.HAND),
                partFactory.createPart(PartsAndPrices.LEG)
        );
    }
}
