package latihanPertemuan3.For;

import java.util.Scanner;

/**
 * Program untuk rekapitulasi pengumpulan tugas mahasiswa menggunakan loop FOR.
 * Dosen input jumlah mahasiswa, lalu status per mahasiswa (1=sudah, 0=belum).
 */
public class rekapPengumpulantugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Program Penghitung Status Pengumpulan Mahasiswa ====");
        System.out.print("Jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine(); // Clean buffer

        int jumlahSudahMengumpulkan = 0;
        int jumlahBelumMengumpulkan = 0;

        // Loop FOR untuk setiap mahasiswa
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("\n--- Mahasiswa ke-" + i + " ---");
            System.out.println("Pilihan status:");
            System.out.println("1 = Sudah mengumpulkan");
            System.out.println("0 = Belum mengumpulkan");
            System.out.print("Status (1/0): ");
            String status = sc.nextLine().trim();

            // Validasi input
            if (status.equalsIgnoreCase("1")) {
                jumlahSudahMengumpulkan++;
            } else if (status.equalsIgnoreCase("0")) {
                jumlahBelumMengumpulkan++;
            } else {
                System.out.println("Input tidak valid! Harap masukkan '1' atau '0'.");
                i--; // Retry same student
            }
        }

        // Tampilkan rekapitulasi
        System.out.println("\n==== Hasil Rekapitulasi ====");
        System.out.println("Total mahasiswa: " + jumlahMahasiswa);
        System.out.println("Sudah mengumpulkan: " + jumlahSudahMengumpulkan);
        System.out.println("Belum mengumpulkan: " + jumlahBelumMengumpulkan);
        if (jumlahMahasiswa > 0) {
            double persenSudah = (double) jumlahSudahMengumpulkan / jumlahMahasiswa * 100;
            System.out.printf("Persentase sudah mengumpul: %.1f%%\n", persenSudah);
        }

        sc.close();
    }
}

