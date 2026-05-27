package function;
import java.util.Scanner;

public class functionnilaiHuruf {
    static int angka;
    static String nilaiHuruf() {
        String hasil = "";
        if (angka >= 80 && angka <= 100) {
            hasil = "A";
        } else if (angka >= 75 && angka <= 79) {
            hasil = "B+";
        } else if (angka >= 65 && angka <= 74) {
            hasil = "B";
        }
        return hasil; 
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka:");
        angka = sc.nextInt();
        System.out.println("Masukkan nilai:");
    }
    
}
