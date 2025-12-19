//Write a program to create a calculator using switch...case.

import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();

        //switchcase
        switch (op) {
            case "+":
                System.out.println( first + second);
                break;

            case "-":
                System.out.println( first - second);
                break;

            case "*":
                System.out.println(first * second);
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result = " + (first / second));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
 