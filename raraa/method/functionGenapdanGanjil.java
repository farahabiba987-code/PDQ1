import java.util.Scanner;

public class functionGenapdanGanjil {
    static boolean isGanjil(int n) {
        boolean hasil;
        if (n % 2 == 0) {
            hasil = false; 
        } else {
            hasil = true; 
        }
        return hasil;   
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        boolean hasil = isGanjil(n);
        if (hasil) {
            System.out.println("GANJIL");
        } else {
            System.out.println("GENAP");
        }
    }
}
