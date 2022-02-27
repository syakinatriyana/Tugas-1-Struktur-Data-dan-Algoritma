import java.util.ArrayList;

public class Soal5 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("y");
        nama.add("a");
        nama.add("n");
        nama.add("a");

        System.out.println("ArrayList sebelum remove :");
        for(String x : nama){
            System.out.println(x);
        }

        //Soal nomor 5
        //Tentukan hasil yang didapatkan ketika melakukan perintah remove(0), remove(3), dan remove(2)

        // nama.remove(0);
        // nama.remove(3);
        nama.remove(2);
        System.out.println("ArrayList sesudah remove :");
        for(String y : nama){
            System.out.println(y);
        }

    }
    
}


