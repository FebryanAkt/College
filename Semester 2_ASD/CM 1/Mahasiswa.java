public class Mahasiswa {
    String NIM;
    String nama;
    String prodi;

    Mahasiswa (String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }
    void tampilMahasiswa() {
            System.out.println("NIM: " +NIM+ " | Nama: " +nama+ " | Prodi: " + prodi);
    }
}
