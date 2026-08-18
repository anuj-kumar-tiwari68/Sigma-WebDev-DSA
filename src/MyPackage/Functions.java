package MyPackage;
import java.util.*;

public class Functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
    }
}
