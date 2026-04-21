package p2;
import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);in.close();
        
        System.out.print("Masukkan jari-jari: ");
        double r = in.nextDouble();
        
        // Rumus: π * r * r
        double luas = Math.PI * r * r;
        
        System.out.println("Luas Lingkaran: " + luas);
    }
}