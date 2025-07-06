public class Queue {
    TransaksiLayanan[] data; //objek transaksiLayanan disimpan dgn array bernama data
    int front;
    int rear;
    int size;
    int max;
    
    public Queue (int max){  //queue ini dibuat kapasitas max
        this.max = max;
        data = new TransaksiLayanan [max]; //membuat data transaksiLaynana disimpan di array dengan ukuran sebanyak max
        size = 0; //jumlah data yang kita inputkan
        front = rear = -1; //front rearnya disetel ke -1 karena memastikan queue itu kosong
    }
    public boolean IsEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }
   
    public void print(){ //menu 5
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            System.out.println("-- Riwayat Transaksi --");
            System.out.println("Daftar Transaksi:");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.println(data[index].pasien.nama + " (" + data[index].durasiLayanan + " jam): Rp " +data[index].hitungBiaya());
            }
        }
    }
  
    public void Enqueue(TransaksiLayanan dt){
        if (IsFull()) {
            System.out.println("Queue sudah penuh! Program dihentikan");
            return;
        }else{
            if (IsEmpty()) {
                front = rear = 0; //jika queue kosong maka front dan rear di set 0 untuk data pertama masuk di posisi 0
            }else{
                if (rear == max -1) { //kenapa max-1? karena array dimulai dari indeks 0
                    rear = 0; //jika rear udah sampai batas max maka rearnya kembali 0 (circular)
                }else{
                    rear++; //jika belum penuh maka akan lanjut ke iterasi berikutnya
                }
            }
            data[rear] = dt; //transaksiLayanan disimpan ke array dt pada indeks rear (artinya transaksi baru dimasukkan ke belakang queue)
            size++; //menambah size 1 angka
        }
    }
    
}
