package p8;

import java.util.Scanner;

public class InputNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();

            System.out.println("Nilai yang diinput: " + nilai);

            System.out.print("Input lagi? (y/t): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');
        
        input.close();
    }
}
