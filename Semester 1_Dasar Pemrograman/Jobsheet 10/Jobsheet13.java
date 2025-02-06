import java.util.Scanner;
public class Jobsheet13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] nama = new String[10][10];
        String[][] NIM = new String[10][10];
        String[][] kodeMK = new String[10][10];
        String[][] namaMK = new String[10][10];
        int[][] sks = new int[10][10];
        
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("===Sistem Pemantauan KRS Mahasiswa===");
            System.out.println("1. Tambah Data KRS");
            System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
            System.out.println("3. Analisis Data KRS");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    while (true) {
                        int totalSks = 0;
                        for (int i = 0; i < 10; i++) {
                            for (int j = 0; j < 10; j++) {
                                System.out.print("Nama mahasiswa: ");
                                nama[i][j] = sc.next();
                                System.out.print("NIM: ");
                                NIM[i][j] = sc.next();
                                sc.nextLine();
                                System.out.print("Kode Mata Kuliah: ");
                                kodeMK[i][j] = sc.next();
                                System.out.print("Nama Mata Kuliah: ");
                                namaMK[i][j] = sc.next();
                                System.out.print("Jumlah SKS (1-3): ");
                                sks[i][j] = sc.nextInt();
                                sc.nextLine();
                                if (sks[i][j] > 3) {
                                    
                                }
                                System.out.println("Data mata kuliah berhasil ditambahkan");
                                System.out.print("Tambah mata kuliah lain? (y/t): ");
                                String pilihan = sc.nextLine();
                                if (pilihan.equalsIgnoreCase("y")) {
                                    System.out.print("Kode Mata Kuliah: ");
                                    kodeMK[i][j] = sc.nextLine();
                                    System.out.print("Nama Mata Kuliah: ");
                                    namaMK[i][j] = sc.nextLine();
                                    System.out.print("Jumlah SKS (1-3): ");
                                    sks[i][j] = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Data mata kuliah berhasil ditambahkan");
                                    System.out.print("Tambah mata kuliah lain? (y/t): ");
                                    pilihan = sc.nextLine();

                                    
                                    totalSks++;                                   
                                } else if (pilihan.equalsIgnoreCase("t")) {
                                   System.out.println("Total SKS yang diambil: " + totalSks);
                                }
                            }
                        }
                        break;
                    }
                    break;
                    
                case 2:
                    System.out.println("Tampilkan Daftar KRS Mahasiswa");
                    break;
                case 3:
                    System.out.println("Analisis Data KRS");
                    break;
                case 4:
                    System.out.println("Keluar");
                    return;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        }
    }
}