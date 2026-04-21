package p6;
class Mahasiswa {
    String nama;
    String nim;

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }
}

public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Rayya";
        mhs1.nim = "2024001";
        mhs1.tampilkanInfo();
    }
}