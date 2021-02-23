package by.teachmeskills.robot.factory;

import by.teachmeskills.robot.exceptions.CreateRobotPartException;
import by.teachmeskills.robot.util.RobotConstructionUtil;
import by.teachmeskills.robot.interfaces.IRobot;
import by.teachmeskills.robot.interfaces.IRobotPart;

public class Robot implements IRobot {
    RobotConstructionUtil util = new RobotConstructionUtil();
    private IRobotPart head;
    private IRobotPart hand;
    private IRobotPart leg;

    protected Robot(IRobotPart head, IRobotPart hand, IRobotPart leg) throws CreateRobotPartException {
        setHead(head);
        setHand(hand);
        setLeg(leg);

    }

    private void setHead(IRobotPart head) throws CreateRobotPartException {
        if (util.validateOfTheRobotPart(head)) {
            this.head = head;
        } else {
            throw new CreateRobotPartException("You're trying to create the robot with a several same parts");
        }
    }

    private void setHand(IRobotPart hand) throws CreateRobotPartException {
        if (util.validateOfTheRobotPart(hand)) {
            this.hand = hand;
        } else {
            throw new CreateRobotPartException("You're trying to create the robot with a several same parts");
        }
    }

    private void setLeg(IRobotPart leg) throws CreateRobotPartException {
        if (util.validateOfTheRobotPart(leg)) {
            this.leg = leg;
        } else {
            throw new CreateRobotPartException("You're trying to create the robot with a several same parts");
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
