package MyPackage;

public class patterns1 {
    static void main(String[] args) {
//        int n = 4;
//        for ( int i= 0; i<= n; i++){
//            System.out.println("*");
//        }
        int n = 4;
        int m = 5;
//        for (int i = 1; i<=n;i++){
//            for (int j = 1; j<=m;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                if (i==1||i==n||j==1||j==m){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
