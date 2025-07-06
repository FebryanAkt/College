import java.util.Scanner;

public class DosenDemo10 {
    public static void main(String[] args) {
        DataDosen10 list = new DataDosen10();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        for (int i = 0; i < 5; i++) { 
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

        do {
            System.out.println("\n===== MENU PENCARIAN =====");
            System.out.println("1. Pencarian berdasarkan nama (Sequential Search)");
            System.out.println("2. Pencarian berdasarkan usia (Binary Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    System.out.println("Pencarian Sequential berdasarkan nama");
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    int[] hasilSequential = list.PencarianDataSequential10(cariNama);
                    list.tampilHasilPencarian("dosen", "nama " + cariNama, hasilSequential);
                    break;
                    
                case 2:
                    System.out.println("Pencarian Binary berdasarkan usia");
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    sc.nextLine(); 
                    int[] hasilBinary = list.PencarianDataBinary10(cariUsia);
                    list.tampilHasilPencarian("dosen", "usia " + cariUsia, hasilBinary);
                    break;
                    
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        sc.close();
    }
}