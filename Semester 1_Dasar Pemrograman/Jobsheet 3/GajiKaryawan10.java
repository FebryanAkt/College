import java.util.Scanner;

public class GajiKaryawan10 {
    public static void main(String[] args) {
        
        //deklarasi scanner dan variabel
        Scanner sc = new Scanner(System.in);
        float jamKerja, upahPerJam, gajiTotal, gajiSebelum, gajiPajak, gajiBersih;
        
        // masukkan
        System.out.print("Jam kerja karyawan: ");
        jamKerja = sc.nextFloat();
        System.out.print("Upah kerja karyawan: RP ");
        upahPerJam = sc.nextFloat();

        //gaji, pajak, bonus
        gajiSebelum = jamKerja * upahPerJam;
        gajiTotal = gajiSebelum + (gajiSebelum * 10/100);
        gajiPajak = gajiTotal - (gajiTotal * 5/100);
        

        //tampilan nilai akhir

        System.out.println("Gaji total: " + gajiTotal);
        System.out.println("Gaji sesudah pajak: " + gajiPajak);
    
    
    }
}
