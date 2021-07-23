package robotsWar;

import java.util.ArrayList;
import java.util.Random;

public class Robot {

    private String robotName;
    private int robotHealth = 100;
    private ArrayList<Character> listOfButtons = new ArrayList<>();
    private String alphabet = "QWEASDZXC";
    String tempAlhabet;

    public String getAlphabet() {
        return alphabet;
    }

    char getRandomKey(){
        int randIndx = new Random().nextInt(tempAlhabet.length());
        char randChar = tempAlhabet.charAt(randIndx);
        tempAlhabet = tempAlhabet.replaceAll(String.valueOf(randChar),"");
        return randChar;
    }

    private void setListOfDamageButtons(){
        tempAlhabet = alphabet;
        for (int i = 0; i < 5; i++) {
           listOfButtons.add(getRandomKey());
        }
    }

    public Robot(String robotName) { this.robotName = robotName;
        setListOfDamageButtons();
    }


    public String getRobotName() { return robotName; }

    public void setRobotName(String robotName) { this.robotName = robotName; }

    public int getRobotHealth() { return robotHealth; }

    public void setRobotHealth(int robotHealth) { this.robotHealth = robotHealth; }

    public ArrayList<Character> getListOfButtons() { return listOfButtons; }

    public void removeActiveKey (char key) {listOfButtons.remove((Character) key);}
}
