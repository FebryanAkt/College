import java.util.Scanner;
public class Tugas3 {

    static String [] namaMk = new String [10];
    static int [] sks = new int [10];
    static int [] Semester = new int [10];
    static String [] hari = new String [7];
    static Scanner sc = new Scanner (System.in);
     
    public static void main(String[] args) {
        int pilihan;
        String lanjut;
        do {
            System.out.println("1. Input data MK");
            System.out.println("2. Tampilkan jadwal kuliah");
            System.out.println("3. Tampilkan jadwal kuliah hari tertentu");
            System.out.println("4. Tampilkan jadwal kuliah semester tertentu");
            System.out.println("5. Cari mata kuliah");
            System.out.println("6. Keluar");

            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    inputDataMk(namaMk, hari, Semester, sks);
                    break;
                case 2:
                    tampilJadwal();
                    break;
                case 3:
                    hariTertentu();
                    break;
                case 4:
                    semesterTertentu();
                    break;
                case 5:
                    cariMataKuliah();
                    break;
                case 6:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
            System.out.print("Apakah anda ingin mengakses menu lagi? (y/n): ");
            lanjut = sc.next();
            System.out.println();
        } while (lanjut.equalsIgnoreCase("y"));
    }

    static void inputDataMk(String [] namaMk, String [] hari, int [] semester, int [] sks) {
        System.out.println("\n === Tambah Data MK ===");
        System.out.print("");
        for (int i = 0; i < namaMk.length; i++) {
            System.out.println("\nJadwal Kuliah ke " + (i+1) );
            System.out.print("Nama matkul: ");
            namaMk[i] = sc.nextLine();
            System.out.print("Hari: ");
            hari[i] = sc.nextLine();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            System.out.print("Jumlah SKS: ");
            sks[i] = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Lanjut input data? (y/n): ");
            String jawab = sc.nextLine();
            if (jawab.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    static void tampilJadwal() {
        System.out.println("\n=== Jadwal Kuliah ===");
        System.out.println("No\tMata Kuliah\tHari\tSemester\tSKS");
        System.out.println("------------------------------------------------");
        
        for (int i = 0; i < namaMk.length; i++) {
            if (namaMk[i] != null) {
                System.out.printf("%d\t%s\t\t%s\t%d\t\t%d\n", 
                    (i+1), namaMk[i], hari[i], Semester[i], sks[i]);
            }
        }
    }

    static void hariTertentu() {
        System.out.print("\nMasukkan hari yang ingin ditampilkan: ");
        String cariHari = sc.nextLine();
        
        System.out.println("\n=== Jadwal Kuliah Hari " + cariHari + " ===");
        System.out.println("No\tMata Kuliah\tSemester\tSKS");
        System.out.println("------------------------------------------------");
        
        boolean found = false;
        int nomor = 1;
        
        for (int i = 0; i < hari.length; i++) {
            if (hari[i] != null && hari[i].equalsIgnoreCase(cariHari)) {
                System.out.printf("%d\t%s\t\t%d\t\t%d\n", 
                    nomor++, namaMk[i], Semester[i], sks[i]);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + cariHari);
        }
    }

    static void semesterTertentu() {
        System.out.print("\nMasukkan semester yang ingin ditampilkan: ");
        int cariSemester = sc.nextInt();
        sc.nextLine(); 
        
        System.out.println("\n=== Jadwal Kuliah Semester " + cariSemester + " ===");
        System.out.println("No\tMata Kuliah\tHari\t\tSKS");
        System.out.println("------------------------------------------------");
        
        boolean found = false;
        int nomor = 1;
        
        for (int i = 0; i < Semester.length; i++) {
            if (namaMk[i] != null && Semester[i] == cariSemester) {
                System.out.printf("%d\t%s\t\t%s\t\t%d\n", 
                    nomor++, namaMk[i], hari[i], sks[i]);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah untuk semester " + cariSemester);
        }
    }

    static void cariMataKuliah() {
        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String cariMk = sc.nextLine();
        
        System.out.println("\n=== Hasil Pencarian Mata Kuliah ===");
        System.out.println("No\tMata Kuliah\tHari\tSemester\tSKS");
        System.out.println("------------------------------------------------");
        
        boolean found = false;
        int nomor = 1;
        
        for (int i = 0; i < namaMk.length; i++) {
            if (namaMk[i] != null && namaMk[i].toLowerCase().contains(cariMk.toLowerCase())) {
                System.out.printf("%d\t%s\t\t%s\t%d\t\t%d\n", 
                    nomor++, namaMk[i], hari[i], Semester[i], sks[i]);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Mata kuliah '" + cariMk + "' tidak ditemukan");
        }
    }
}