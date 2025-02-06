// Febryan Akhmad Taajuddin, 244107020180, 10
import java.util.Scanner;

public class uasFebryan {

    static Scanner sc10 = new Scanner(System.in);
    static String [] namaTim10 = new String[4];
    static int [][] skorTim10 = new int [4][2];

    public static void main(String[] args) {

        int pilihan10;
        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan10 = sc10.nextInt();

            switch (pilihan10) {
                case 1:
                    inputSkor();
                    break;
                case 2:
                    tampilkanSkor();
                    break;
                case 3:
                    tentukanJuara();
                    break;
                case 4: 
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Masukkan angka yang valid");
                    break;
                }
            } while (pilihan10 != 4);
    }

    static void inputSkor() {
        for (int i = 0; i < 4; i++) {
            sc10.nextLine(); 
            System.out.print("\nMasukkan nama tim ke-" + (i + 1) + ": ");
            namaTim10[i] = sc10.nextLine(); 
            for (int j = 0; j < 2; j++) {
                System.out.print("Masukkan skor " +namaTim10[i]+ " untuk Level " + (j + 1) + ": ");
                skorTim10[i][j] = sc10.nextInt(); 
            }
        }
    }

    static void tampilkanSkor() {
        System.out.println("\nTabel Skor Turnamen");
        System.out.printf("%-12s %-10s %-10s %-10s%n", "Nama Tim", "Level 1", "Level 2", "Total Skor");

        for (int i = 0; i < 4; i++) {
            int totalSkor = skorTim10[i][0] + skorTim10[i][1]; 
            System.out.printf("%-12s %-10d %-10d %-10d%n", namaTim10[i], skorTim10[i][0], skorTim10[i][1], totalSkor);
        }
    }
    static void tentukanJuara () {
            int maxSkor10 = 0; 
            String juaraTim10 = ""; 
        
            for (int i = 0; i < 4; i++) {
                int totalSkor = skorTim10[i][0] + skorTim10[i][1]; 
                if (totalSkor > maxSkor10) {
                    maxSkor10 = totalSkor; 
                    juaraTim10 = namaTim10[i]; 
                }
            }
            if (!juaraTim10.isEmpty()) {
                System.out.println("Selamat kepada tim " + juaraTim10 + " yang telah memenangkan kompetisi!");
            } 
    }
}
