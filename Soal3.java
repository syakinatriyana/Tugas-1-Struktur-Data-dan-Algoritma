import java.util.ArrayList;

public class Soal3 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("y");
        nama.add("a");
        nama.add("n");
        nama.add("a");

        //Soal nomor 3
        //Tentukan hasil yang didapatkan ketika melakukan perintah get(0), get(2), get(6), dan get(-3)

        System.out.println(nama.get(0));
        System.out.println(nama.get(2));
        System.out.println(nama.get(6));
        System.out.println(nama.get(-3));
        
    }
    
}


