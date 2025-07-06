public class Node {
    Pasien data;
    Node prev;
    Node next;

    public Node(Pasien data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
