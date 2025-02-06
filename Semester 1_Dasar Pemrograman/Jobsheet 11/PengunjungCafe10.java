public class PengunjungCafe10 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String pengunjung : namaPengunjung) {
            System.out.println("-" + pengunjung);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");

        //Contoh jika varArgs dan Array
        System.out.println();
        String[] namaPengunjung = {"Rudi", "Adi", "Roni"};
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
}
