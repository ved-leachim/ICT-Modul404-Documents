import java.util.Scanner;
import java.util.StringTokenizer;

public class ThrowAnException {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String fullName = enterFullName(scr);
        scr.close();
        System.out.println("The entered name is: " + fullName);
    }

    public static String enterFullName(Scanner scr) {
        String fullName = "";
        boolean hasCorrectFullName = false;
        System.out.println("Please enter your full name, separated by an empty space: ");
        do {
            try {
                fullName = scr.nextLine();
                if (fullName.length() == 0 || fullName.indexOf(' ') == -1) {
                    throw new IllegalArgumentException("Please enter a correct full name.");
                }
                hasCorrectFullName = true;
            } catch (IllegalArgumentException exception) {
                exception.getMessage();
                exception.printStackTrace();
                System.out.println("Please, try again: ");
            }
        } while (!hasCorrectFullName);
        return fullName;
    }
}
