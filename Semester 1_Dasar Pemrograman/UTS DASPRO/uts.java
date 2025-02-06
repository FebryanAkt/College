// import java.util.Scanner;
// public class uts {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int n, i, j, angka = 1;

//         System.out.print("Masukkan nilai N: ");
//         n = sc.nextInt();
        
//         for ( i = 1; i <= n; i++) {
//             for ( j = 1; j<=3; j++) {
                
//                 System.out.print(angka);
//                 angka++;
//             }
//             System.out.println();
//             }
//     }
// }

import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.print("Masukkan nilai N: ");
        n = sc.nextInt();

        for (i=1; i<=n; i++) {
            System.out.print((i) + "\t");
            System.out.print((i + n) + "\t");
            System.out.print((i + 2 * n) + "\t");
            System.out.println ();
        }
    }
}