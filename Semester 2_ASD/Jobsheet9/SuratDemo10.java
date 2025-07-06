import java.util.Scanner;
public class SuratDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int size = sc.nextInt();
        sc.nextLine();
        StackSurat10 stack = new StackSurat10(size);
        int pilih;
        String terima = "";

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Id Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama: ");
                    String namaMahasiwa = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin: ");
                    char jenisIzin = sc.next().charAt(0);
                    System.out.print("Durasi Izin: ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat10 srt = new Surat10 (idSurat, namaMahasiwa, kelas, jenisIzin, durasi);
                    stack.push(srt);
                    System.out.printf("Surat %s berhasil dikumpulkan\n", srt.namaMahasiswa);
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        Surat10 trm = new Surat10();
                        System.out.println("Daftar semua Surat:");
                        System.out.println("ID Surat     Nama      Kelas     Keterangan     Durasi (Hari)");
                        stack.print();
                        System.out.println("");
                        System.out.printf("Apakah surat %s diterima? (y/n)", stack.peek().namaMahasiswa);
                        terima = sc.nextLine();
                        if (terima.equalsIgnoreCase("y")) {
                            trm = stack.pop();
                            System.out.printf("Surat dari %s diterima.\n", trm.namaMahasiswa);
                        } else if (terima.equalsIgnoreCase("n")) {
                            System.out.printf("Surat dari %s tidak diterima.", stack.peek().namaMahasiswa);
                        } else {
                            System.out.println("Keterangan yang anda masukkan tidak vali!");
                        }
                    } else {
                        System.out.println("Tidak ada surat untuk diproses.");
                    }
                    break;

                case 3:
                    Surat10 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                        System.out.println("");
                    }
                    break;

                case 4:
                    SearchingSurat10 pencari = new SearchingSurat10();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String cariNama = sc.nextLine();
                    int hasil = pencari.searchingSurat(stack, cariNama, size);
                    if (hasil != -1) {
                        System.out.println("Detail Surat: ");
                        System.out.println("ID Surat     Nama      Kelas     Keterangan     Durasi (Hari)");
                        stack.printCari(hasil);
                        System.out.println("");
                    } else {
                        System.out.println("Surat tidak ditemukan.\n");
                    }
                    break;

                default: 
                    System.out.println("Pilihan tidak valid.\n");
                    break;
            }

        } while(pilih >= 1 && pilih <=4);
    }
}