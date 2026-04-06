package p3;
import javax.swing.JOptionPane;

public class Sapa {
    public static void main(String[] args) {
        // Ambil input nama lewat kotak dialog [cite: 174, 195]
        String nama = JOptionPane.showInputDialog("Nama kamu siapa?");

        // Tampilkan sapaan sederhana [cite: 177, 201]
        JOptionPane.showMessageDialog(null, "Halo " + nama + ", semangat belajarnya!");
    }
}