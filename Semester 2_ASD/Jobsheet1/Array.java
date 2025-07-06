import java.util.Scanner;
public class Array {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Nilaihuruf [] = new String[8];
        byte sks [] = {2, 2, 2, 3, 2, 2, 3, 2};
        double bobotNilai [] = new double[8];
        double nilaiAngka [] = new double[8];
        double ip, ipTotal = 0;
        String MK [] = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", 
        "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};

        System.out.println("=================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=================");
        System.out.print("masukkan nilai Angka untuk MK Pancasila: ");
        nilaiAngka [0] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Konsep Teknologi Informasi: ");
        nilaiAngka [1] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Critical Thinking dan Problem Solving: ");
        nilaiAngka [2] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Matematika Dasar: ");
        nilaiAngka [3] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Bahasa Inggris: ");
        nilaiAngka [4] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Dasar Pemrograman: ");
        nilaiAngka [5] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Praktikum Dasar Pemrograman: ");
        nilaiAngka [6] = sc.nextDouble();
        System.out.print("masukkan nilai Angka untuk MK Keselamatan dan Kesehatan Kerja: ");
        nilaiAngka [7] = sc.nextDouble();
        System.out.println("=================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("=================");

        for (int i = 0; i < nilaiAngka.length; i++) {
        if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
            Nilaihuruf[i] = "A";
            bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
            Nilaihuruf [i]= "B+";
            bobotNilai [i] = 3.50;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
            Nilaihuruf [i]= "B";
            bobotNilai [i] = 3.00;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
            Nilaihuruf [i]= "C+";
            bobotNilai [i] = 2.50;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
            Nilaihuruf [i]= "C";
            bobotNilai [i] = 2.00;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
            Nilaihuruf [i]= "D";
            bobotNilai [i] = 1.00;
            } else {
            Nilaihuruf [i]="E";
            bobotNilai [i] = 0.00;
            }
        }
        System.out.println("MK\t\t\t\t\t Nilai Angka\t NilaiHuruf\t Bobot Nilai");
        for (int i = 0; i < MK.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", MK[i], nilaiAngka[i], Nilaihuruf[i], bobotNilai[i]);
        }
        System.out.println("=================");

        for (int i = 0; i < bobotNilai.length; i++) {
            ip = bobotNilai[i] * sks[i]/18;
            ipTotal += ip;
        }
        System.out.println("IP Semester = " + ipTotal);
    }
}