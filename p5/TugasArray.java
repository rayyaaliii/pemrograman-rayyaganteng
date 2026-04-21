package p5;
import java.util.Scanner;

public class TugasArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data: ");
        int jml = input.nextInt();
        double[] angka = new double[jml];
        double total = 0;

        for (int i = 0; i < jml; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            angka[i] = input.nextDouble();
            total += angka[i];
        }

        double rataRata = total / jml;
        System.out.println("-------------------------");
        System.out.println("Total Nilai: " + total);
        System.out.println("Rata-rata : " + rataRata);
    }
}

