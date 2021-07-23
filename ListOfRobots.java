package robotsWar;

import java.util.ArrayList;

public class ListOfRobots {
    private static ArrayList<Robot> robotList = new ArrayList<>();

    public static void addRobot(Robot tempRobot) {
        robotList.add(tempRobot);
    }

    public static ArrayList<Robot> getRobotList() {
        return robotList;
    }

    public static void deleteLooser(Robot looserRobot) {
        getRobotList().remove(looserRobot);
    }
    public static String showWinner () {
        if (robotList.size() == 1) {
            return robotList.get(0).getRobotName();
        }else {
           return null;
        }
    }

//    public static Robot deleteLooser() {
//        return deleteLooser();
//    }

    //  public void removeActiveKey (char key) {listOfButtons.remove((Character) key);}
}
