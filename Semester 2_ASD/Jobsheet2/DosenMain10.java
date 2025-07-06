public class DosenMain10 {
    public static void main(String[] args) {
        Dosen10 ds1 = new Dosen10();
        ds1.idDosen = "DOSEN1";
        ds1.nama = "Agus Suprijanto";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2020;
        ds1.bidangKeahlian = "Pemrograman";
        System.out.println();

        ds1.tampilInformasi(2025);
        ds1.setStatusAktif(false);
        ds1.ubahKeahlian("Machine Learning");
        ds1.tampilInformasi(2030);

        Dosen10 dosenBaru = new Dosen10("DOSEN2", "Akmal", true, 2024, "Block Chain");
        dosenBaru.tampilInformasi(2035);
        dosenBaru.setStatusAktif(true);
        dosenBaru.ubahKeahlian("IOT");
        dosenBaru.tampilInformasi(2037);
    }
}