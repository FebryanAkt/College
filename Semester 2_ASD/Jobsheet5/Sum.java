package Jobsheet5;

public class Sum {
    double keuntungan[];

    Sum(int el){
        keuntungan = new double[el];
    }
    double totalBF(){
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total+keuntungan[i];
        }
        return total;
    }
    double totalDC(double arr[], int I, int r){
        if (I==r) {
            return arr[I];
        }
        int mid = (I+r)/2;
        double Isum = totalDC(arr, I, mid);
        double rsum = totalDC(arr, mid+1, r);
        return Isum+rsum;
    }
}
