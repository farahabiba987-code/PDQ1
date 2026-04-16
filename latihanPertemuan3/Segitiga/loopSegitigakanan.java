package latihanPertemuan3.Segitiga;

import java.util.Scanner;
public class loopSegitigakanan {
    public static void main(String[] args) {
        int n = 5; // Jumlah baris

        for (int i = 1; i <= n; i++) {
            
            // 1. Loop untuk mencetak SPASI (berkurang)
            // Baris 1: 2 spasi, Baris 2: 1 spasi, Baris 3: 0 spasi
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // 2. Loop untuk mencetak BINTANG (bertambah)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Pindah baris
            System.out.println();
        }
    }
}
