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
        int num2 = sc.nextInt();
        if (num == num2 ){
            System.out.println("num is equal to num2");
        } else {
            if (num > num2 ){
                System.out.println("num1 is greater");
            } else {
                System.out.println("num2 is greater");
            }

        }
    }
}
