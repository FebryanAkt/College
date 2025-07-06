public class MahasiswaKRS10 {
    String nim;
    String nama;
    String jurusan;

    public MahasiswaKRS10(String nim, String nama, String jurusan){
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void tampil(){
        System.out.println("NIM     :"+nim);
        System.out.println("Nama    :"+nama);
        System.out.println("Jurusan :"+jurusan);
    }

}
