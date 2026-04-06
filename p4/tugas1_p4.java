package p4;

import java.util.Scanner;

public class tugas1_p4 {
    public static void main(String[] args) {
        // --- 1. PROSES INPUT MANUAL ---
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan biaya Makan: ");
        int makan = input.nextInt();

        System.out.print("Masukkan biaya Transport: ");
        int transport = input.nextInt();

        System.out.print("Masukkan biaya Belanja: ");
        int belanja = input.nextInt();

        // --- 2. PROSES PERHITUNGAN ---
        // Menghitung total pengeluaran
        int total = makan + transport + belanja;

        // Menghitung persentase dengan Casting (double) agar hasil akurat [cite: 21, 46]
        double persenMakan = ((double) makan / total) * 100;
        double persenTransport = ((double) transport / total) * 100;
        double persenBelanja = ((double) belanja / total) * 100;

        // --- 3. OUTPUT ---
        System.out.println("\n============================");
        System.out.println("   LAPORAN PENGELUARAN");
        System.out.println("============================");
        System.out.println("Total Biaya      : Rp " + total);
        System.out.println("----------------------------");
        
        // Menampilkan hasil dengan 1 angka di belakang koma [cite: 204, 215]
        System.out.printf("Persen Makan     : %.1f%%\n", persenMakan);
        System.out.printf("Persen Transport : %.1f%%\n", persenTransport);
        System.out.printf("Persen Belanja   : %.1f%%\n", persenBelanja);
        System.out.println("============================");

        input.close();
    }
}