import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        // Number of columns (assuming 3 columns as per your image)
        int cols = 3;
        int start = 1; // Starting number
        
        // Loop through columns
        for (int col = 0; col < cols; col++) {
            // Loop through rows for each column
            for (int row = 0; row < N; row++) {
                System.out.print((row + 1) + col * N + "\t");
            }
            System.out.println();
        }
        
        scanner.close();

        
    }
}
