package JavaHTPE11.ch_4;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print("Enter grade of -1 for quit: ");
        int grade = input.nextInt();

        while (grade != -1) {
            total += grade;
            gradeCounter++;

            System.out.print("Enter grade of -1 for quit: ");
            grade = input.nextInt();
        }

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        } else {
            System.out.println("Not grades were entered");
        }
    }
}
