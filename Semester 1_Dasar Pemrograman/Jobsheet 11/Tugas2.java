import java.util.Scanner;
public class Tugas2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Apakah anda ingin mengakses menu? (y/n): ");
    String lanjut = sc.next();

    System.out.print("Masukkan jumlah menu : ");
    int jumlahMenu = sc.nextInt();

    int [][] rekapJual = new int[jumlahMenu][7];
    String[] menu = new String[jumlahMenu];

    while (lanjut.equalsIgnoreCase("y")) {
        System.out.println("1.Input Data\n2.Menampilkan Data\n3.Menu dengan Penjualan Tertinggi\n4.Rata - Rata Penjualan");
        System.out.print("\nMasukkan pilihan menu : ");
        int pilihan = sc.nextInt();

    switch (pilihan) {
        case 1:
        System.out.println("INPUT DATA PENJUALAN");
        inputData(rekapJual, menu);
        break;
        case 2: 
        System.out.println("DATA PENJUALAN");
        printData(rekapJual, menu);
        break;
        case 3: 
        System.out.println("MENU DENGAN PENJUALAN TERTINGGI");
        menuTertinggi(rekapJual, menu);
        break;
        case 4: 
        System.out.println("RATA - RATA PENJUALAN");
        rataPenjualan(rekapJual, menu);
        break;
        default:
        System.out.println("Input tidak valid!");
    }

    System.out.print("Apakah anda ingin mengakses menu? (y/n)");
    lanjut = sc.next();
}

}

public static void inputData (int [][]rekapJual, String []menu) {
    Scanner scan = new Scanner(System.in);
    
    for(int i = 0; i < menu.length; i++) {
        System.out.print("Masukkan menu " + (i+1) + ": ");
        menu[i] = scan.nextLine();
    }
    for(int i = 0; i < rekapJual.length; i++) {
        System.out.print(menu[i] + ":\n" );
        for(int j = 0; j < rekapJual[0].length; j++) {
                System.out.print("penjualan hari ke-" + (j+1) + ": ");
                rekapJual[i][j] = scan.nextInt();
        }    
    }

}

public static void printData (int [][] rekapJual, String [] menu) {

    System.out.println("rekap penjualan dari hari ke 1 - 7 : ");

        for (int i = 0; i < rekapJual.length; i++) {
            System.out.print(menu[i] + ": ");
                for (int j = 0; j < rekapJual[0].length; j++) {
                    System.out.print(rekapJual[i][j]);
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
}
public static void rataPenjualan (int [][] rekapJual, String[] menu) {
        int[] totalPenjualan = new int[menu.length];
        int [] rataMenu = new int[menu.length];
        for (int i = 0; i < rekapJual.length; i++) {
            totalPenjualan[i] = 0;
            for (int j = 0; j < rekapJual[0].length;j++) {
            totalPenjualan[i] += rekapJual[i][j];
            rataMenu[i] = totalPenjualan[i] / 7;
            }
        }        
        for (int i = 0; i < totalPenjualan.length; i++) {
            System.out.println("rata - rata penjualan menu " + menu[i] + " : " + rataMenu[i]);
        }
}

public static void menuTertinggi (int [][] rekapJual, String[] menu) {

    int dataTertinggi = 0;
    String menuTertinggi = menu[0];
    int mingguTertinggi = 0;

    for (int i = 0; i < rekapJual.length; i++) {
            for (int j = 0; j < rekapJual[0].length; j++) {
                if (rekapJual[i][j] > dataTertinggi) {
                    dataTertinggi = rekapJual[i][j];
                    menuTertinggi = menu[i];
                    mingguTertinggi = j + 1;
                }
            }
        }
        System.out.println("=========================");
        System.out.println("DATA PENJUALAN TERTINGGI");
        System.out.println("menu : " + menuTertinggi);
        System.out.println("jumlah penjualan : " + dataTertinggi);
        System.out.println("pada minggu ke - " + mingguTertinggi);

        System.out.println("\n=========================");
}
}