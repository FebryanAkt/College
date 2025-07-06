public class MataKuliah10 {
    String KodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah10(){

    }
    public MataKuliah10(String KodeMK, String nm, int sks, int jmljam) {
        this.KodeMK = KodeMK;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmljam;
    }
    void tampilkanIformasi() {
        System.out.println("Nama MK: "+ nama);
        System.out.println("Kode MK: "+ KodeMK);
        System.out.println("Jumlah SKS: "+ sks);
        System.out.println("Jumlah jam: "+ jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam(int jam) {
        jam += jumlahJam;
    }
    void kurangiJam(int jam) {
        if (jumlahJam > jam) {
            jumlahJam -= jam;
            System.out.println("Pengurangan jam berhasil, jumlah jam sekarang " + jumlahJam);
        } else {
            System.out.println("Pengurangan jam tidak bisa dilakukan, jam yang tersedia hanya "+ jumlahJam);
        }   
    }
}
