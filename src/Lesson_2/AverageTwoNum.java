package Lesson_2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageTwoNum {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#.#");

            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            double avarage = (num1 + num2) / 2;

            System.out.println("Average Sum:" + df.format(avarage));
        }
}
