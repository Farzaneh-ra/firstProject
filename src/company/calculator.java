package company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        calculator.Operator();
    }
    public static void Operator() {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        System.out.println("Enter 2 numbers");
        double num1 = scanner.nextDouble();
        double num2= scanner.nextDouble();
        switch (selection){
            case 0:
                printMenu();
                break;
            case 1:
                add(num1, num2);
                break;
            case 2:
                subtract(num1,num2);
                break;
            case 3:
                multiply(num1,num2);
                break;
            case 4:
                divide(num1,num2);
                break;
            default:
                break;
        }



    }

    public static void printMenu() {
        System.out.println("Enter 0 for list of selection\n1 for addition\n2 for subtract\n3 for multiply\n4 for divide");
    }

    public static void add(double num1,double num2) {
        System.out.println(num1+num2);
    }

    public static void subtract(double num1,double num2) {
        System.out.println(num1-num2);

    }

    public static void multiply(double num1,double num2) {
        System.out.println(num1*num2);
    }

    public static void divide(double num1,double num2) {
        System.out.println(num1/num2);
    }
}
