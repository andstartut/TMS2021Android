package by.teachmeskills.robot;

import by.teachmeskills.robot.factory.Robot;

public class RobotPrice {
    private Robot[] robots;

    public RobotPrice(Robot[] robots) {
        this.robots = robots;
    }

    public void findTheMostExpensive() {
        int maxPrice = 0;
        String name = "";
        for (Robot robot : robots) {
            if (robot.getPrice() > maxPrice) {
                maxPrice = robot.getPrice();
                name = robot.toString();
            }
        }
        System.out.println("The most expensive robot is " + name + ", and it costs: " + maxPrice);
    }
}
