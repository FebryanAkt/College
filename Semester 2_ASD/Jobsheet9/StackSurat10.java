public class StackSurat10 {
    Surat10[] stack;
    int top;
    int size;

    public StackSurat10(int size) {
        this.size = size;
        stack = new Surat10[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size-1) {
            return true ;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true ;
        } else {
            return false;
        }
    }

    public void push(Surat10 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat izin lagi");
        }
    }

    public Surat10 pop() {
        if (!isEmpty()) {
            Surat10 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin untuk diproses");
            return null;
        }
    }

    public Surat10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin yang diajukan");
            return null;
        }
    }
    public void printCari(int hasil) {
        String keterangan = "";
        if (stack[hasil].jenisIzin == 'S') {
            keterangan = "Sakit";
        } else if (stack[hasil].jenisIzin == 'I') {
            keterangan = "Izin";
        } else {

        }
        System.out.printf("%-12s %-9s %-9s %-14s %-10d", stack[hasil].idSurat, 
        stack[hasil].namaMahasiswa, stack[hasil].kelas, keterangan, stack[hasil].durasi);
    }
    public void print() {
        String keterangan = "";
        for (int i = top; i >= 0; i--) {
            if (stack[i].jenisIzin == 'S') {
             keterangan = "Sakit";
            } else if (stack[i].jenisIzin == 'I') {
                keterangan = "Izin";
            } else {
                System.out.println("Keterangan izin tidak valid!");
            }
            System.out.printf("%-12s %-9s %-9s %-14s %-10d\n", stack[i].idSurat, 
            stack[i].namaMahasiswa, stack[i].kelas, keterangan, stack[i].durasi);
        }
    }
}
