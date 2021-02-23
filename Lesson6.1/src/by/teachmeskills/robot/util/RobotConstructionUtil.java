package by.teachmeskills.robot.util;

import by.teachmeskills.robot.exceptions.CreateRobotPartException;
import by.teachmeskills.robot.interfaces.IRobotPart;

public class RobotConstructionUtil {
    private boolean head = false;
    private boolean hand = false;
    private boolean leg = false;

    /**
     * I guess this is bad idea check part names because it's maybe a lot more than 3.
     */
    public final boolean validateOfTheRobotPart(IRobotPart part) {
        boolean originalPart = false;
        String partName = part.getPartName().toLowerCase();
        if (!head && partName.equals("head")) {
            head = true;
            originalPart = true;
        } else if (!hand && partName.equals("hand")) {
            hand = true;
            originalPart = true;
        } else if (!leg && partName.equals("leg")) {
            leg = true;
            originalPart = true;
        }
        return originalPart;
    }
}
