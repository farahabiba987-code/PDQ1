package latihanPertemuan3.Segitiga;

import java.util.Scanner;
public class loopSegitigakebalik {
    public static void main(String[] args) {
        int n = 5; // Jumlah baris awal

        // Loop luar untuk mengatur baris (dari 5 turun ke 1)
        for (int i = n; i >= 1; i--) {
            
            // Loop dalam untuk mencetak bintang sebanyak nilai i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Pindah ke baris baru setelah bintang dicetak
            System.out.println();
        }
    }
}