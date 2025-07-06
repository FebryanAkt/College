import java.util.Scanner;
public class DLLMain10 {
    public static Mahasiswa10 inputMahasiswa(Scanner scan){
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        System.out.println();
        return new Mahasiswa10(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        DoubleLinkedList10 list = new DoubleLinkedList10();
        Scanner scan = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Tambah setelah NIM");
            System.out.println("7. Tambah data pada indeks tertentu");
            System.out.println("8. Hapus data setelah NIM tertentu");
            System.out.println("9. Hapus data pada indeks tertentu");
            System.out.println("10. Tampilkan data head");
            System.out.println("11. Tampilkan data tail");
            System.out.println("12. Tampilkan data pada indeks tertentu");
            System.out.println("13. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();

            switch (pilihan) {
                case 1 -> {
                    scan.nextLine(); 
                    Mahasiswa10 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    scan.nextLine(); 
                    Mahasiswa10 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM: ");
                    scan.nextLine();
                    String cari = scan.nextLine();
                    Mahasiswa10 mhs = inputMahasiswa(scan);
                    list.insertAfter(cari, mhs);
                }
                case 7 -> {
                    System.out.print("Masukkan indeks: ");
                    int idx = scan.nextInt(); scan.nextLine();
                    Mahasiswa10 mhs = inputMahasiswa(scan);
                    list.add(mhs, idx);
                }
                case 8 -> {
                    System.out.print("Masukkan NIM: ");
                    String nim = scan.nextLine();
                    list.removeAfter(nim);
                }
                case 9 -> {
                    System.out.print("Masukkan indeks: ");
                    int idx = scan.nextInt(); scan.nextLine();
                    list.remove(idx);
                }   
                case 10 -> list.getFirst();
                case 11 -> list.getLast();
                case 12 -> {
                    System.out.print("Masukkan indeks: ");
                    int idx = scan.nextInt(); scan.nextLine();
                    list.getIndex(idx);
                }
                case 13 -> System.out.println("Jumlah data: " + list.size());
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

}
