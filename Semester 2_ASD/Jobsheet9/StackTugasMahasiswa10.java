public class StackTugasMahasiswa10 {
    Mahasiswa10[] stack;
    int top;
    int size;

    public StackTugasMahasiswa10(int size){
        this.size = size;
        stack = new Mahasiswa10[size];
        top = -1;
    }
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }
    public void push (Mahasiswa10 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        }else{
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi");
        }
    }
    public Mahasiswa10 pop(){
        if (!isEmpty()) {
            Mahasiswa10 m = stack[top];
            top--;
            return m;
        }else{
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }
    public Mahasiswa10 peek() {
        if (!isEmpty()) {
            return stack[top];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public void print(){ 
        for (int i = top; i >= 0; i--) { 
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
    public void melihatTugasTerbawah(){
        if (!isEmpty()) {
            System.out.println("Tugas pertama kali dikumpulkan oleh " + stack[0].nama);
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
        }
    }
    public int banyakTugas(){
        return top + 1;
    }
    public String konversiDesimalKeBiner(int nilai){
        StackKonversi10 stack = new StackKonversi10();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

}