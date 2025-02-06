import java.util.Scanner;
public class TA {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String [][] nama = new String[5][5];
        String [][] nim = new String[5][5];
        String [][] kodeMatkul = new String[5][5];
        String [][] matkul = new String[5][5];
        int [][] jmlSks = new int[5][5];

        while (true) {
        System.out.println("=== Sistem Pemantauan KRS Mahasiswa ===");
        System.out.println("1. Tambah Data KRS");
        System.out.println("2. Tampilkan Data KRS");
        System.out.println("3. Analisis Data KRS");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
        int menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
            while (true) {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("--- Tambah Data KRS ---");
                        System.out.print("Nama Mahasiswa: ");
                        nama [i][j] = sc.nextLine();
                        System.out.print("Nim: ");
                        nim [i][j] = sc.nextLine();
                        System.out.print("Kode Mata Kuliah: ");
                        kodeMatkul [i][j] = sc.nextLine();
                        System.out.print("Nama Mata Kuliah: ");
                        matkul [i][j] = sc.nextLine();
                        System.out.print("Jumlah SKS: ");
                        jmlSks [i][j] = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Data mata kuliah berhasil ditambahkan.");
        
                        System.out.print("Tambah mata kuliah lain? (y/t): ");
                        String next = sc.nextLine();
        
                        if (next.equalsIgnoreCase("y")) {
                            System.out.print("Kode Mata Kuliah: ");
                            kodeMatkul [i][j] = sc.nextLine();
                            System.out.print("Nama Mata Kuliah: ");
                            matkul [i][j] = sc.nextLine();
                            System.out.print("Jumlah SKS: ");
                            jmlSks [i][j] = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Data mata kuliah berhasil ditambahkan.");
            
                            System.out.print("Tambah mata kuliah lain? (y/t): ");
                            next = sc.nextLine();
                        } else if (next.equalsIgnoreCase("t")) {
                            break;
                        }
                    }
                    break;
                }        
                break;
            }
            case 2:
                break;
            }

        }
    }
}