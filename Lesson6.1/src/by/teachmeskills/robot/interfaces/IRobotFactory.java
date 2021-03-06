package by.teachmeskills.robot.interfaces;

import by.teachmeskills.robot.exceptions.CreateRobotPartException;
import by.teachmeskills.robot.factory.Robot;

public interface IRobotFactory {
    Robot createRobot() throws CreateRobotPartException;
}
