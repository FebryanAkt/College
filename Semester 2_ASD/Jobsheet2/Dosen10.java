public class Dosen10 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen10() {

    }
    public Dosen10(String id, String nm, boolean sts, int tb, String bk) {
        idDosen = id;
        nama = nm;
        statusAktif = sts;
        tahunBergabung = tb;
        bidangKeahlian = bk;
    }
    void tampilInformasi (int thnSkrg) {
        System.out.println("ID dosen: "+ idDosen);
        System.out.println("Nama dosen: "+ nama);
        System.out.println("Status keaktifan dosen: "+ statusAktif);
        System.out.println("Lama dosen bekerja: "+ hitungMasaKerja(thnSkrg));
        System.out.println("Bidang keahlian dosen: "+ bidangKeahlian);
    }
    void setStatusAktif (boolean status) {
        if (status == true) {
            statusAktif = true;
        } else {
            statusAktif = false;
        }
    }
    int hitungMasaKerja (int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        return masaKerja;
    }
    void ubahKeahlian (String bidang) {
        bidangKeahlian = bidang;
    }
}
