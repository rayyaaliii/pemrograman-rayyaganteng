package p2;
import java.util.Scanner;

public class latihan_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String nama; 
        int usia;
        String alamat;
        String kodePos;
        String noTelp;

        System.out.print("Input Nama: ");
        nama = input.nextLine();

        System.out.print("Input Usia: ");
        usia = input.nextInt();
        
        // Membersihkan buffer Enter setelah nextInt()
        input.nextLine(); 

        System.out.print("Input Alamat: ");
        alamat = input.nextLine();

        System.out.print("Input Kode Pos: ");
        kodePos = input.nextLine();

        System.out.print("Input No Telpon: ");
        noTelp = input.nextLine();

        System.out.println("\n--- Data Diri ---");
        System.out.println("Nama saya: " + nama);
        System.out.println("Usia saya: " + usia);
        System.out.println("Alamat Saya Di: " + alamat);
        System.out.println("Kode Pos Saya: " + kodePos);
        System.out.println("No Telpon Saya: " + noTelp);

        input.close();
    }
}