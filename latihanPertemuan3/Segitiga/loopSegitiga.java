package latihanPertemuan3.Segitiga;

import java.util.Scanner;
public class loopSegitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for ( int i = 1; i <= 5; i++) {// masuk ke baris
            for (int j = 1; j <= i; j++) {// ngisi kotak di baris tsb
                System.out.print("*");
            }
            System.out.println();   
        }
    }
}
