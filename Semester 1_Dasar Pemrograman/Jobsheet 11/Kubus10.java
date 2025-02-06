import java.util.Scanner;
public class Kubus10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, V, L;

        System.out.print("Masukkan sisi kubus: ");
        s = sc.nextInt();

        V = hitungVolume(s);
        System.out.println("Volume kubus ini adalah: " + V);
        L = hitungLuasPermukaan(s);
        System.out.println("Luas permukaan kubus ini adalah " + L);
    }
    static int hitungVolume (int sisi) {
        int V = sisi * sisi * sisi;
        return V;
    }
    static int hitungLuasPermukaan (int sisi) {
        int L = 6 * (sisi*sisi);
        return L;
    }
}
