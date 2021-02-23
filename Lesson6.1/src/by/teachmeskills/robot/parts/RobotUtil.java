package by.teachmeskills.robot.parts;

import by.teachmeskills.robot.interfaces.IRobotPart;

public class RobotUtil {
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
        } else {
            System.out.println("You're trying to create the robot with a several same parts");
        }
        return originalPart;
    }
}
