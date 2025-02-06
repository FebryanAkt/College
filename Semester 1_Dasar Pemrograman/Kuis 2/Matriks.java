public class Matriks {
    public static void main(String[] args) {
        double[][] matriks = {
            {2.0, 3.0},
            {1.0, 4.0}
        };

        System.out.println("Matriks Asli:");
        cetakMatriks(matriks);

        double[][] transpose = transposeMatriks(matriks);
        System.out.println("Transpose Matriks:");
        cetakMatriks(transpose);

        double[][] invers = inversMatriks(matriks);
        System.out.println("Invers Matriks:");
        cetakMatriks(invers);
    }

    public static void cetakMatriks(double[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] transposeMatriks(double[][] matriks) {
        double[][] transpose = new double[matriks[0].length][matriks.length];
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }
        return transpose;
    }

    public static double[][] inversMatriks(double[][] matriks) {
        double determinan = matriks[0][0] * matriks[1][1] - matriks[0][1] * matriks[1][0];
        double[][] invers = new double[2][2];
        invers[0][0] = matriks[1][1] / determinan;
        invers[0][1] = -matriks[0][1] / determinan;
        invers[1][0] = -matriks[1][0] / determinan;
        invers[1][1] = matriks[0][0] / determinan;
        return invers;
    }
}
