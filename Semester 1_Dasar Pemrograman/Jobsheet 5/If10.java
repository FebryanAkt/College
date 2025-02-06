import java.util.Scanner;
public class If10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);;
        String dayType;
        byte angkaHari;

        System.out.print("Masukkan angka hari: ");
        angkaHari = sc.nextByte();

        if (angkaHari >=1 && angkaHari <=5) {
            dayType = "weekday";
        } else if (angkaHari >=6 && angkaHari <=7) {
            dayType = "weekend";
        } else {
            dayType = "invalid";
        }
        
        System.out.println(angkaHari + " is a " + dayType);
    }
}
