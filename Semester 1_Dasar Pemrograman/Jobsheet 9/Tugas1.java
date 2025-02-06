import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int jmlMhs, total = 0, rata2, terendah = 100, tertinggi = 0;

        System.out.print("Masukkan banyak Mahasiswa: ");
        jmlMhs = sc.nextInt();

        int [] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswwa ke-" + (i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            } if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println("Nilai Mahasiswa tertinggi adalah: " + tertinggi);
        System.out.println("Nilai Mahasiswa terendah adalah: " + terendah);
        System.out.println();

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai: " +rata2);
        System.out.println();

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" +(i+1)+ " adalah "+ nilaiMhs[i] );
        }
    }
}