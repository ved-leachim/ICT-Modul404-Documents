package ch.csbe.modul404;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Number: ");
        int inputNumber = scr.nextInt();

        if (inputNumber % 3 == 0 && inputNumber % 5 == 0)
            System.out.println("FidiBus");
        else if (inputNumber % 3 == 0)
            System.out.println("Bus");
        else if (inputNumber % 5 == 0)
            System.out.println("Fidi");
        else
            System.out.println(inputNumber);
    }
}
