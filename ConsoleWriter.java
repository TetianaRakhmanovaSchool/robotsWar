package robotsWar;

import java.util.Scanner;

    abstract public class ConsoleWriter {
        public static String getStringFromConsole() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();


        }
        public static char getCharFromConsole() {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if(input.length()>1){
                throw new RuntimeException(); }
            return input.toUpperCase().charAt(0);
        }
}
