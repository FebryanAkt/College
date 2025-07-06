public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan;
    int biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan){
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
    }   
    public int hitungBiaya(){
        return durasiLayanan * 50000;
    }

}
