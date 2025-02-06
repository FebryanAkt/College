import java.util.Scanner;
public class coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = sc.nextInt();

        System.out.println("Masukkan elemen matriks pertama: ");
        int [][] array1 = new int [baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print ("Elemen"+" ["+i+"]"+"["+j+"]"+ " = " );
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks kedua: ");
        int [][] array2 = new int [baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print ("Elemen"+" ["+i+"]"+"["+j+"]"+ " = " );
                array2[i][j] = sc.nextInt();
            }
        }
    System.out.println("Hasil penjumlahan matriks: ");
    for (int i = 0; i < array1.length; i++) {
        for (int j = 0; j < array1[i].length; j++) {
            System.out.print(array1[i][j] + array2[i][j]+" ");
        }
        System.out.println();
    }
    }
}
