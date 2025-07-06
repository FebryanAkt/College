import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] daftarMhs = new Mahasiswa[3];
        daftarMhs[0] = new Mahasiswa("22001", "Ali Rahman","Informatika"  );
        daftarMhs[1] = new Mahasiswa("22002", "Budi Santoso","Informatika"  );
        daftarMhs[2] = new Mahasiswa("22003", "Citra Dewi","Sistem Informasi Bisnis"  );

        MataKuliah[] daftarMtk = new MataKuliah[3];
        daftarMtk[0] = new MataKuliah("MK001", "Struktur Data", 3);
        daftarMtk[1] = new MataKuliah("MK002", "Basis Data", 3);
        daftarMtk[2] = new MataKuliah("MK003", "Desain Web", 3);

        Penilaian[] daftarNilai = new Penilaian[5];
        daftarNilai[0] = new Penilaian(daftarMhs[0], daftarMtk[0], 80,   85, 90);
        daftarNilai[1] = new Penilaian(daftarMhs[0], daftarMtk[1], 60,   75, 70);
        daftarNilai[2] = new Penilaian(daftarMhs[1], daftarMtk[0], 75,   70, 80);
        daftarNilai[3] = new Penilaian(daftarMhs[2], daftarMtk[1], 85,   90, 95);
        daftarNilai[4] = new Penilaian(daftarMhs[2], daftarMtk[2], 80,   90, 65);
        
        int menu;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("6. Update Nilai");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa: ");
                    for (Mahasiswa mhs : daftarMhs) {
                        mhs.tampilMahasiswa();
                    }
                    break;
                
                case 2:
                    System.out.println("\nDaftar Mata Kuliah: ");
                    for (MataKuliah mtk : daftarMtk) {
                        mtk.tampilMatakuliah();
                    }
                    break;

                case 3:
                    System.out.println("\nData Penilaian: ");
                    for (Penilaian nilai : daftarNilai) {
                        nilai.tampilNilai();
                    }
                    break;

                case 4:
                    SortnSearch.sortNilai(daftarNilai);
                    System.out.println("\nData Penilaian: ");
                    for (Penilaian nilai : daftarNilai) {
                        nilai.tampilNilai();
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    int temp = SortnSearch.searchMhs(daftarMhs, cari);
                    SortnSearch.tampilSearch(temp, daftarMhs);
                    break;
                    
                case 6: 
                System.out.println("\nUpdate Nilai:");
                System.out.print("Masukkan NIM: ");
                String nimUpdate = sc.nextLine();
                System.out.print("Masukkan Kode MK: ");
                String MKUpdate = sc.nextLine();
            
                int indexMhs = SortnSearch.searchMhs(daftarMhs, nimUpdate);
                if (indexMhs == -1) {
                    System.out.println("Mahasiswa dengan NIM " + nimUpdate + " tidak ditemukan.");
                    break;
                }
            
                int indexPenilaian = -1;
                for (int i = 0; i < daftarNilai.length; i++) {
                    if (daftarNilai[i].mahasiswa.NIM.equals(nimUpdate) && daftarNilai[i].mataKuliah.kodeMK.equals(MKUpdate)) {
                        indexPenilaian = i;
                        break;
                    }
                }
            
                if (indexPenilaian == -1) {
                    System.out.println("Penilaian dengan NIM " + nimUpdate + " dan Kode MK " + MKUpdate + " tidak ditemukan");
                    break;
                }
            
                System.out.println("\nPilih nilai yang ingin diupdate:");
                System.out.println("1. Nilai Tugas");
                System.out.println("2. Nilai UTS");
                System.out.println("3. Nilai UAS");
                System.out.print("Pilihan: ");
                int pilihan = sc.nextInt();
            
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan nilai Tugas baru: ");
                        daftarNilai[indexPenilaian].nilaiTugas = sc.nextDouble();
                        break;
                    case 2:
                        System.out.print("Masukkan nilai UTS baru: ");
                        daftarNilai[indexPenilaian].nilaiUTS = sc.nextDouble();
                        break;
                    case 3:
                        System.out.print("Masukkan nilai UAS baru: ");
                        daftarNilai[indexPenilaian].nilaiUAS = sc.nextDouble();
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            
                daftarNilai[indexPenilaian].hitungNilaiAkhir();
                System.out.println("Nilai berhasil diupdate");
                break;

                case 0:
                    System.out.println("\nKeluar dari program! Terima kasih");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid");
                    break;
            }
        } while (menu != 0);
    }
}
