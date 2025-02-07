public class Array1DFebryan {
    public static void main(String[] args) {
        char huruf = 'A'; 
        int baris = 5; 

        for (int i = baris;  i>=0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = baris; j > i; j--) {
                System.out.print(huruf);
                huruf++;
            }
            
            System.out.println(); 
        }
    }
}
