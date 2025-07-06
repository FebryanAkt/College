public class Mahasiswa10 {
    String nim;
    String kelas;
    double ipk;
    String nama;
    public Mahasiswa10() {

    }
    public Mahasiswa10(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    void tampilkanIformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: "+ nim);
        System.out.println("IPK: "+ ipk);
        System.out.println("Kelas: "+ kelas);
    }
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru) {
        if (ipk <= 0.0 && ipk >= 4.0) {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
        ipk = ipkBaru;
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}