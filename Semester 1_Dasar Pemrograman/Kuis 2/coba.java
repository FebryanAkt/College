import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matriks = new double[4][2];

        // Memasukkan elemen matriks ordo 2x2 dari input pengguna
        System.out.println("Masukkan elemen matriks ordo 2x2: ");
        for (int i = 1; i < 2; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.print("Elemen [" + i + "][" + j + "] = ");
                matriks[i][j] = sc.nextDouble();
            }
        }

        // Menampilkan matriks asli
        System.out.println("Matriks Asli:");
        cetakMatriks(matriks);

        // Menghitung dan menampilkan transpose matriks
        double[][] transpose = transposeMatriks(matriks);
        System.out.println("Transpose Matriks:");
        cetakMatriks(transpose);

        // Menghitung dan menampilkan invers matriks
        double[][] invers = inversMatriks(matriks);
        if (invers != null) {
            System.out.println("Invers Matriks:");
            cetakMatriks(invers);
        } else {
            System.out.println("Matriks tidak memiliki invers karena determinannya 0.");
        }
    }

    // Method untuk mencetak matriks
    public static void cetakMatriks(double[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method untuk menghitung transpose matriks
    public static double[][] transposeMatriks(double[][] matriks) {
        double[][] transpose = new double[matriks[0].length][matriks.length];
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }
        return transpose;
    }

    // Method untuk menghitung invers matriks
    public static double[][] inversMatriks(double[][] matriks) {
        double determinan = matriks[0][0] * matriks[1][1] - matriks[0][1] * matriks[1][0];
        if (determinan == 0) {
            return null; // Matriks tidak memiliki invers jika determinan 0
        }

        double[][] invers = new double[2][2];
        invers[0][0] = matriks[1][1] / determinan;
        invers[0][1] = -matriks[0][1] / determinan;
        invers[1][0] = -matriks[1][0] / determinan;
        invers[1][1] = matriks[0][0] / determinan;
        return invers;
    }
}
