public class DataDosen10 {
    Dosen10 [] dataDosen = new Dosen10[10];
    int idx;

    void tambah(Dosen10 m){
        if (idx < dataDosen.length) {
            dataDosen[idx] = m;
            idx++;
        } else {
            System.err.println("data sudah penuh");
        }
    }
    void tampil(){
        for (Dosen10 m:dataDosen) {
            m.tampil();
            System.out.println("----------------------");
        }
    }
    void bubbleSort(){
        for (int i = 0; i < dataDosen.length-1; i++) {
            for (int j = 1; j < dataDosen.length-i; j++) {
                if (dataDosen[j].usia<dataDosen[j-1].usia) {
                    Dosen10 tmp = dataDosen[j];
                    dataDosen[j]= dataDosen[j-1];
                    dataDosen[j-1]=tmp;
                }
            }
        }
    }
    void insertionSort() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen10 temp = dataDosen[i];
            int j = i;
            while (j>0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
 