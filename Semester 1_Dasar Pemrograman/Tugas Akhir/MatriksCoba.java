import java.util.Scanner;
public class MatriksCoba {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int pilihan;
        do {
            System.out.println("===  Operasi Matrix ===");
            System.out.println("1. Penjumlahan Matrix atau Pengurangan Matrix");
            System.out.println("2. Perkalian Matrix");
            System.out.println("3. Invers Matrix");
            System.out.println("4. Tranpose Matrix");
            System.out.println("5. Keluar: ");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    penjumlahanPenguranganMatrix();
                    break;
                default:
                    System.out.println("Menu tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 5);

        System.out.println("Terima kasih telah menggunakan program ini!");
    }

    static void penjumlahanPenguranganMatrix() {
        System.out.println("=== Pilih Operasi Matrix (+/-) ===");
        System.out.println("1. Penjumlahan Matrix");
        System.out.println("2. Pengurangan Matrix");
        System.out.print("Pilih menu: ");
        int pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                penjumlahanMatrix();
                break;
            case 2:
                penguranganMatrix();
                break;
            default:
                System.out.println("Masukkan opsi yang sesuai!");
        }
    }

    static void penjumlahanMatrix() {
        String jawab;
        do {
            System.out.println("\n=== Penjumlahan Matrix ===");
            System.out.print("Masukkan jumlah baris: ");
            int baris = sc.nextInt();
            System.out.print("Masukkan jumlah kolom: ");
            int kolom = sc.nextInt();

            int[][] matrix1 = new int[baris][kolom];
            int[][] matrix2 = new int[baris][kolom];
            int[][] matrixHasil = new int[baris][kolom];

            System.out.println("Masukkan elemen matrix pertama");
            for (int i = 0; i < baris; i++) {
                System.out.println("Baris ke-" + (i + 1));
                for (int j = 0; j < kolom; j++) {
                    System.out.print("Elemen [" + i + "][" + j + "]: ");
                    matrix1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Masukkan elemen matrix kedua");
            for (int i = 0; i < baris; i++) {
                System.out.println("Baris ke-" + (i + 1));
                for (int j = 0; j < kolom; j++) {
                    System.out.print("Elemen [" + i + "][" + j + "]: ");
                    matrix2[i][j] = sc.nextInt();
                }
            }
            System.out.println("Hasil Penjumlahan Matrix");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    matrixHasil[i][j] = matrix1[i][j] + matrix2[i][j];
                    System.out.print(matrixHasil[i][j] + " ");
                }
                System.out.println();
            }
            sc.nextLine(); // Membersihkan buffer
            System.out.print("Apakah anda ingin mengulangi operasi ini? (y/t): ");
            jawab = sc.nextLine();
        } while (jawab.equalsIgnoreCase("y"));
    }

    static void penguranganMatrix() {
        String jawab;
        do {
            System.out.println("\n=== Pengurangan Matrix ===");
            System.out.print("Masukkan jumlah baris: ");
            int baris = sc.nextInt();
            System.out.print("Masukkan jumlah kolom: ");
            int kolom = sc.nextInt();

            int[][] matrix1 = new int[baris][kolom];
            int[][] matrix2 = new int[baris][kolom];
            int[][] matrixHasil = new int[baris][kolom];

            System.out.println("Masukkan elemen matrix pertama");
            for (int i = 0; i < baris; i++) {
                System.out.println("Baris ke-" + (i + 1));
                for (int j = 0; j < kolom; j++) {
                    System.out.print("Elemen [" + i + "][" + j + "]: ");
                    matrix1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Masukkan elemen matrix kedua");
            for (int i = 0; i < baris; i++) {
                System.out.println("Baris ke-" + (i + 1));
                for (int j = 0; j < kolom; j++) {
                    System.out.print("Elemen [" + i + "][" + j + "]: ");
                    matrix2[i][j] = sc.nextInt();
                }
            }
            System.out.println("Hasil Pengurangan Matrix");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    matrixHasil[i][j] = matrix1[i][j] - matrix2[i][j];
                    System.out.print(matrixHasil[i][j] + " ");
                }
                System.out.println();
            }
            sc.nextLine(); // Membersihkan buffer
            System.out.print("Apakah anda ingin mengulangi operasi ini? (y/t): ");
            jawab = sc.nextLine();
        } while (jawab.equalsIgnoreCase("y"));
    }
}
