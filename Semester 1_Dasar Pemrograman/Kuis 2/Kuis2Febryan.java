import java.util.Scanner;

public class Kuis2Febryan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan elemen matriks ordo 2x2: ");

        double[][] matriks = new double [2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemen " + "[" + (i+1) + "]" + "[" + (j+1) + "]" + "= ");
                matriks[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\nMatriks asli:");
        System.out.println("| " +matriks[0][0]+ " " + matriks[1][0]+ " |");
        System.out.println("| " +matriks[0][1]+ " " + matriks[1][1]+ " |");
        

        double[][] transpose = new double[2][2];
        transpose[0][0] = matriks[0][0];
        transpose[0][1] = matriks[1][0];
        transpose[1][0] = matriks[0][1];
        transpose[1][1] = matriks[1][1];
        
        System.out.println("\nTranspose Matriks:");
        System.out.println("| " + transpose[0][0] + " " + transpose[0][1] + " |");
        System.out.println("| " + transpose[1][0] + " " + transpose[1][1] + " |" );
        
        double determinant = matriks[0][0] * matriks[1][1] - matriks[0][1] * matriks[1][0];
        if (determinant != 0) {
            double[][] inverse = new double[2][2];
            inverse[0][0] = matriks[1][1] / determinant;
            inverse[0][1] = -matriks[0][1] / determinant;
            inverse[1][0] = -matriks[1][0] / determinant;
            inverse[1][1] = matriks[0][0] / determinant;
            
            System.out.println("\nInvers Matriks:");
            System.out.println("| " +inverse[0][0] + " " + inverse[0][1]+ " |");
            System.out.println("| " +inverse[1][0] + " " + inverse[1][1]+ " |");
        } else {
            System.out.println("\nMatriks tidak memiliki invers.");
        }

        sc.close();
    
        
    }
}