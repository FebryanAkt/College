import java.util.Scanner;
public class Tugas2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Program untuk Menghitung Volume, Luas Permukaan, Keliling Kubus ===");
            System.out.println("1. Menghitung hasil perhitungan Volume");
            System.out.println("2. Menghitung hasil perhitungan Luas Permukaan");
            System.out.println("3. Menghitung hasil perhitungan Keliling");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    Volume();
                    break;
                case 2:
                    LuasPermukaan();
                    break;
                case 3:
                    Keliling();
                    break;
                case 4:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 4);
    }
    
    static void Volume() {
        System.out.print("Masukkan jumlah sisi1: ");
        int s1 = sc.nextInt();
        System.out.print("Masukkan jumlah sisi2: ");
        int s2 = sc.nextInt();
        System.out.print("Masukkan jumlah sisi3: ");
        int s3 = sc.nextInt();
        
        int v = s1 * s2 * s3; 
        System.out.println("Volumenya adalah: " + v);
    }

    static void LuasPermukaan() {

        System.out.print("Masukkan jumlah sisi1: ");
        int sisi1 = sc.nextInt();
        System.out.print("Masukkan jumlah sisi2: ");
        int sisi2 = sc.nextInt();

        int lp = 6 * (sisi1 * sisi2);
        System.out.println("Luas Permukaannya adalah: " + lp);
    }

    static void Keliling() {
        System.out.print("Masukkan jumlah sisi: ");
        int sisi = sc.nextInt();

        int k = 12 * sisi; 
        System.out.println("Waktunya adalah: " + k);
    }
}