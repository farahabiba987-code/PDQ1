package procedure;
public class cetakTabelperkalian {

    public static void main(String[] args) {
        cetakTabelPerkalian(3);
    }

    static void cetakTabelPerkalian(int angka) {
        for (int i = 10; i >= 1; i--) {
           System.out.println(angka + " x " + i + " = " + (angka * i));
        }
    }
}