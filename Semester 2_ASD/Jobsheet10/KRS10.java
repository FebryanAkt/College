public class KRS10 {
    int max = 10;
    MahasiswaKRS10[] antrian = new MahasiswaKRS10[max];
    int front =-1, rear =-1;
    int totalDilayani = 0;

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (rear + 1) % max == front;
    }
    void Enqueue(MahasiswaKRS10 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        }else{
            rear = (rear + 1) % max;
        }
        antrian[rear] = mhs;
    }
    void dequeue(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        for (int i = 0; i < 2; i++) {
            if (isEmpty()) break;

            System.out.println("Memproses Mahasiswa:");
            antrian[front].tampil();
            if (front == rear) {
                front = rear =-1;
            }else{
                front = (front + 1) % max;
            }
            totalDilayani++;
        }
    }
    void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Antrian");
        int i = front;
        while (true) {
            System.out.println("- "+antrian[i].nama + " ("+ antrian[i].nim +")");
            if (i == rear) break;
            i = (i+1) % max;
        }
    }
    void tampilDuaTerdepan(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Dua Mahasiswa tedepan");
        int i = front;
        for (int j = 0; j < 2 && i != (rear+1) % max; j++) {
            antrian[i].tampil();
            i = (i+1) % max;
        }
    }
    void tampilPalingAkhir(){
        if (isEmpty()) {
            System.out.println("Antian kosong");
            return;
        }
        System.out.println("Mahasiswa terakhir dalam antrian:");
        antrian[rear].tampil();
    }
        void kosongkanAntrian() {
        front = rear = -1;
        System.out.println("Antrian dikosongkan.");
    }

    void cetakJumlahAntrian() {
        if (isEmpty()) {
            System.out.println("Jumlah antrian: 0");
            return;
        }
        int count = 0;
        int i = front;
        while (true) {
            count++;
            if (i == rear) break;
            i = (i + 1) % max;
        }
        System.out.println("Jumlah antrian: " + count);
    }

    void cetakJumlahDilayani() {
        System.out.println("Jumlah mahasiswa yang sudah diproses KRS: " + totalDilayani);
    }

    void cetakBelumDilayani() {
        int sisa = 30 - totalDilayani;
        System.out.println("Mahasiswa yang belum melakukan proses KRS: " + sisa);
    }
}