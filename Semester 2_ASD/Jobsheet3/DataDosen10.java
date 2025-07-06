public class DataDosen10 {
    public String kode;
    public String nama;
    public String jenisKelamin;
    public int usia;

    void dataSemuaDosen (){
        System.out.println("Kode          : "+ this.kode);
        System.out.println("Nama          : "+this.nama);
        System.out.println("Jenis Kelamin : "+this.jenisKelamin );      
        System.out.println("Usia          : "+this.usia);
        System.out.println("------------------------");
    }
    void jumlahDosenPerJenisKelamin (DataDosen10[] arrayOfDosen){
        int pria = 0, wanita = 0;
        for (DataDosen10 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin.equalsIgnoreCase("Pria")) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah dosen pria   : " + pria);
        System.out.println("Jumlah cosen wanita : " + wanita);
    }
    void ratarataPerJenisKelamin(DataDosen10[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;
        for (DataDosen10 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin.equalsIgnoreCase("Pria")) {
                pria++;
                jumlahPria += dosen.usia;
            } else {
                wanita++;
                jumlahWanita += dosen.usia;
            }
        }
        System.out.println("Rata-rata usia dosen pria   : " + (jumlahPria / pria));
        System.out.println("Rata-rata usia dosen wanita : " + (jumlahWanita / wanita));
    }
    void infoDosenPalingTua(DataDosen10[] arrayOfDosen) {
        DataDosen10 dosenTertua = arrayOfDosen[0];
        for (DataDosen10 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }
        System.out.println("Dosen tertua : " + dosenTertua.nama);
    }
    void infoDosenPalingMuda(DataDosen10[] arrayOfDosen) {
        DataDosen10 dosenTermuda = arrayOfDosen[0];
        for (DataDosen10 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }
        System.out.println("Dosen termuda : " + dosenTermuda.nama);
    }
}
