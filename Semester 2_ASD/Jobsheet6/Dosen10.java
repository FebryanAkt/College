public class Dosen10 {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    Dosen10(){

    }
    Dosen10(String kd, String name, String jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    void tampil(){
        System.out.println("Kode: "+ kode);
        System.out.println("Nama: "+ nama);
        System.out.println("Jenis kelamin: "+ jenisKelamin);
        System.out.println("Usia: "+ usia);
    }
}
