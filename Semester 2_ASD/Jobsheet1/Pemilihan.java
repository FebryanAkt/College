import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Programm Menghitung Nilai Akhir");
        System.out.println("=========================");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextInt();

        if (tugas > 100) {
            System.out.println("=========================");
            System.out.println("=========================");
            System.out.println("Nilai tidak valid");
            System.out.println("=========================");
            System.out.println("=========================");
        } else if (kuis > 100) {
            System.out.println("=========================");
            System.out.println("=========================");
            System.out.println("Nilai tidak valid");     
            System.out.println("=========================");
            System.out.println("=========================");
        } else if (uts > 100) {
            System.out.println("=========================");
            System.out.println("=========================");
            System.out.println("Nilai tidak valid");
            System.out.println("=========================");
            System.out.println("=========================");
        } else if (uas > 100) {
            System.out.println("=========================");
            System.out.println("=========================");
            System.out.println("Nilai tidak valid");
            System.out.println("=========================");
            System.out.println("=========================");
        } else {
            double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3) ;
            System.out.println("Nilai Akhir : " +nilaiAkhir);
    
            String nilaiHuruf;
            if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
                nilaiHuruf = "D";
            } else if (nilaiAkhir < 39) {
                nilaiHuruf = "E";
            } else {
                nilaiHuruf = "Nilai tidak valid";
            }
            
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("=========================");
            System.out.println("=========================");
    
            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") 
            || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
        }    
    }
}