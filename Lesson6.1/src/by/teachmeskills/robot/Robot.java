package by.teachmeskills.robot;

import by.teachmeskills.robot.interfaces.IRobot;
import by.teachmeskills.robot.interfaces.IRobotPart;

public class Robot implements IRobot {
    private IRobotPart head;
    private IRobotPart hand;
    private IRobotPart leg;

    public Robot(IRobotPart head, IRobotPart hand, IRobotPart leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public IRobotPart getHead() {
        return head;
    }

    public IRobotPart getHand() {
        return hand;
    }

    public IRobotPart getLeg() {
        return leg;
    }

    @Override
    public void action() {
        head.info();
        hand.info();
        leg.info();
    }

    /**
     * Get the cost of a robot
     * @return int
     */
    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head=" + head.getBrandName() +
                ", hand=" + hand.getBrandName() +
                ", leg=" + leg.getBrandName() +
                '}';
    }
}
