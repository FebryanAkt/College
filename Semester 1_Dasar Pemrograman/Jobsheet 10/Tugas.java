import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] hasilSurv = new int[10][6];

        for (int i = 0; i < hasilSurv.length; i++) {
            System.out.println("Masukkan hasil survei untuk Responden ke-" + (i + 1));
            for (int j = 0; j < hasilSurv[i].length; j++) {
                System.out.print("Nilai untuk Pertanyaan " + (j + 1) + " (1-5): ");
                hasilSurv[i][j] = sc.nextInt();
            }
        }
        System.out.println(" ");
        System.out.println("Rata-rata untuk setiap Responden : ");
        for (int i = 0; i < hasilSurv.length; i++) {
            int total = 0;
            for (int j = 0; j < hasilSurv[i].length; j++) {
                total += hasilSurv[i][j];
            }
            double rataResp = (double) total / hasilSurv[i].length;
            System.out.println("Rata-rata untuk Responden ke-" + (i + 1) +" : "  + rataResp);
        }
        System.out.println(" ");
        System.out.println("Rata-rata untuk setiap Pertanyaan : ");
        for (int j = 0; j < hasilSurv[j].length; j++) {
            int total = 0;
            for (int i = 0; i < hasilSurv.length; i++) {
                total += hasilSurv[i][j];
            }
            double rataPert = (double) total / hasilSurv.length;
            System.out.println("Rata-rata untuk Pertanyaan ke-" + (j + 1) +" : "  + rataPert);
        }   

        double totalSeluruh = 0;
        int jumlah = 0;
        for (int i = 0; i < hasilSurv.length; i++) {
            for (int j = 0; j < hasilSurv[i].length; j++) {
                totalSeluruh  += hasilSurv[i][j];
                jumlah++;
            }
        }
        double rataSeluruh = totalSeluruh  / jumlah;
        System.out.println(" ");
        System.out.print("Rata-rata keseluruhan : " + rataSeluruh);

        sc.close();
    }
}
