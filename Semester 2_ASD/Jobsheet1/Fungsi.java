public class Fungsi {
    public static double totalPendapatan(int aglonema, int keladi, int alocasia, int mawar) {
        double pendapatan = (aglonema * 75000) + (keladi * 50000) + (alocasia * 60000) + (mawar * 10000);
        return pendapatan;
    }
    public static void hitungStok(int[][] stok, int[] pengurangan) {
        System.out.println("\nStok setiap jenis bunga di RoyalGarden:");
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        
        for (int i = 0; i < stok[0].length; i++) {
            System.out.println("\n" + namaBunga[i] + ":");
            int totalStok = 0;
            for (int j = 0; j < stok.length; j++) {
                if (i == 0 && j == 0) {  
                    totalStok += (stok[j][i] - pengurangan[0]);
                } else if (i == 1 && j == 0) {  
                    totalStok += (stok[j][i] - pengurangan[1]);
                } else if (i == 2 && j == 0) {  
                    totalStok += (stok[j][i] - pengurangan[2]);
                } else if (i == 3 && j == 0) {  
                    totalStok += (stok[j][i] - pengurangan[3]);
                } else {
                    totalStok += stok[j][i];
                }
                System.out.println("RoyalGarden " + (j+1) + ": " + stok[j][i]);
            }
            System.out.println("Total stok " + namaBunga[i] + ": " + totalStok);
        }
    }

    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7},  
            {6, 11, 9, 12},  
            {2, 10, 10, 5},  
            {5, 7, 12, 9}    
        };
        
        int[] pengurangan = {1, 2, 0, 5};
        
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stok.length; i++) {
            double pendapatan = totalPendapatan(stok[i][0], stok[i][1], stok[i][2], stok[i][3]);
            System.out.printf("RoyalGarden %d: Rp %.2f%n", (i+1), pendapatan);
        }
        
        hitungStok(stok, pengurangan);
    }
}