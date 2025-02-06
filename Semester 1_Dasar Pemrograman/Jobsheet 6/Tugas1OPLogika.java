import java.util.Scanner;
public class Tugas1OPLogika {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double bil1, bil2, bil3;

        System.out.print("Masukkan bilangan kesatu: ");
        bil1 = input.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = input.nextDouble();
        System.out.print("Masukkan bilangan ketiga: ");
        bil3 = input.nextDouble();

        if (bil1 < bil2 && bil1 < bil3) {
            if (bil1 < bil3){
            System.out.println("Bilangan terbesar adalah: " +bil3);
        } if (bil2 > bil3) {
            System.out.println("Bilangan terbesar: " + bil2);
        }
        } else if (bil1 < bil2 && bil2 > bil3) {
            System.out.println("Bilangan terbesar adalah: " + bil3);
        } else {
            System.out.println("Bilangan terbesar adalah: " + bil1);
        }
    }
}