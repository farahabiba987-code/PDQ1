//Buatlah sebuah program untuk menghitung total transaksi pembelian pulsa dari beberapa pelanggan dalam satu waktu. User haru menginput terlebih dahulu jumlah pelanggan yang membeli pusa (minimal 3  pelanggan), yang disimpan menggunakan array 1 dimensi. Setiap pelanggan membeli pusa dengan nominal yang sudah ditentukan, yakni 100.000, 50.000, 25.000, dan 15.000, dengan jumlah yang harus di bayarkan adalah ; bayar = nominal pulsa + 2000 (biaya admin). Jika total pembelian memenuhi syarat tertentu, maka pelanggan akan mendapatkan cashback berikut : jika total > 100.000, maka mendapatkan cashback 15%, jika total > 50.000, maka mendapatkan cashback 10%, jika total < 50.000, maka mendapatkan cashback 0%. Setelah cashback di hitung, program juga harus menghitung kembali dan menampilkan total yang harus dibayarkan oleh pelanggan.
//Nama : Fara Habiba Walida Arifiani
//nim : 25410100090
//sesi 2 : 09.20 - 10.10

package raraa.task;

import java.util.Scanner;

public class totalTransaksipulsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pelanggan: ");
        int jumlahPelanggan = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer

        // Validasi jumlah pelanggan minimal 3
        while (jumlahPelanggan < 3) {
            System.out.print("Jumlah pelanggan harus minimal 3. Silakan masukkan lagi: ");
            jumlahPelanggan = sc.nextInt();
        }

        // Array 1 dimensi untuk Nama dan Nominal
        String[] namaPelanggan = new String[jumlahPelanggan];
        double[] nominalPulsa = new double[jumlahPelanggan];

        // Input Data
        for (int i = 0; i < jumlahPelanggan; i++) {
            System.out.print("\nMasukkan nama pelanggan ke-" + (i + 1) + ": ");
            namaPelanggan[i] = sc.nextLine();

            System.out.print("Pilih nominal (100000, 50000, 25000, 15000) untuk " + namaPelanggan[i] + ": ");
            nominalPulsa[i] = sc.nextDouble(); 
            sc.nextLine(); // Membersihkan buffer

            // Validasi Nominal
            while (nominalPulsa[i] != 100000 && nominalPulsa[i] != 50000 && 
                   nominalPulsa[i] != 25000 && nominalPulsa[i] != 15000) {
                System.out.print("Nominal tidak valid. Masukkan lagi: ");
                nominalPulsa[i] = sc.nextDouble();
            }
        }

        System.out.println("\n========== RINCIAN PEMBAYARAN ==========");

        // Proses perhitungan dan Output dalam satu loop
        for (int i = 0; i < jumlahPelanggan; i++) {
            double bayar = nominalPulsa[i] + 2000; // Nominal + Admin
            double Cashback = 0;

            // Logika Cashback berdasarkan total bayar per pelanggan
            if (bayar > 100000) {
                Cashback = 0.15;
            } else if (bayar > 50000) {
                Cashback = 0.10;
            } else {
                Cashback = 0.0;
            }

            double nilaiCashback = bayar * Cashback;
            double bayarSetelahCashback = bayar - nilaiCashback;

            // Menampilkan hasil
            System.out.println("Pelanggan: " + namaPelanggan[i]);
            System.out.println("- Total Awal (+Admin): Rp" + bayar);
            System.out.println("- Cashback (" + (int)(Cashback * 100) + "%): Rp" + nilaiCashback);
            System.out.println("- Harus Dibayar      : Rp" + bayarSetelahCashback);
            System.out.println("----------------------------------------");
        }

        sc.close();
    }
}