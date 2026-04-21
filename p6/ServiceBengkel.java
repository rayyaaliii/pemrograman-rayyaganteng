package p6;

import java.util.Scanner;

public class ServiceBengkel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jam kedatangan Anda (0-24): ");
        int jamKedatangan = input.nextInt();

        if (jamKedatangan < 9) {
            System.out.println("Bengkel belum buka. Silakan tunggu di ruang tunggu.");
        } else if (jamKedatangan >= 9 && jamKedatangan <= 12) {
            System.out.println("Pendaftaran diterima. Estimasi selesai: Siang hari.");
        } else if (jamKedatangan > 12 && jamKedatangan <= 16) {
            System.out.println("Pendaftaran diterima. Estimasi selesai: Sore hari.");
        } else {
            System.out.println("Pendaftaran ditutup. Silakan datang kembali besok.");
        }

        input.close();
    }
}