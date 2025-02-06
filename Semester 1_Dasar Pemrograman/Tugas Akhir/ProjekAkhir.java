import java.util.Scanner;

public class ProjekAkhir {

    // untuk menyimpan nama, nim, kode mk, nama mk
    static String[][] daftarKRS = new String[100][100];
    static int jumlahMahasiswa = 0;
    static Scanner sc = new Scanner(System.in);
    static int totalMhs=0;
    // untuk menyimpan jumlah sks tiap matkul
    static int [][] SKS= new int[100][24];
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

        
        // nyimpan nama
        daftarKRS[jumlahMahasiswa][0] = nama;
        // nyimpan nim
        daftarKRS[jumlahMahasiswa][1] = nim;

        int totalSKS = 0;

        while (jumlahMahasiswa < 24){
            System.out.print("Masukkan Kode Mata Kuliah: ");
            daftarKRS[jumlahMahasiswa][2+totalMhs*3] = sc.nextLine();
            System.out.print("Masukkan Nama Mata Kuliah: ");
            daftarKRS[jumlahMahasiswa][2+totalMhs*3+1] = sc.nextLine();
            System.out.print("Masukkan Jumlah SKS (1-3): ");
            int sks = sc.nextInt();
           
            totalMhs++;
            
            sc.nextLine();
            SKS[jumlahMahasiswa][totalMhs] = sks;
            
            if (sks < 1 || sks > 3) {
                System.out.println("SKS harus antara 1 dan 3!");
                continue;
            }if (sks >= 1 && sks <= 3) {
                System.out.println("Data mata kuliah berhasil ditambahkan.");
                }
            daftarKRS[jumlahMahasiswa][4] = String.valueOf(sks);
            totalSKS += sks;
            System.out.print("Tambah mata kuliah lagi? (y/t): ");
                String jawab = sc.nextLine();
                if (jawab.equalsIgnoreCase("t")) {
                    break;
                    
                }
            }

            jumlahMahasiswa++;
            System.out.println("Total SKS : " + totalSKS);
        } 


        static void tampilkanKRS() {
            System.out.println("\n--- Tampilkan Daftar KRS Mahasiswa ---");
            System.out.print("Masukkan NIM mahasiswa: ");
            String nimCari = sc.nextLine();
        
            boolean ditemukan = false;
            int totalSKS = 0;
        
            System.out.println("\nDaftar KRS:");
            System.out.printf("%-12s %-20s %-10s %-25s %-5s%n", 
                "NIM", "Nama", "Kode MK", "Nama Mata Kuliah", "SKS");
        
           
            for (int i = 0; i < jumlahMahasiswa; i++) {
                if (daftarKRS[i][1].equals(nimCari)) {
                    for (int j = 0; j < totalMhs; j++) {
                        if (daftarKRS[i][2+j*3] != null) {  
                            System.out.printf("%-12s %-20s %-10s %-25s %-5d%n",
                                daftarKRS[i][1],    
                                daftarKRS[i][0],    
                                daftarKRS[i][2+j*3],    
                                daftarKRS[i][2+j*3+1],  
                                SKS[i][j+1]);   
                            totalSKS += SKS[i][j+1];
                            ditemukan = true;
                        }
                    }
                }
            }
        
            if (ditemukan) {
                System.out.println("Total SKS: " + totalSKS);
            } else {
                System.out.println("Data KRS tidak ditemukan untuk NIM tersebut.");
            }
}
         static void analisisKRS() {
        int jumlahMahasiswaSKSKurang = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            // casting string ke int
            int totalSKS = Integer.parseInt(daftarKRS[i][4]);

            if (totalSKS < 20) {
                jumlahMahasiswaSKSKurang++;
            }
        }
        System.out.println("\n--- Analisis Data KRS ---");
        System.out.println("Jumlah mahasiswa dengan SKS kurang dari 20: " + jumlahMahasiswaSKSKurang);
}
}