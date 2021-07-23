package robotsWar;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Enter first robot's name");
        String tempRobotName = ConsoleWriter.getStringFromConsole();
        Robot robot1 = new Robot(tempRobotName);

        System.out.println("Enter second robot's name");
        tempRobotName = ConsoleWriter.getStringFromConsole();
        Robot robot2 = new Robot(tempRobotName);

//        System.out.println(robot1.getRobotName() + " " + robot1.getRobotHealth());
//        System.out.println(robot1.getListOfButtons());
//        System.out.println(robot2.getRobotName() + " " + robot2.getRobotHealth());
//        System.out.println(robot2.getListOfButtons());

        ListOfRobots.addRobot(robot1);
        ListOfRobots.addRobot(robot2);

        for (Robot currentRobot : ListOfRobots.getRobotList()
        ) {
            System.out.println(currentRobot.getRobotName());
        }


        Character tempChar = 0;
        char stopChar = 'L';
        do {
            for (Robot currentRobot : ListOfRobots.getRobotList()) {
                try {
                    System.out.println(String.format("Robot's name is %s", currentRobot.getRobotName()));
                    System.out.println("Enter a letter from QWEASDZXC or L for Exit" );
                    tempChar = ConsoleWriter.getCharFromConsole();
                    if (tempChar == 'L') {
                        break;
                    } else if (currentRobot.getAlphabet().contains("" + tempChar) & !(currentRobot.getListOfButtons().contains(tempChar))) {
                        System.out.println(" This letter is not active. Please try again!");
                    } else if (currentRobot.getListOfButtons().contains(tempChar)) {
                        currentRobot.setRobotHealth(currentRobot.getRobotHealth() - 20);
                        System.out.println("Good Shot!! BaBah!!");
                        currentRobot.removeActiveKey(tempChar);
                    } else if (!currentRobot.getAlphabet().contains("" + tempChar) & !(currentRobot.getListOfButtons().contains(tempChar))){
                        System.out.println("Your letter is not valid. Choose another one.");
                }
                } catch (Exception e) {
                    System.out.println("PLease enter only one letter!" + e);
                }
                if (currentRobot.getRobotHealth() == 0) {
                    System.out.println(currentRobot.getRobotName() + " is killed. ");
                    ListOfRobots.deleteLooser(currentRobot);
                    System.out.println(ListOfRobots.getRobotList().get(0).getRobotName() + " is the winner!");
                    //System.out.println(ListOfRobots.showWinner() + " is the winner!");
                    tempChar = 'L';
                    break;
                }
            }
            System.out.println("Robot " + robot1.getRobotName() + " = " + robot1.getRobotHealth());
            System.out.println("Robot " + robot2.getRobotName() + " = " + robot2.getRobotHealth());
        } while (tempChar != stopChar);

    }

}


    