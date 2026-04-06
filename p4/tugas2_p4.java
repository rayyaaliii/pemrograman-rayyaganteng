package p4;
import java.util.Scanner;

public class tugas2_p4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Input Data Belanja ===");
        System.out.print("Masukkan harga Beras  : ");
        int beras = input.nextInt();

        System.out.print("Masukkan harga Minyak : ");
        int minyak = input.nextInt();

        System.out.print("Masukkan harga Telur  : ");
        int telur = input.nextInt();

        int totalBelanja = beras + minyak + telur;

        double persenBeras  = ((double) beras / totalBelanja) * 100;
        double persenMinyak = ((double) minyak / totalBelanja) * 100;
        double persenTelur  = ((double) telur / totalBelanja) * 100;

    
        System.out.println("\n============================");
        System.out.println("   STRUK BELANJA ANDA");
        System.out.println("============================");
        System.out.println("Total Belanja    : Rp " + totalBelanja);
        System.out.println("----------------------------");
        
        System.out.printf("Porsi Beras      : %.1f%%\n", persenBeras);
        System.out.printf("Porsi Minyak     : %.1f%%\n", persenMinyak);
        System.out.printf("Porsi Telur      : %.1f%%\n", persenTelur);
        System.out.println("============================");

        input.close();
    }
}