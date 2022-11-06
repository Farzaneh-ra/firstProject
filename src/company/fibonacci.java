package company;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        printSequence();

    }
    public static void printSequence() {
        int sum = 0,a=0,b=1;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter an integer number");
        int number = scanner.nextInt();
        if (number==0){System.out.println(0);
        }else{
            System.out.println(0+"\n"+1);
            for (int i=1;i<=number;i++) {
                sum = a +b;
                System.out.println(sum);
                a = b;
                b = sum;

            }
        }


    }

}
