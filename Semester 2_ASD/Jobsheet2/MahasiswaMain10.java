public class MahasiswaMain10 {
    public static void main(String[] args) {
        Mahasiswa10 mhs1 = new Mahasiswa10();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanIformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanIformasi();

        Mahasiswa10 mhs2 = new Mahasiswa10("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanIformasi();

        Mahasiswa10 mhsfebryan = new Mahasiswa10("Febryan Akhmad", "244107020180", 3.99, "TI 1E");
        mhsfebryan.tampilkanIformasi();
    }
}