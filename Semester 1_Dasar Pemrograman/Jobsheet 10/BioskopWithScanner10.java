import java.util.Scanner;
public class BioskopWithScanner10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;

        String [][] penonton = new String[4][2];
        
        System.out.println("==============================================");
        System.out.println("- Menu 1: Input data penonton");
        System.out.println("- Menu 2: Tampilkan daftar penonton");
        System.out.println("- Menu 3: Exit");
        System.out.println("==============================================");
        System.out.print("Masukkan menu: ");
        menu = sc.nextInt();
        sc.nextLine();
        
        System.out.println("==============================================");
        switch (menu) {
            case 1:
            while (true) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();                
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Kursi yang anda pesan tidak tersedia");
                    continue;
                } else if (penonton[baris-1][kolom-1] != null) {
                    System.out.println("Kursi telah dipesan");
                    continue;
                } 
                penonton[baris-1][kolom-1] = nama;
                
                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();

                System.out.println("==============================================");
                if (next.equalsIgnoreCase("n")) {
                    System.out.println("- Menu 1: Input data penonton");
                    System.out.println("- Menu 2: Tampilkan daftar penonton");
                    System.out.println("- Menu 3: Exit");
                    System.out.println("==============================================");
                    System.out.print("Masukkan menu: ");
                    menu = sc.nextInt();
                    System.out.println("==============================================");
                    sc.nextLine();
                    break;
                }
            }
            case 2:
            for (int i = 0; i < penonton.length; i++ ) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] != null) {
                        System.out.printf("%s \t", penonton[i][j]);
                    } else {
                        System.out.printf("***\t");
                    }
                }
                System.out.println();
            }
            break;
            case 3: 
            System.out.println("Program selesai");
            break;
            default:
            System.out.println("Input invalid, masukkan data yang benar");
            break;
        }
    }
}
