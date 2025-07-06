import java.util.Scanner;
public class DosenDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen10[] arrayOfDosen =  new DataDosen10[3];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i] = new DataDosen10();
            System.out.println("Masukkan Data Dosen ke-"+ (i+1));
            System.out.print("Kode          : ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama          : ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            arrayOfDosen[i].jenisKelamin = sc.nextLine();
            System.out.print("Usia          : ");
            arrayOfDosen[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------");
        }
        int i = 1;
        for (DataDosen10 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-"+(i++));
            dosen.dataSemuaDosen();
        }
        DataDosen10 dosen = new DataDosen10();
        dosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dosen.ratarataPerJenisKelamin(arrayOfDosen);
        dosen.infoDosenPalingTua(arrayOfDosen);
        dosen.infoDosenPalingMuda(arrayOfDosen);
    }
}