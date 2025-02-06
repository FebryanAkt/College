import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cari;
        int hasil = 0;

        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", 
                            "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu ke-" +(i+1)+ " adalah "+ menu[i]);
        }
        System.out.println("===================================");
        System.out.print("Masukkan pesanan yang anda cari: ");
        cari = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                hasil++;
                break;
            } 
        }
        if (hasil == 0 ) {
            System.out.println(cari + " tidak tersedia di menu");
        }else
        System.out.println(cari + " tersedia di menu");
    }
}