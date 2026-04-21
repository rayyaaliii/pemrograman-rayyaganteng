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
        uts = input.nextDouble(;)

        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextDouble();

  
        input.close();
    }
}