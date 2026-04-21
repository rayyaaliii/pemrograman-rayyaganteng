import java.util.Scanner;

public class Tugas1_SyaratKehadiran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Nilai Matkul (Syarat Kehadiran) ===");
        
        // Input data kehadiran
        System.out.print("Total Pertemuan (Input Kehadiran): ");
        int totalPertemuan = input.nextInt();
        System.out.print("Jumlah Hadir (Realisasi Kehadiran): ");
        int hadir = input.nextInt();

        // Input data nilai
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = input.nextDouble();

        // Hitung persentase kehadiran
        double persentaseHadir = ((double) hadir / totalPertemuan) * 100;
        
        System.out.println("\n--- Hasil Analisis ---");
        System.out.println("Persentase Kehadiran: " + persentaseHadir + "%");

        if (persentaseHadir < 75) {
            System.out.println("Status: TIDAK LULUS");
            System.out.println("Alasan: Kehadiran kurang dari 75%");
            System.out.println("Grade : E");
        } else {
            // Hitung nilai jika kehadiran memenuhi syarat
            double nilaiAkhir = (0.2 * tugas) + (0.3 * uts) + (0.5 * uas);
            String grade;

            if (nilaiAkhir >= 85) grade = "A";
            else if (nilaiAkhir >= 75) grade = "B";
            else if (nilaiAkhir >= 65) grade = "C";
            else if (nilaiAkhir >= 50) grade = "D";
            else grade = "E";

            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Grade      : " + grade);
            System.out.println("Status     : LULUS");
        }
    }
}

