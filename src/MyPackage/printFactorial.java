package MyPackage;

import java.util.Scanner;

public class printFactorial {
    public static void printFactorials(int n){
        if (n <1){
            System.out.println("Invalid number");
        }
        int factorial = 1;
        for (int i = n; i>= 1;i--){
            factorial=factorial*i;

        }
        System.out.println(factorial);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorials(n);
    }
}
