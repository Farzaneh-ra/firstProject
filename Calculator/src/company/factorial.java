package company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        calculateFactorial();

    }

    public static void calculateFactorial() {
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        int fact = 1;
        int finalNumber = scanner.nextInt();

        for (int i = finalNumber ;i>0;i--){
            fact *= i;

        }
        System.out.println(fact);


    }
}
