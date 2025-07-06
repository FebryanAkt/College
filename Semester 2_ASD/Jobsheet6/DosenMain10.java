import java.util.Scanner;
public class DosenMain10 {
    public static void main(String[] args) {
        DataDosen10 list = new DataDosen10();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis kelamin (L/P): ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine(); 
            System.out.println("----------------------");
            
            list.tambah(new Dosen10(kode, nama, jenisKelamin, usia));
        }
        System.out.println("Data dosen sebelum sorting: ");
        list.tampil();

        System.out.println("Data dosen setelah sorting menggunakan BUBBLE SORT (ASC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data dosen setelah sorting menggunakan INSERTION SORT (DSC)");
        list.insertionSort();
        list.tampil();
    }
}