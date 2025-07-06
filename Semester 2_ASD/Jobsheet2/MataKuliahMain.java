public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah10 mk1 = new MataKuliah10();
        mk1.KodeMK = "ASD123";
        mk1.nama = "Algoritma Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        System.out.println();

        mk1.tampilkanIformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(1);
        mk1.tampilkanIformasi();
        System.out.println();

        mk1.ubahSKS(2);
        mk1.kurangiJam(1);
        mk1.tampilkanIformasi();
        System.out.println();

        MataKuliah10 mk2 =  new MataKuliah10("DASPRO123", "Dasar Pemrograman", 3, 6 );
        mk2.tampilkanIformasi();
    }
}
