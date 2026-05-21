import java.util.Scanner;

public class funtionIntdanDouble {
    static int tambah(int a, int b) {
        int hasil = a + b;
        return hasil; 
    }
    static double tambah(double a, double b) {
        double hasil = a + b;
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

        double hasilDouble = tambah(3.5, 2.5);
        System.out.println(hasilDouble);
     }
}