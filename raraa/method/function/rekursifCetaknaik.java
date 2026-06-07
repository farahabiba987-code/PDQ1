package function;

public class rekursifCetaknaik {
    static int cetakNaik(int n) {
        if (n <= 0) {
            return 0;
        }
        cetakNaik(n - 1);
        System.out.println(n);
        return 0;
    }
    public static void main(String[] args) {
        cetakNaik(5);
    }   
}
