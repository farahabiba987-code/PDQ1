package function;

public class rekursifCetakBintang {
    static int cetakBintang(int n) {
        if (n <= 0) {
            return 0;
        }
        System.out.println('*');
        cetakBintang(n - 1);
        return 0;
    }
    public static void main(String[] args) {
        cetakBintang(5);
    }
}
