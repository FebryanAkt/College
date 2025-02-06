import java.util.Scanner;

public class Jobsheet13Mantap {

    static String[] namaMahasiswa = new String[100];
    static String[] nimMahasiswa = new String[100];
    static String[][] kodeMataKuliah = new String[100][10];
    static String[][] namaMataKuliah = new String[100][10];
    static int[][] sksMataKuliah = new int[100][10];
    static int[] jumlahMataKuliah = new int[100];
    static int jumlahMahasiswa = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=== Sistem Pemantauan KRS Mahasiswa ===");
            System.out.println("1. Tambah Data KRS");
            System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
            System.out.println("3. Analisis Data KRS");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = Integer.parseInt(scanner.nextLine());

            switch (menu) {
                case 1:
                    tambahDataKRS(scanner);
                    break;
                case 2:
                    tampilkanDaftarKRS(scanner);
                    break;
                case 3:
                    analisisDataKRS();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }

    static void tambahDataKRS(Scanner scanner) {
        System.out.println("\n--- Tambah Data KRS ---");
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        namaMahasiswa[jumlahMahasiswa] = nama;
        nimMahasiswa[jumlahMahasiswa] = nim;

        while (true) {
            System.out.print("Kode Mata Kuliah: ");
            String kodeMK = scanner.nextLine();
            System.out.print("Nama Mata Kuliah: ");
            String namaMK = scanner.nextLine();
            System.out.print("Jumlah SKS (1-3): ");
            int sks = Integer.parseInt(scanner.nextLine());

            if (sks < 1 || sks > 3) {
                System.out.println("Jumlah SKS tidak valid! SKS harus antara 1 dan 3.");
                continue;
            }

            int indexMK = jumlahMataKuliah[jumlahMahasiswa];
            kodeMataKuliah[jumlahMahasiswa][indexMK] = kodeMK;
            namaMataKuliah[jumlahMahasiswa][indexMK] = namaMK;
            sksMataKuliah[jumlahMahasiswa][indexMK] = sks;
            jumlahMataKuliah[jumlahMahasiswa]++;

            System.out.println("Data mata kuliah berhasil ditambahkan.");
            System.out.print("Tambah mata kuliah lain? (y/t): ");
            String lanjut = scanner.nextLine();
            if (lanjut.equalsIgnoreCase("t")) {
                break;
            }
        }

        int totalSKS = hitungTotalSKS(jumlahMahasiswa);
        System.out.println("Total SKS yang diambil: " + totalSKS);
        System.out.println(" ");
        jumlahMahasiswa++;
    }

    static void tampilkanDaftarKRS(Scanner scanner) {
        System.out.println("\n--- Tampilkan Daftar KRS Mahasiswa ---");
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        int indexMahasiswa = cariMahasiswa(nim);
        if (indexMahasiswa == -1) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
            System.out.println(" ");
            return;
        }

        System.out.println("\nDaftar KRS:");
        System.out.println("NIM        Nama       Kode MK    Nama Mata Kuliah         SKS");
        for (int i = 0; i < jumlahMataKuliah[indexMahasiswa]; i++) {
            System.out.printf("%-10s %-10s %-10s %-25s %d\n", nimMahasiswa[indexMahasiswa], namaMahasiswa[indexMahasiswa],
            kodeMataKuliah[indexMahasiswa][i], namaMataKuliah[indexMahasiswa][i], sksMataKuliah[indexMahasiswa][i]);
        }
        System.out.println("Total SKS: " + hitungTotalSKS(indexMahasiswa));
        System.out.println(" ");
    }

    static void analisisDataKRS() {
        System.out.println("\n--- Analisis Data KRS ---");
        System.out.println(" ");
        int jumlahKurang20 = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (hitungTotalSKS(i) < 20) {
                jumlahKurang20++;
            }
        }
        System.out.println("Jumlah mahasiswa yang mengambil SKS kurang dari 20: " + jumlahKurang20);
        System.out.println(" ");
    }

    static int hitungTotalSKS(int indexMahasiswa) {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMataKuliah[indexMahasiswa]; i++) {
            totalSKS += sksMataKuliah[indexMahasiswa][i];
        }
        return totalSKS;
    }

    static int cariMahasiswa(String nim) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nimMahasiswa[i].equals(nim)) {
                return i;
            }
        }
        return -1;
    }
}