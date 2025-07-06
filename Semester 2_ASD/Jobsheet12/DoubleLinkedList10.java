public class DoubleLinkedList10 {
    int size = 0;
    Node10 head;
    Node10 tail;

    public DoubleLinkedList10(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Mahasiswa10 data){
        Node10 newNode = new Node10(data);
        if (isEmpty()) {
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Mahasiswa10 data){
        Node10 newNode = new Node10(data);
        if (isEmpty()) {
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void insertAfter(String keyNim, Mahasiswa10 data){
        Node10 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM "+ keyNim + " tidak ditemukan.");
            return;
        }
        Node10 newNode = new Node10(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        }else{
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM "+ keyNim);
    }
    public void print(){
        if (!isEmpty()) {
            Node10 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }else{
            System.out.println("Linked List kosong");
        }
    }
    public Node10 search(String nim){
        Node10 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data berhasil dihapus, data yang dihapus adalah: ");
        head.data.tampil();
        if (head == tail) {
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data berhasil dihapus, data yang dihapus adalah: ");
        tail.data.tampil();
        if (head == tail) {
            head = tail = null;
        }else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    public void add(Mahasiswa10 data, int index) {
    if (index < 0 || index > size) {
        System.out.println("Indeks di luar batas!");
        return;
    }
    if (index == 0) {
        addFirst(data);
    }else if (index == size) {
        addLast(data);
    }else{
        Node10 newNode = new Node10(data);
        Node10 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
    }
}

    public void removeAfter(String keyNim) {
        Node10 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Node setelah NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node10 toRemove = current.next;
        System.out.println("Data berhasil dihapus, data yang dihapus adalah: ");
        toRemove.data.tampil();
        if (toRemove == tail) {
            tail = current;
            current.next = null;
        }else{
            current.next = toRemove.next;
            toRemove.next.prev = current;
        }
        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks di luar batas!");
            return;
        }
        if (index == 0) {
            removeFirst();
        }else if (index == size - 1) {
            removeLast();
        }else{
            Node10 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            System.out.println("Data berhasil dihapus, data yang dihapus adalah: ");
            current.data.tampil();
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        }else{
            System.out.println("Data pada head:");
            head.data.tampil();
        }
    }
    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        }else{
            System.out.println("Data pada tail:");
            tail.data.tampil();
        }
    }
    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks di luar batas!");
            return;
        }
        Node10 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada indeks ke-" + index + ":");
        current.data.tampil();
    }

    public int size() {
        return size;
    }
}
