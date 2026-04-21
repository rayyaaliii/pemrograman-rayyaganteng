import java.util.Scanner;

public class Penilaianmahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Hitung Nilai Matkul ===");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = input.nextDouble();

        // Asumsi bobot: Tugas 20%, UTS 30%, UAS 50%
        double nilaiAkhir = (0.2 * tugas) + (0.3 * uts) + (0.5 * uas);
        String grade;

        if (nilaiAkhir >= 85) {
            grade = "A";
        } else if (nilaiAkhir >= 75) {
            grade = "B";
        } else if (nilaiAkhir >= 65) {
            grade = "C";
        } else if (nilaiAkhir >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("---------------------------------");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade      : " + grade);
    }
}