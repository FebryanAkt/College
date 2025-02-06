import java.util.Scanner;

public class TugasAkhir {
    
    static String[][] daftarKRS = new String[30][5];
    static int jumlahMahasiswa = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Sistem Pemantauan KRS Mahasiswa ===");
            System.out.println("1. Tambah Data KRS");
            System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
            System.out.println("3. Analisis Data KRS");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    tambahKRS();
                    break;
                case 2:
                    tampilkanKRS();
                    break;
                case 3:
                    analisisKRS();
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

    static void tambahKRS() {
        System.out.println("\n --- Tambah Data KRS ---");
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarKRS[i][1].equals(nim)) {
                System.out.println("Mahasiswa dengan NIM " + nim + " sudah terdaftar.");
                return;
            }
        }

        daftarKRS[jumlahMahasiswa][0] = nama;
        daftarKRS[jumlahMahasiswa][1] = nim;

        int totalSKS = 0;
        do {
            System.out.print("Masukkan Kode Mata Kuliah: ");
            daftarKRS[jumlahMahasiswa][2] = sc.nextLine();
            System.out.print("Masukkan Nama Mata Kuliah: ");
            daftarKRS[jumlahMahasiswa][3] = sc.nextLine();
            System.out.print("Masukkan Jumlah SKS (1-3): ");
            int sks = sc.nextInt();
            if (sks > 1 && sks < 3) {
                System.out.println("Data mata kuliah berhasil ditambahkan.");
            }

            sc.nextLine();

            if (sks < 1 || sks > 3) {
                System.out.println("SKS harus antara 1 dan 3!");
            }

            daftarKRS[jumlahMahasiswa][4] = String.valueOf(sks);
            totalSKS += sks;

            if (totalSKS > 24) {
                System.out.println("Total SKS tidak boleh lebih dari 24! SKS saat ini: " + totalSKS);
                break;
            }
            

            System.out.print("Tambah mata kuliah lagi? (y/n): ");
        } while (sc.nextLine().equalsIgnoreCase("y"));

        jumlahMahasiswa++;
    }

    static void tampilkanKRS() {
        System.out.print("Masukkan NIM yang dicari: ");
        String nimCari = sc.nextLine();

        boolean ditemukan = false;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarKRS[i][1].equals(nimCari)) {
                System.out.println("Nama: " + daftarKRS[i][0]);
                System.out.println("Mata Kuliah: " + daftarKRS[i][3] + " (" + daftarKRS[i][2] + ")");
                System.out.println("SKS: " + daftarKRS[i][4]);
                totalSKS += Integer.parseInt(daftarKRS[i][4]);
                ditemukan = true;
            }
        }

        if (ditemukan) {
            System.out.println("Total SKS: " + totalSKS);
        } else {
            System.out.println("Data KRS tidak ditemukan untuk NIM tersebut.");
        }
    }

    static void analisisKRS() {
        int jmlMhsSKS = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            int totalSKS = Integer.parseInt(daftarKRS[i][4]);

            if (totalSKS < 20) {
                jmlMhsSKS++;
            }
        }
        System.out.println("\n--- Analisis Data KRS ---");
        System.out.println("Jumlah mahasiswa dengan SKS kurang dari 20: " + jmlMhsSKS);
    }
}