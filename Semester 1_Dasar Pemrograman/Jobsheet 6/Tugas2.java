import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String jenisBuku, rabu;
        int jumlahBuku;

        System.out.print("Jenis buku: ");
        jenisBuku = input.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = input.nextInt();
        input.nextLine();
        System.out.print("Apakah sekarang hari rabu (y/n) ? = ");
        rabu = input.nextLine();

        if (rabu.equalsIgnoreCase("y")) { 

            if (jenisBuku == "kamus") {
                if (jumlahBuku > 2) {
                    System.out.println("Diskon 10% + 2% = 12%");
                } else {
                    System.out.println("Diskon 10%");
                }

            }else if (jenisBuku.equalsIgnoreCase ("novel")) {
                if (jumlahBuku > 3) {
                    System.out.println("Diskon 7% + 2% = 9%");
                } else {
                    System.out.println("Diskon 7% + 1% = 8%");
                }

            } else {
                if (jumlahBuku > 3) {
                    System.out.println("Diskon 5%");
                } else {
                    System.out.println("Tidak dapat diskon");
                }
            }
        }
        if (rabu.equalsIgnoreCase("n")) {
            System.out.println("Pemilik hanya mendiskon saat hari Rabu");
        }
    }   
}