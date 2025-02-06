import java.util.Scanner;
public class ArrayRataNilai10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int jmlMhs;
        double total = 0;
        double rata2;
        double rataLulus, rataTdkLulus;
        double totalLulus = 0;
        double totalTdkLulus = 0;
        int lulus = 0;
        int tdkLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();

        int [] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i <nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
            } else {
                tdkLulus++;
                totalTdkLulus += nilaiMhs[i];
            }
        }
        rataLulus = totalLulus / lulus;
        rataTdkLulus = totalTdkLulus / tdkLulus;
        System.out.println("Rata-rata nilai lulus = " +rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " +rataTdkLulus);

        
    }
}