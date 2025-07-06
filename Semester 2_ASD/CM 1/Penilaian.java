public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;
    
    Penilaian (Mahasiswa mahasiswa, MataKuliah mataKuliah, int tugas, int uts, int uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        nilaiTugas = tugas;
        nilaiUTS = uts;
        nilaiUAS = uas;
        hitungNilaiAkhir();
    }
    void hitungNilaiAkhir() {
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }
    void tampilNilai() {
        hitungNilaiAkhir();
        System.out.println(mahasiswa.nama+ " | " +mataKuliah.namaMK+ " | Nilai Akhir: " +nilaiAkhir);
    }
}

