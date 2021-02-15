package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

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
        Robot horizont = new Robot(new SonyHead(2000), new SamsungHand(1500), new ToshibaLeg(1700));
        Robot vityaz = new Robot(new SamsungHead(2100), new SamsungHand(1300), new SonyLeg(1500));
        Robot integral = new Robot(new ToshibaHead(1800), new SonyHand(1700), new ToshibaLeg(1900));

        horizont.action();
        vityaz.action();
        integral.action();

        if (horizont.getPrice() > vityaz.getPrice() & horizont.getPrice() > integral.getPrice()) {
            System.out.println("The Horizont is the most expensive robot");
        } else if (vityaz.getPrice() > horizont.getPrice() & vityaz.getPrice() > integral.getPrice()) {
            System.out.println("The Vityaz is the most expensive robot");
        } else if (integral.getPrice() > horizont.getPrice() & integral.getPrice() > vityaz.getPrice()) {
            System.out.println("The Integral is the most expensive robot");
        }
    }
}
