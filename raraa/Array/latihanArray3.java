package raraa.Array;

import java.util.Scanner;

public class latihanArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahElemen = 0, cari = 0, max = 0;
        int[] kumpulanAngka;
        boolean ditemukan = false;
        
        System.out.println("=== Program Pengolahan Array ===");
        
        // 1. Input jumlah dan isi array
        System.out.print("Masukkan jumlah elemen array: ");
        jumlahElemen = sc.nextInt();
        kumpulanAngka = new int[jumlahElemen];
        
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            kumpulanAngka[i] = sc.nextInt();
        }

        // Hasil proses
        System.out.println("\n--- HASIL PROSES ---");

        // Soal 1: Nilai tertinggi
        max = kumpulanAngka[0];
        for (int i = 1; i < kumpulanAngka.length; i++) {
            if (kumpulanAngka[i] > max) {
                max = kumpulanAngka[i];
            }
        }
        System.out.println("1. Nilai tertinggi adalah: " + max);

        // Soal 2: Pencarian
        System.out.print("2. Masukkan angka yang ingin dicari di array: ");
        cari = sc.nextInt();
        ditemukan = false;
        for (int n : kumpulanAngka) {
            if (n == cari) {
                ditemukan = true;
                break;
            }
        }
        System.out.println("   Hasil: " + (ditemukan ? "Angka " + cari + " ditemukan!" : "Angka tidak ditemukan."));

        // Soal 3: Balik array
        System.out.print("3. Isi array jika dibalik: ");
        for (int i = jumlahElemen - 1; i >= 0; i--) {
            System.out.print(kumpulanAngka[i] + " ");
        }
        System.out.println();

        System.out.println("--------------------");
        System.out.println("Proses selesai.");

        sc.close();
    }
}
