package MyPackage;

import java.sql.SQLOutput;
import java.util.*;

public class conditions {
    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if(age > 18){
//            System.out.println("Adult");
//        } else {
//            System.out.println("Not Adult");
//        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 1){
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
