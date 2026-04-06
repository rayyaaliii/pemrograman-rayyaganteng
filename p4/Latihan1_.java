package p4;
import java.util.Scanner;

public class Latihan1_ {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPertemuan, hadir;
        double presensi, tugas, uts, uas, total;

        System.out.print("Masukkan jumlah pertemuan: ");
        totalPertemuan = input.nextInt();
        
        System.out.print("Masukkan jumlah kehadiran: ");
        hadir = input.nextInt();
        
        // Menggunakan casting (double) agar pembagian menghasilkan angka desimal
        presensi = ((double) hadir / totalPertemuan) * 100;

        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextDouble();

        // Menghitung total berdasarkan bobot nilai
        total = (0.10 * presensi) + (0.20 * tugas) + (0.30 * uts) + (0.40 * uas);

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.printf("Presensi    : %.2f%%\n", presensi);
        System.out.println("Nilai Tugas : " + tugas);
        System.out.println("Nilai UTS   : " + uts);
        System.out.println("Nilai UAS   : " + uas);
        System.out.printf("Total Nilai : %.2f\n", total);

        input.close();
    }
}