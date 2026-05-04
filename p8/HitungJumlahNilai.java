package p8;

import java.util.Scanner;

public class HitungJumlahNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalNilai = 0;
        char ulang;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();
            totalNilai += nilai;

            System.out.print("Input lagi? (y/t): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Total nilai keseluruhan: " + totalNilai);
        input.close();
    }
}
