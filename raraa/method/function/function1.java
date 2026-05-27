package function;
import java.util.Scanner;

public class function1 {
    
    static int tambah(int a, int b) {
        int hasil = a + b;
        return hasil; 
    }
     public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int hasil =3+5;
        int i = 3;
        hasil =tambah(i, 5);
        System.out.println(hasil);

        hasil = tambah(8,10);
        System.out.println(hasil);

        hasil = tambah(15, 20);
        System.out.println(hasil);

     }
    
}
