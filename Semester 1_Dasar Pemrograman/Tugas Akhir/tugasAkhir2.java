import java.util.Scanner;

public class tugasAkhir2 {
    static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("=======================");
            System.out.println("=== Operasi Matriks ===");
            System.out.println("=======================");
            System.out.println("1. Penjumlahan Matrix atau Pengurangan Matrix");
            System.out.println("2. Perkalian");
            System.out.println("3. Invers");
            System.out.println("4. Transpose");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");
            menu = sc.nextInt();
            sc.nextLine(); 
            switch (menu) {
                case 1:
                    penjumlahanPenguranganMatrix(); 
                    break;
                case 2:
                    perkalian(); 
                    break;
                case 3:
                    invers(); 
                    break;
                case 4:
                    tranposeMatrix();
                    break;
                case 5 :
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        } while (menu != 5);

        sc.close(); 
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

    static void perkalian() {
        System.out.println("--- PERKALIAN ---");
        System.out.print("Masukkan jumlah baris matriks 1 : ");
        int baris1 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks 1 : ");
        int kolom1 = sc.nextInt();
        System.out.print("Masukkan jumlah baris matriks 2 : ");
        int baris2 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks 2 : ");
        int kolom2 = sc.nextInt();
        if (kolom1 != baris2) {
            System.out.println("Tidak dapat melakukan perkalian, jumlah kolom matriks pertama harus sama dengan jumlah baris matriks kedua!");
            return;
        }
        double[][] matriks1 = inputMatriks(baris1, kolom1, "pertama");
        double[][] matriks2 = inputMatriks(baris2, kolom2, "kedua");

        double[][] hasil = new double[baris1][kolom2];
        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom2; j++) {
                for (int k = 0; k < kolom1; k++) {
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
        tampilkanMatriks("Matriks Pertama", matriks1);
        tampilkanMatriks("Matriks Kedua", matriks2);
        tampilkanMatriks("Hasil Perkalian", hasil);
    }
    static void invers() {
        System.out.println("--- INVERS ---");
        System.out.println("1. Ordo 2*2");
        System.out.println("2. Ordo 3*3");
        System.out.print("Pilih jenis ordo yang diinginkan (1/2) : ");
        int ordo = sc.nextInt();
        while (true) {
            if (ordo == 1) {
                double[][] matriks1 = inputMatriks(2, 2, "ordo 2*2");
                double det = (matriks1[0][0] * matriks1[1][1]) - (matriks1[0][1] * matriks1[1][0]);
                if (det == 0) {
                    System.out.println("Matriks tidak memiliki invers (determinannya = 0)");
                    break;
                }
                double k = 1 / det;
                double invers [][] = new double[2][2];
                invers[0][0] = k * (-matriks1[1][1]);
                invers[0][1] = k * matriks1[0][1];
                invers[1][0] = k * matriks1[1][0];
                invers[1][1] = k * (-matriks1[0][0]);
                tampilkanMatriks("Matriks Asli", matriks1);
                tampilkanMatriks("Invers Matriks", invers);
                break;
            } else if (ordo == 2) {
                double[][] matriks1 = inputMatriks(3, 3, "ordo 3*3");
                double det = matriks1[0][0] * (matriks1[1][1] * matriks1[2][2] - matriks1[1][2] * matriks1[2][1]) - matriks1[0][1] * (matriks1[1][0] * matriks1[2][2] - matriks1[1][2] * matriks1[2][0]) + matriks1[0][2] * (matriks1[1][0] * matriks1[2][1] - matriks1[1][1] * matriks1[2][0]);
                if (det == 0) {
                    System.out.println("Matriks tidak memiliki invers (determinannya = 0)");
                    break;
                }
                double k = 1 / det;
                double[][] kofaktor = new double[3][3];
                kofaktor[0][0] = (matriks1[1][1] * matriks1[2][2] - matriks1[1][2] * matriks1[2][1]);
                kofaktor[0][1] = -1 * (matriks1[1][0] * matriks1[2][2] - matriks1[1][2] * matriks1[2][0]);
                kofaktor[0][2] = (matriks1[1][0] * matriks1[2][1] - matriks1[1][1] * matriks1[2][0]);
                kofaktor[1][0] = -1 * (matriks1[0][1] * matriks1[2][2] - matriks1[0][2] * matriks1[2][1]);
                kofaktor[1][1] = (matriks1[0][0] * matriks1[2][2] - matriks1[0][2] * matriks1[2][0]);
                kofaktor[1][2] = -1 * (matriks1[0][0] * matriks1[2][1] - matriks1[0][1] * matriks1[2][0]);
                kofaktor[2][0] = (matriks1[0][1] * matriks1[1][2] - matriks1[0][2] * matriks1[1][1]);
                kofaktor[2][1] = -1 * (matriks1[0][0] * matriks1[1][2] - matriks1[0][2] * matriks1[1][0]);
                kofaktor[2][2] = (matriks1[0][0] * matriks1[1][1] - matriks1[0][1] * matriks1[1][0]);
                double[][] adjoint = new double[3][3];
                for (int i = 0; i < matriks1.length; i++) {
                    for (int j = 0; j < matriks1[0].length; j++) {
                        adjoint[j][i] = kofaktor[i][j];
                    }
                }
                double[][] invers = new double[3][3];
                for (int i = 0; i < invers.length; i++) {
                    for (int j = 0; j < invers[0].length; j++) {
                        invers[i][j] = k * adjoint[i][j];
                    }
                }
                tampilkanMatriks("Matriks Asli", matriks1);
                tampilkanMatriks("Invers Matriks", invers);
                break;
            } else {
                System.out.println("Jenis ordo tidak ada! Silahkan masukkan data yang valid");
            }
        }
    }
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
    static double[][] inputMatriks(int baris, int kolom, String matriksKe) {
        double[][] matriks = new double[baris][kolom];
        System.out.println("--------- Masukkan nilai ---------");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print("Masukkan elemen matriks " + matriksKe + " [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriks[i][j] = sc.nextDouble();
            }
        }
        return matriks;
    }
    static double[][] tambahMatriks(double[][] matriks1, double[][] matriks2) {
        int baris = matriks1.length;
        int kolom = matriks1[0].length;
        double[][] hasil = new double[baris][kolom];
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[0].length; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        return hasil;
    }
    static double[][] kurangMatriks(double[][] matriks1, double[][] matriks2) {
        int baris = matriks1.length;
        int kolom = matriks1[0].length;
        double[][] hasil = new double[baris][kolom];
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[0].length; j++) {
                hasil[i][j] = matriks1[i][j] - matriks2[i][j];
            }
        }
        return hasil;
    }
    static void tampilkanMatriks(String namaMatriks, double[][] matriks) {
        System.out.println(namaMatriks + ":");
        for (int i = 0; i < matriks.length; i++) {
            System.out.print("|\t");
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println("\t|");
        }
    }
}