public class reviewFungsi {
    public static void main(String[] args) {
        System.out.println("Rata-rata film ke-0 adalah: "+ rataRating0());
        System.out.println("Rata-rata film ke-1 adalah: "+ rataRating1());
        System.out.println("Rata-rata film ke-2 adalah: "+ rataRating2());
        System.out.println("Rata-rata film ke-3 adalah: "+ rataRating3());
    }
    static int rataRating0() {
        return (4 + 1 + 1) / 3;
    }
    static int rataRating1() {
        return (3 + 1 + 2) / 3;
    }
    static int rataRating2() {
        return (4 + 2 + 3) / 3;
    }
    static int rataRating3() {
        return (4 + 3 + 4) / 3;
    }

    // static void rataTinggi() {
    //     if (rataRating0() < rataRating1()) {
            
    //     }
    // }   
    
}
