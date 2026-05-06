package raraa.task;

import java.util.Scanner;

public class pemanasan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah siswa yang mengikuti ujian matematika (minimal 5 siswa): ");
        int jumlahSiswa = sc.nextInt();

        while (jumlahSiswa < 5) {
            System.out.println("Jumlah siswa harus minimal 5. Silakan masukkan jumlah siswa yang benar: ");
            jumlahSiswa = sc.nextInt();
        }

        System.out.println("masukkan nilai siswa minimum (mimimal 75)"); {
        int nilaiMinimum = sc.nextInt();

        while (nilaiMinimum < 75) {
            System.out.println("Nilai minimum harus minimal 75. Silakan masukkan nilai minimum yang benar: ");
            nilaiMinimum = sc.nextInt();
        }

        sc.nextLine(); // buat bersihin enter biar input namanya ga ke skip

        String[] namaSiswa = new String[jumlahSiswa]; // array nama
        double[] nilaiUjian = new double[jumlahSiswa]; // array nilai
        String[] statusKelulusan = new String[jumlahSiswa]; // array status

        int jumlahLulus = 0; // penghitung bagian lulus
        int jumlahGagal = 0; // penghitung bagian gagal

        for (int i = 0; i < jumlahSiswa; i++) { // input data siswa

            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
            namaSiswa[i] = sc.nextLine(); // input nama

            System.out.print("Masukkan nilai ujian " + namaSiswa[i] + ": ");
            nilaiUjian[i] = sc.nextDouble(); // input nilai

            sc.nextLine(); // buat bersihin enter

            // nampilin membandingkan nilai hasil ujian dengan nilai minimum di terminal biar user bisa tau prosesnya
            System.out.println("Membandingkan " + nilaiUjian[i] + " dengan nilai minimum " + nilaiMinimum);

            if (nilaiUjian[i] >= nilaiMinimum) { // kondisi lulus
                statusKelulusan[i] = "LULUS";
                jumlahLulus++;
            } else { // kondisi gagal
                statusKelulusan[i] = "GAGAL";
                jumlahGagal++;
            }
        }

        System.out.println("\n===== HASIL UJIAN PESERTA =====");

        for (int i = 0; i < jumlahSiswa; i++) { // nampilin hasil
            System.out.println(namaSiswa[i] + " - Nilai: " + nilaiUjian[i] + " - Status: " + statusKelulusan[i]);
            // namaSiswa[i] = nama siswa ke-i
            // nilaiUjian[i] = nilai ujian siswa ke-i
            // statusKelulusan[i] = hasil perbandingan (LULUS/GAGAL)
        }

        System.out.println("\nJumlah Siswa Lulus: " + jumlahLulus); // total lulus
        System.out.println("Jumlah Siswa Gagal: " + jumlahGagal); // total gagal

        sc.close(); // tutup scanner
        }
    }
}
