public class SortnSearch {
    static void sortNilai (Penilaian[] daftarNilai) {
        for (int i = 0; i < daftarNilai.length; i++) {
            for (int j = i + 1; j < daftarNilai.length; j++) {
                if (daftarNilai[i].nilaiAkhir < daftarNilai[j].nilaiAkhir) {
                    Penilaian temp = daftarNilai[i];
                    daftarNilai[i] = daftarNilai[j];
                    daftarNilai[j] = temp;
                }
            }
        }
    }

    static int searchMhs (Mahasiswa[] daftarMhs, String nim) {
        int temp = -1;
        for (int i = 0; i < daftarMhs.length; i++) {
            if (daftarMhs[i].NIM.equals(nim)) {
                temp = i;
                break;
            }
        }
        return temp;
    }

    static void tampilSearch (int temp, Mahasiswa[] daftarMhs) {
        if (temp != -1) {
            System.out.println("Mahasiswa Ditemukan: NIM: " + daftarMhs[temp].NIM + " | Nama: " + daftarMhs[temp].nama + " | Prodi: " + daftarMhs[temp].prodi);
        } else {
            System.out.println("Data mahasiswa tidak ditemukan");
        }
    }
}
