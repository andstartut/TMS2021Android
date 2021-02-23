package by.teachmeskills.robot.factory;

import by.teachmeskills.robot.parts.RobotUtil;
import by.teachmeskills.robot.interfaces.IRobot;
import by.teachmeskills.robot.interfaces.IRobotPart;

public class Robot implements IRobot {
    RobotUtil util = new RobotUtil();
    private IRobotPart head;
    private IRobotPart hand;
    private IRobotPart leg;

    protected Robot(IRobotPart head, IRobotPart hand, IRobotPart leg) {
        setHead(head);
        setHand(hand);
        setLeg(leg);
    }

    private void setHead(IRobotPart head) {
        if (util.validateOfTheRobotPart(head)) {
            this.head = head;
        }
    }

    private void setHand(IRobotPart hand) {
        if (util.validateOfTheRobotPart(hand)) {
            this.hand = hand;
        }
    }

    private void setLeg(IRobotPart leg) {
        if (util.validateOfTheRobotPart(leg)){
            this.leg = leg;
        }
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
     *
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
