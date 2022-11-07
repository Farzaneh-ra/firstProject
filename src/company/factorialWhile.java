package company;

public class factorialWhile {
    public static void main(String[] args) {
        factorial(5);

    }

    public static void factorial(int n) {
        int i = 1;
        int fact = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println(fact);
        System.out.println("This is *Farzan1* feature");
        System.out.println("This is *Farzan2* feature");

        System.out.println("This is *Farzan5* feature");
    }

}