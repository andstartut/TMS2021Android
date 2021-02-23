package by.teachmeskills.robot.parts;

public class RobotPartUtil {

    public final String convertingConstantToName(String constantName) {
        StringBuilder name = new StringBuilder();
        String[] nameArray = constantName.toLowerCase().split("");
        nameArray[0] = nameArray[0].toUpperCase();
        for (String letter : nameArray) {
            name.append(letter);
        }
        return name.toString();
    }

    public final String partOperation(String partName, String brandName) {
        String string = "";
        switch (partName) {
            case "Leg" -> string = "The " + partName + "'s " + brandName + " goes";
            case "Hand" -> string = "The " + partName + "'s " + brandName + " waving";
            case "Head" -> string = "The " + partName + "'s " + brandName + " turns";
        }
        return string;
    }
}
