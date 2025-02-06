import java.util.Scanner;

public class Tu {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Berikan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Berikan diskon 30%!");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - RP 15,000");
        System.out.println("2. Cappuccino - RP 20,000");
        System.out.println("3. Latte - RP 22,000");
        System.out.println("4. Teh Tarik - RP 12,000");
        System.out.println("5. Roti Bakar - RP 10,000");
        System.out.println("6. Mie Goreng - RP 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int[] pilihanMenu, int[] banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = 0;

        for (int i = 0; i < pilihanMenu.length; i++) {
            hargaTotal += hargaItems[pilihanMenu[i] - 1] * banyakItem[i];
        }

        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal * 50 / 100;
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Apakah Anda member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine(); 
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        Menu(namaPelanggan, isMember, kodePromo);

        System.out.print("Berapa banyak menu yang ingin Anda pesan? ");
        int jumlahPesanan = sc.nextInt();
        int[] pilihanMenu = new int[jumlahPesanan];
        int[] banyakItem = new int[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nomor menu untuk pesanan ke-" + (i + 1) + ": ");
            pilihanMenu[i] = sc.nextInt();
            System.out.print("Masukkan jumlah item untuk menu ke-" + (i + 1) + ": ");
            banyakItem[i] = sc.nextInt();
        }

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}
