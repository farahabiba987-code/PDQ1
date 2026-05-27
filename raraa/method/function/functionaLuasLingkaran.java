package function;
import java.util.Scanner;

public class functionaLuasLingkaran {
    static double luasLingkaran(double r) {
        double luas = 3.14 * r * r;
        return luas; 
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jari-jari lingkaran: ");
        double r = sc.nextDouble();
        
        double luas = luasLingkaran(r);
        System.out.println(luas);
    }
    
}
