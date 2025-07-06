package Latihan;

public class QeueuMahasiswa10 {
    NodeMahasiswa10 front, rear;
    int jumlah;

    public QeueuMahasiswa10() {
        front = null;
        rear = null;
        jumlah = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void tambahAntrian(Mahasiswa10 mhs) {
        NodeMahasiswa10 nodeBaru = new NodeMahasiswa10(mhs);
        if (isEmpty()) {
            front = nodeBaru;
            rear = nodeBaru;
        } else {
            rear.next = nodeBaru;
            rear = nodeBaru;
        }
        jumlah++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil ditambahkan ke antrian");
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang dipanggil");
        } else {
            System.out.println("Memanggil: " + front.data.nim + " - " + front.data.nama);
            front = front.next;
            jumlah--;
            if (front == null) {
                rear = null;
            }
        }
    }

    public void tampilkanDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan: " + front.data.nim + " - " + front.data.nama);
        }
    }

    public void tampilkanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terakhir: " + rear.data.nim + " - " + rear.data.nama);
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Daftar antrian:");
            NodeMahasiswa10 bantu = front;
            while (bantu != null) {
                System.out.println(bantu.data.nim + " - " + bantu.data.nama);
                bantu = bantu.next;
            }
        }
    }

    public void kosongkanAntrian() {
        front = null;
        rear = null;
        jumlah = 0;
        System.out.println("Antrian telah dikosongkan");
    }

    public void tampilkanJumlah() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + jumlah);
    }

    public void cekKosong() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian tidak kosong");
        }
    }
}
