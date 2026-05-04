package p8;

import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalNilai = 0;
        int jumlahData = 0;
        char ulang;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            double nilai = input.nextDouble();
            
            totalNilai += nilai;
            jumlahData++;

            System.out.print("Input lagi? (y/t): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');

        if (jumlahData > 0) {
            double rataRata = totalNilai / jumlahData;
            System.out.println("Total Nilai: " + totalNilai);
            System.out.println("Jumlah Mahasiswa: " + jumlahData);
            System.out.println("Rata-rata Nilai: " + rataRata);
        }

        input.close();
    }
}
