package Opgave03;

import java.util.Scanner;

public class opgave03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.print("Write what day it is (Monday = 0,...., Sunday=6): ");

        int weekday_number = scanner.nextInt();

        System.out.println(weekday[weekday_number]);

        System.out.print("Write how many days have elipsed: ");

        int weekday_elipsed = scanner.nextInt();

        int weekday_elipsed_equation = (weekday_number+weekday_elipsed)%7;

        System.out.println(weekday[weekday_elipsed_equation]);


    }
}
