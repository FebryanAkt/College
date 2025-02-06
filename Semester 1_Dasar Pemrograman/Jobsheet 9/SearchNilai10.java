import java.util.Scanner;
public class SearchNilai10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hasil = 0, jumlah, cari;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        jumlah = sc.nextInt();

        int [] nilaiMhs = new int [jumlah];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        cari = sc.nextInt();

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (cari == nilaiMhs[i]) {
                hasil = i+1;
                break;
            }
        }
        if (hasil !=0) {
            System.out.println();
            System.out.println("Nilai "+ cari+ " ketemu, merupakan nilai mahasiswa ke-" +hasil);   
        } else {
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}