public class DataDosen10 {
    Dosen10[] dataDosen = new Dosen10[10];
    int idx;

    void tambah(Dosen10 m) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = m;
            idx++;
        } else {
            System.err.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen10 m : dataDosen) {
            if (m != null) {
                m.tampil();
                System.out.println("----------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen10 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen10 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    int[] PencarianDataSequential10(String cari) {
        int[] posisi = new int[idx];
        int jumlahData = 0;
        
        for (int j = 0; j < idx; j++) {
            if (dataDosen[j] != null && dataDosen[j].nama.equalsIgnoreCase(cari)) {
                posisi[jumlahData] = j;
                jumlahData++;
            }
        }
        
        if (jumlahData == 0) {
            return new int[0]; 
        } else {
            int[] hasilCari = new int[jumlahData];
            for (int i = 0; i < jumlahData; i++) {
                hasilCari[i] = posisi[i];
            }
            return hasilCari;
        }
    }

    int[] PencarianDataBinary10(int cariUsia) {
        bubbleSort();
        
        
        int posisiAwal = cariPosisiAwalBinary(cariUsia, 0, idx - 1);
        
        if (posisiAwal == -1) {
            return new int[0]; 
        }
        
        int[] hasil = new int[idx]; 
        int jumlahHasil = 0;
        
        int left = posisiAwal;
        while (left >= 0 && dataDosen[left].usia == cariUsia) {
            hasil[jumlahHasil++] = left;
            left--;
        }
        
        int right = posisiAwal + 1;
        while (right < idx && dataDosen[right].usia == cariUsia) {
            hasil[jumlahHasil++] = right;
            right++;
        }
        
        int[] hasilFinal = new int[jumlahHasil];
        for (int i = 0; i < jumlahHasil; i++) {
            hasilFinal[i] = hasil[i];
        }
        
        return hasilFinal;
    }
    
    int cariPosisiAwalBinary(int cariUsia, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (dataDosen[mid].usia == cariUsia) {
                return mid;
            }

            if (dataDosen[mid].usia > cariUsia) {
                return cariPosisiAwalBinary(cariUsia, left, mid - 1);
            }

            return cariPosisiAwalBinary(cariUsia, mid + 1, right);
        }

        return -1;
    }

    void tampilHasilPencarian(String jenisData, String kriteria, int[] posisi) {
        if (posisi.length == 0) {
            System.out.println(jenisData + " dengan " + kriteria + " tidak ditemukan");
            return;
        }
        
        if (posisi.length > 1) {
            System.out.println("PERINGATAN: Ditemukan " + posisi.length + " data " + jenisData + 
                               " dengan " + kriteria + " yang sama!");
        }
        
        System.out.println("Hasil pencarian " + jenisData + " dengan " + kriteria + ":");
        for (int i = 0; i < posisi.length; i++) {
            System.out.println("Hasil ke-" + (i+1) + ":");
            dataDosen[posisi[i]].tampil();
            System.out.println("----------------------");
        }
    }
}