public class Mahasiswa10 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa10(){
        
    }
    Mahasiswa10(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    void tampilInformasi(){
        System.out.println(nama + "\t"+ nim+ "\t"+kelas+"\t"+ ipk);
        
    }
}