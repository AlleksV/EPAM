package main;

import java.io.IOException;
import java.util.Scanner;

public class Switch {
    public static void main (String [] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of the month: ");
        int month = input.nextInt();


        String monthString;
        switch (month) {
            case 1: monthString = "январь";
            break;
            case 2: monthString = "февраль";
            break;
            case 3: monthString = "март";
            break;
            case 4: monthString = "апрель";
            break;
            case 5: monthString = "may";
            break;
            default:monthString = "не знаем такого :)";

            break;

        }
        System.out.println(monthString);


    }
}
