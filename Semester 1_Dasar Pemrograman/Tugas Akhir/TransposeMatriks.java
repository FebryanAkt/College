import java.util.Scanner;

public class TransposeMatriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Transpose Matriks ===");

        // Input ukuran matriks
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = sc.nextInt();

        // Deklarasi matriks
        int[][] matriks = new int[baris][kolom];
        int[][] transpose = new int[kolom][baris];

        // Memasukkan elemen matriks
        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = sc.nextInt();
            }
        }

        // Transpose matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }

        // Menampilkan matriks asli
        System.out.println("\nMatriks Asli:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        // Menampilkan matriks transpose
        System.out.println("\nMatriks Transpose:");
        for (int i = 0; i < kolom; i++) {
            for (int j = 0; j < baris; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
