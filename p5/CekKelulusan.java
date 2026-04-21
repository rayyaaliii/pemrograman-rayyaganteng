package p5;
import java.util.Scanner;

public class CekKelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiKritikal = 75; // Standar kelulusan
        int nilaiMahasiswa;

        System.out.println("=== Sistem Verifikasi Nilai Akhir ===");
        
        System.out.print("Masukkan Nilai Ujian Anda: ");
        nilaiMahasiswa = input.nextInt();

        if (nilaiMahasiswa >= nilaiKritikal) {
            System.out.println("Status: LULUS");
            System.out.println("Selamat, Anda memenuhi standar kompetensi.");
        } else {
            System.out.println("Status: TIDAK LULUS");
            System.out.println("Silakan ikuti ujian remedial pada jadwal berikutnya.");
        }

        System.out.println("\nProgram Selesai.");
        input.close();
    }
}
