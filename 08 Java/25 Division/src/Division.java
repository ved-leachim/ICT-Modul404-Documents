import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        var scr = new Scanner(System.in);
        int[] numbersToDivide = numbersToDivide(scr);
        scr.close();
        int result = numbersToDivide[0] / numbersToDivide[1];
        System.out.println(numbersToDivide[0] + " : " + numbersToDivide[1] + " = " + result);
    }

    public static int[] numbersToDivide(Scanner scr) {
        int dividend = 0;
        int divisor = 0;
        boolean correctInput = false;

        var numberFormat = NumberFormat.getInstance();
        do {
            System.out.println("Bitte geben Sie den Dividenden ein:");
            try {
                dividend = numberFormat.parse(scr.nextLine()).intValue();
            } catch (ParseException exception) {
                exception.getMessage();
                exception.printStackTrace();
                System.out.println("Versuchen Sie es nochmals:");
                continue;
            }
            System.out.println("Bitte geben Sie den Divisor ein:");
            try {
                divisor = numberFormat.parse(scr.nextLine()).intValue();
                if (divisor == 0)
                    throw new ArithmeticException("Der Divisor darf nicht 0 sein.");
                correctInput = true;
            } catch (ParseException | ArithmeticException exception) {
                exception.getMessage();
                exception.printStackTrace();
                System.out.println("Versuchen Sie es nochmals von vorn:");
                continue;
            }
        } while (!correctInput);
        return new int[]{ dividend, divisor };
    }
}
