import java.util.Scanner;
public class Matriks {
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
                case 2:
                    perkalianMatrix();
                case 3:

                case 4:
                    tranposeMatrix();
                case 5: 
                
                default:
                    break;
            }
        } while (pilihan != 5);
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
                break;
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
    
            double [][] matrix1 = new double [baris][kolom];
            double [][] matrix2 = new double [baris][kolom];
            double [][] matrixHasil = new double [baris][kolom];
    
            System.out.println("Masukkan elemen matrix pertama");
            for (int i = 0; i < baris; i++) {
                System.out.println("Baris ke-" + (i+1));
                for (int j = 0; j < kolom; j++ ) {
                    System.out.print("Elemen"+" [" + (i+1) + "]"+"[" + (j+1) + "]"+ ": ");
                    matrix1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Masukkan elemen matrix kedua");
            for (int i = 0; i < baris; i++) {
                System.out.println("Baris ke-" + (i+1));
                for (int j = 0; j < kolom; j++ ) {
                    System.out.print("Elemen"+" [" + (i+1) + "]"+"[" + (j+1) + "]"+ ": ");
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
            sc.nextLine();
            System.out.print("Apakah anda ingin mengakses menu lagi? (y/t): ");
            jawab = sc.nextLine();
            
        } while (!jawab.equalsIgnoreCase("t"));
    }
    static void penguranganMatrix() {
        String jawab;
        do {
            System.out.println("\n=== Pengurangan Matrix ===");
            System.out.print("Masukkan jumlah baris: ");
            int baris = sc.nextInt();
            System.out.print("Masukkan jumlah kolom: ");
            int kolom = sc.nextInt();
    
            double [][] matrix1 = new double [baris][kolom];
            double [][] matrix2 = new double [baris][kolom];
            double [][] matrixHasil = new double [baris][kolom];
    
            System.out.println("Masukkan elemen matrix pertama");
            for (int i = 0; i < baris; i++) {
                System.out.println("Baris ke-" + (i+1));
                for (int j = 0; j < kolom; j++ ) {
                    System.out.print("Elemen"+" [" + (i+1) + "]"+"[" + (j+1) + "]"+ ": ");
                    matrix1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Masukkan elemen matrix kedua");
            for (int i = 0; i < baris; i++) {
                System.out.println("Baris ke-" + (i+1));
                for (int j = 0; j < kolom; j++ ) {
                    System.out.print("Elemen"+" [" + (i+1) + "]"+"[" + (j+1) + "]"+ ": ");
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
            sc.nextLine();
            System.out.print("Apakah anda ingin mengakses menu lagi? (y/t): ");
            jawab = sc.nextLine();
            
        } while (!jawab.equalsIgnoreCase("t"));
    }
    static void perkalianMatrix() {
        String jawab;
        do {
            System.out.println("\n=== Perkalian Matrix ===");
            System.out.print("Masukkan jumlah baris: ");
            int baris = sc.nextInt();
            System.out.print("Masukkan jumlah kolom: ");
            int kolom = sc.nextInt();
    
            double [][] matrix1 = inputMatrix (baris1, kolom1, "")
            double [][] matrix2 = new double [baris][kolom];

            double [][] matrixHasil = new double [baris][kolom];
            for (int i = 0; i < ba) {

            }
    

            System.out.print("Apakah anda ingin mengakses menu lagi? (y/t): ");
            jawab = sc.nextLine();
            
        } while (!jawab.equalsIgnoreCase("t"));
    }
    // static void inversMatrix() {

    // }

    static void tranposeMatrix() {
        String jawab;
        do {
            System.out.println("\n=== Tranpose Matrix ===");
            System.out.print("Masukkan jumlah baris: ");
            int baris = sc.nextInt();
            System.out.print("Masukkan jumlah kolom: ");
            int kolom = sc.nextInt();
    
            double [][] matrix = new double [baris][kolom];

            System.out.println("Masukkan elemen matrix ");
            for (int i = 0; i < baris; i++) {
                System.out.println("Baris ke-" + (i+1));
                for (int j = 0; j < kolom; j++ ) {
                    System.out.print("Elemen"+" [" + (i+1) + "]"+"[" + (j+1) + "]"+ ": ");
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Hasil Tranpose Matrix: ");
            for (int i = 0; i < kolom; i++) {
                for (int j = 0; j < baris; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.println();
            }
            sc.nextLine();
            System.out.print("Apakah anda ingin mengakses menu lagi? (y/t): ");
            jawab = sc.nextLine();
            
        } while (!jawab.equalsIgnoreCase("t"));
    }
}
