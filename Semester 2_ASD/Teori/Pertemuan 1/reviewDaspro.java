public class reviewDaspro {
public static void main(String[] args) {

        for (int angka = 1; angka <= 15; angka++) {
            if (angka == 6 || angka == 10) {
                System.out.print("* ");
            }
            else if (angka % 2 == 0) {
                System.out.print(angka + " ");
            } 
            else {
                System.out.print("* ");
            }
        }
    }
}