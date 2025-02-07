import java.util.Scanner;
public class Array2DFebryan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double [][] nilaiMhs = new double[3][5];
        double [] rata2 = new double[3];

        System.out.println("=== Input Nilai Mahasiswa ===");

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("\nMahasiswa ke-"+(i+1));
            double totalMhs = 0;
            
            for (int j = 0; j < nilaiMhs[i].length; j++) {
                System.out.print("Masukkan nilai ke-"+(j+1)+": ");
                nilaiMhs[i][j] = sc.nextDouble();
                totalMhs += nilaiMhs[i][j];
            }
            rata2[i] = totalMhs / nilaiMhs[i].length;
        }
        System.out.println("\n=== Nilai Rata-Rata ===");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " dengan rata-rata = " + rata2[i]);
        }
    }
}