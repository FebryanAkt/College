import java.util.Scanner;
public class PAMFebryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int kubik;
        double pertama, kedua, ketiga, hasilPertama, hasilKedua, hasilKetiga, keempat, hasilKeempat, total = 0;

        System.out.print("Masukkan jumlah kubik: ");
        kubik = sc.nextInt();

        if (kubik <= 50) {
            pertama = kubik * 1000;
        } else if (kubik > 50 && kubik <= 100) {
            pertama = kubik - (kubik - 50);
            hasilPertama = pertama * 1000;
            kedua = kubik - (kubik - pertama);
            hasilKedua = kedua * 1500;
            total = hasilPertama + hasilKedua;
        } else if (kubik > 100 && kubik <= 150 ) {
            pertama = kubik - (kubik - 50);
            hasilPertama = pertama * 1000;
            kedua = kubik - (kubik - pertama);
            hasilKedua = kedua * 1500;
            ketiga = kubik - (pertama+kedua);
            hasilKetiga = ketiga * 2000;
            total = hasilPertama + hasilKedua + hasilKetiga;
        } else {
            pertama = kubik - (kubik - 50);
            hasilPertama = pertama * 1000;
            kedua = kubik - (kubik - pertama);
            hasilKedua = kedua * 1500;
            ketiga = kubik - (pertama+kedua);
            hasilKetiga = ketiga * 2000;
            keempat = kubik - (pertama+kedua+ketiga);
            hasilKeempat = keempat * 3000;
            total = hasilPertama + hasilKedua + hasilKetiga + hasilKeempat;
        }
        System.out.println("Harga yang harus anda bayar adalah: RP "+total);
    }
}