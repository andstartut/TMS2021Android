package by.teachmeskills.robot;

import by.teachmeskills.robot.enums.PartsAndPrices;
import by.teachmeskills.robot.exceptions.CreateRobotPartException;
import by.teachmeskills.robot.factory.*;
import by.teachmeskills.robot.interfaces.IRobotPartFactory;
import by.teachmeskills.robot.parts.RobotPart;

public class Run {

    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        IRobotPartFactory partFactory = new RandomRobotPartFactory();

        RobotFactory robotFactory = new RobotFactory(partFactory);

        Robot r1 = null;
        Robot r2 = null;
        Robot r3 = null;
        try {
            r1 = robotFactory.createRobot();
            r2 = robotFactory.createRobot();
            r3 = robotFactory.createRobot();
        }catch (CreateRobotPartException e) {
            System.out.println("The robot not created");
        }

        Robot[] robots = {r1,r2,r3};
        for (Robot r : robots) {
            r.action();
        }

        new RobotPrice(robots).findTheMostExpensive();
    }
}
