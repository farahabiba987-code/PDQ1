package latihanPertemuan3.While;

import java.util.Scanner;

public class latihanPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaBarang [] = new String[10];
        int hargaBarang [] = new int[10];
        int jumlahBarang [] = new int[10];
        int totalBelanja [] = new int[10];
        int bayar[] = new int[10];
        boolean status = true;

        while (status){
            System.out.println("=== Selamat Datang di Penjualan Rara Store ====");
            System.out.println("1. Input Penjualan");
            System.out.println("0. Exit");
            System.out.print("Masukkan Opsi anda (angka saja) : ");
            int option = sc.nextInt();

            sc.nextLine();
            switch (option){
                case 0 :
                    status = false;
                    break;
                case 1 :
                    System.out.print("Atas nama siapa transaksi ini ? : ");
                    String person = sc.nextLine();
                    System.out.print("Berapa banyak barang yang diinginkan dalam transaksi ini ? :");
                    int loopFor = sc.nextInt();
                    sc.nextLine();

                    // loop input
                    for (int i = 0; i < loopFor; i++) {
                        System.out.println("Barang ke - " + (i+1));
                        System.out.print("Masukkan Nama Barang : ");
                        namaBarang[i] = sc.nextLine();
                        System.out.print("Masukkan Jumlah Barang : ");
                        jumlahBarang[i] = sc.nextInt();
                        System.out.print("Masukkan Harga Barang : ");
                        hargaBarang[i] = sc.nextInt();
                        System.out.println("=======================");
                        sc.nextLine();
                    }

                    int grandTotal = 0;
                    System.out.println("==== Transaksi Atas Nama " + person + " ====");
                    for (int i = 0; i < loopFor; i++) {
                        int temp = jumlahBarang[i] * hargaBarang[i];
                        totalBelanja[i] = temp;
                        System.out.println(namaBarang[i] + " x " + jumlahBarang[i] + "  " + hargaBarang[i] + " = " + temp);
                        grandTotal += totalBelanja[i];
                    }
                    System.out.println("Total Anda : " + grandTotal);

                    // pembayaran
                    System.out.print("Masukkan jumlah uang yang dibayarkan : ");
                    bayar[] = sc.nextInt();
                    System.out.println("Thank you for shopping w us :D");

                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
        sc.close();
    }
}
