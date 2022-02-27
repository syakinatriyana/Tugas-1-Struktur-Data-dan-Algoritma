import java.util.ArrayList;

public class Soal6 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("y");
        nama.add("a");
        nama.add("n");
        nama.add("a");

        //Soal nomor 6
        //Tentukan hasil yang didapatkan ketika melakukan perintah
        //add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), dan add(-3,j)

        nama.add(0,"e");
        System.out.println("Setelah elemen e ditambahkan : " + nama);
        nama.add(2,"f");
        System.out.println("Setelah elemen f ditambahkan : " + nama);
        nama.add(3,"g");
        System.out.println("Setelah elemen g ditambahkan : " + nama);
        nama.add(4,"h");
        System.out.println("Setelah elemen h ditambahkan : " + nama);
        nama.add(6,"h");
        System.out.println("Setelah elemen h ditambahkan : " + nama);
        nama.add(-3,"j");
        System.out.println("Setelah elemen j ditambahkan : " + nama);
    }
    
}

