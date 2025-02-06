import java.util.Scanner;
public class Pemilihan2Percobaan210 {
    public static void main(String[] args) {
        
        Scanner sc10 = new Scanner(System.in);
        int pilihan_menu;
        String member, qris;
        double diskon, harga, total_bayar;

        System.out.println("======================="); 
        System.out.println("==== MENU KAFE JTI ===="); 
        System.out.println("-----------------------"); 
        System.out.println("1. Ricebowl");  
        System.out.println("2. Ice Tea"); 
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)"); 
        System.out.println("======================================");

        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = sc10.nextInt();
        sc10.nextLine();
        System.out.print("Apakah punya member (y/n) ? = "); 
        member = sc10.nextLine();
        System.out.print("Apakah pembayaran melalui QRIS (y/n) ? = ");
        qris = sc10.nextLine();
        System.out.println("======================================"); 
 
        //Jika punya member
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            System.out.println("Besar diskon memakai QRIS = 1000");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            if (qris.equalsIgnoreCase("y")) {
                total_bayar = total_bayar - 1000;
            }
        
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        } else if (member.equalsIgnoreCase("n")) {
            
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            if (qris.equalsIgnoreCase("y")) {
                harga = harga - 1000;
            }

            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("--------------------------------------");
    }
}