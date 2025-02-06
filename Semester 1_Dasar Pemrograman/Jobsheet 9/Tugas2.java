import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int jmlPesan, total = 0;
        System.out.print("Masukkan banyak pesanan: ");
        jmlPesan = sc.nextInt();
        sc.nextLine();
        System.out.println("==================================");
        
        String [] pesanan = new String [jmlPesan];

        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("Masukkan nama makanan/minuman: ");
            pesanan[i] = sc.nextLine();
        }
        System.out.println("==================================");

        int [] harga = new int [jmlPesan];

        for (int i = 0; i < harga.length; i++) {
            System.out.print("Masukkan harga "+ pesanan[i]+": ");
            harga[i] = sc.nextInt();
            total +=harga[i];
        }
        
        System.out.println("==================================");
        System.out.println("Jumlah pesanan anda adalah: " + jmlPesan);
        
        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("Menu ke-" +(i+1)+ " adalah " + pesanan[i] + " dengan harga: " + harga[i]);
            System.out.println();
        }
        System.out.println("Total biaya adalah: " + total);
        System.out.println("==================================");
    }
}