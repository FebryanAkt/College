public class Antrian {
    Node head;
    Node tail;

    public Antrian(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void tambah(Pasien data){ //addlast
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;  
            tail = newNode;
        }
    }
    public void print(){
        Node current = head; //membuat variabel baru bernama current yg di set di head
        while (current != null) { //perulangan akan terus terjadi jika headnya tidak kosong 
            current.data.tampilkanInformasi(); 
            current = current.next; //memindah head ke node berikutnya
        }
    }
    public Pasien layaniPasien(){ //remove first
        if (isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian.");
            return null;
        }
        Pasien pasienDilayani = head.data; //ambil/remove dari depan
        System.out.println("Pasien " + pasienDilayani.nama + " dipanggil");

        if (head == tail) { //jika node hanya satu
            head = tail = null; //maka node itu dihapus lalu data kosong
        }else{
            head = head.next; //head pindah ke node kanan atau node setelahnya (increment)
            head.prev = null; //ini untuk menghapus node sebelumnya (kiri)
        }
        return pasienDilayani;
    }
    public void cekSisaAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++; //untuk output 0 di incrementkan
                current = current.next; //memproses node dari depan sampai belakang (memproses semua data)
            }
            System.out.println("Jumlah sisa antrian: " + count);
        }
    }

}
