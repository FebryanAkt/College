import java.util.Scanner;
public class MatakuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah: ");
        int jmlMk = sc.nextInt();
        sc.nextLine();
        Matakuliah10[] arrayOfMatakuliah = new Matakuliah10[jmlMk];
        
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah[i] = new Matakuliah10("", "", 0, 0);
            arrayOfMatakuliah[i].tambahData();
        }
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
