package latihanPertemuan3.Segitiga;

public class loopSegitiga {
    public static void main(String[] args) {
        for ( int i = 0; i < 10; i++) {// masuk ke baris
            for (int j = 0; j < i; j++) {// ngisi kotak di baris tsb
                System.out.print("*");
            }
            System.out.println();   
        }
    }
}
