import java.util.Scanner;
public class MahasiswaDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        sc.nextLine();
        
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10(jumlahMhs);
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 
            
            list.tambah(new Mahasiswa10(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("--------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------");
        System.out.println("Masukkan IPK mahasiwa yang dicari");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        
        System.out.println("-------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-------------------------");
        double posisi2 = list.findBinarySearch(cari,0,jumlahMhs-1);
        int pss2= (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}