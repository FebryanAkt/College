import java.util.Scanner;
public class kuisDaspro10 {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        byte jumlahBeras;
        int jumlahDesa, jumlahKk;

        System.out.print("Masukkan jumlah desa di Kabupaten Malang: ");
        jumlahDesa = input.nextInt();
        System.out.print("Masukkan jumlah KK di Kabupaten Malang: ");
        jumlahKk = input.nextInt();
        System.out.print("Masukkan jumlah beras: ");
        jumlahBeras = input.nextByte();

        jumlahDesa = jumlahKk * jumlahBeras;

        System.out.println("=======================================================================");
        System.out.println("Jumlah beras yang diterima pada masing-masing keluarga adalah: kwintal " +jumlahBeras);
        System.out.println("Jumlah beras yang diterima pada masing-masing desa adalah: kwintal " + jumlahDesa );
        System.out.println("=======================================================================");
    }
}
    