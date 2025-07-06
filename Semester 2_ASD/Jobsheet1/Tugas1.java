import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char kode[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'K', 'L', 'T'};
        String kota[] = {
            "BANTEN",
            "JAKARTA",
            "BANDUNG",
            "CIREBON",
            "BOGOR",
            "PEKALONGAN",
            "SEMARANG",
            "PATI",
            "SURABAYA",
            "TEGAL"
        };

        System.out.print("Masukkan kode plat nomor: ");
        char platNomor = input.next().charAt(0);
        input.close();

        boolean ditemukan = false;

        for (int i = 0; i < kode.length; i++) {
            if (platNomor == kode[i]) {
                System.out.println("kota: " + kota[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("kode plat tidak ditemukan.");
        }
    }
}