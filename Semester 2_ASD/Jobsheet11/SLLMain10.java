public class SLLMain10 {
    public static void main(String[] args) {
        SingleLinkedList10 sll = new SingleLinkedList10();

        Mahasiswa10 mhs1 = new Mahasiswa10("22212202", "Cintia", "3C", 3.5);
        Mahasiswa10 mhs2 = new Mahasiswa10("23212201", "Bimon", "2B", 3.8);

        sll.addLast(mhs1);
        sll.addLast(mhs2);
        
        System.out.println("data index 1 :");
        sll.getData(0);  

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.print();

        sll.removeFirst();
        sll.print();
    }
}
