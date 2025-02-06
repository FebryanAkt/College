import java.util.Scanner;

public class coba {

    static Scanner sc10 = new Scanner(System.in);
    static String[] namaTim = new String[4]; 
    static int[][] skorTim = new int[4][2]; 

    public static void main(String[] args) {
        int pilihan10;
        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
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
            sc10.nextLine(); // Membersihkan buffer
            System.out.print("\nMasukkan nama tim ke-" + (i + 1) + ": ");
            namaTim[i] = sc10.nextLine(); // Menyimpan nama tim
            for (int j = 0; j < 2; j++) {
                System.out.print("Masukkan skor kelinci untuk Level " + (j + 1) + ": ");
                skorTim[i][j] = sc10.nextInt(); // Menyimpan skor level
            }
        }
    }

    static void tampilkanSkor() {
        // Header tabel
        System.out.println("\n=== TABEL SKOR TURNAMEN ===");
        System.out.printf("%-12s %-10s %-10s %-10s%n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
        System.out.println("--------------------------------------------");

        // Isi tabel
        for (int i = 0; i < 4; i++) {
            int totalSkor = skorTim[i][0] + skorTim[i][1]; // Menghitung total skor
            System.out.printf("%-12s %-10d %-10d %-10d%n", namaTim[i], skorTim[i][0], skorTim[i][1], totalSkor);
        }
    }

    static void tentukanJuara() {
        int maxSkor = 0; // Variabel untuk menyimpan skor tertinggi
        String juaraTim = ""; // Variabel untuk menyimpan nama tim juara
    
        for (int i = 0; i < 4; i++) {
            int totalSkor = skorTim[i][0] + skorTim[i][1]; // Menghitung total skor
            if (totalSkor > maxSkor) {
                maxSkor = totalSkor; // Perbarui skor tertinggi
                juaraTim = namaTim[i]; // Perbarui nama tim juara
            }
        }
    
        // Menampilkan hasil
        System.out.println("\n=== PENENTUAN JUARA ===");
        if (!juaraTim.isEmpty()) {
            System.out.println("Tim Juara: " + juaraTim);
            System.out.println("Total Skor: " + maxSkor);
        } else {
            System.out.println("Belum ada data skor. Silakan masukkan data terlebih dahulu.");
        }
    }
    
}
