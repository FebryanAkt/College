import java.util.Scanner;
public class SuhuFebryan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Masukkan suhu dalam celsius contoh = ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("Suhu dalam fahrenheit adalah " + fahrenheit+ " F");

    }
}