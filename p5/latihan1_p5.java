package p5;

public class latihan1_p5 {
    public class LatihanArray {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array
        String[] mahasiswa = {"Rayya", "Drayk", "Andi"};
        int[] nilai = {85, 90, 78};

        System.out.println("Daftar Nilai Mahasiswa:");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println(mahasiswa[i] + " : " + nilai[i]);
        }
    }
}
    
}
