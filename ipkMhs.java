

import java.util.Scanner;

public class ipkMhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMatkul;
        double totalBobot = 0;
        int totalSKS = 0;

        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMatkul = sc.nextInt();

        for (int i = 1; i <= jumlahMatkul; i++) {
            System.out.println("\nMata kuliah ke-" + i);

            System.out.print("Masukkan nilai (A/B/C/D/E): ");
            char nilai = sc.next().toUpperCase().charAt(0);

            System.out.print("Masukkan jumlah SKS: ");
            int sks = sc.nextInt();
            double nilaiIpk = 0;

            switch (nilai) {
                case 'A':
                    nilaiIpk = 4.0;
                    System.out.println("Selamat, Anda mendapatkan IPK Cumlaude");
                    break;
                case 'B':
                    nilaiIpk = 3.0;
                    System.out.println("Selamat, Anda mendapatkan IPK Memuaskan");
                    break;
                case 'C':
                    nilaiIpk = 2.0;
                    System.out.println("Anda harus mengulang mata kuliah ini untuk meningkatkan IPK Anda");
                    break;
                case 'D':
                    nilaiIpk = 1.0;
                    System.out.println("Anda harus mengulang mata kuliah ini tahun depan");
                    break;
                case 'E':
                    nilaiIpk = 0.0;
                    System.out.println("Nilai tidak valid, dianggap E.");
                    break;
            }

            totalBobot += nilaiIpk * sks;
            totalSKS += sks;
        }

        if (totalSKS == 0) {
            System.out.println("Tidak ada SKS yang dimasukkan.");
        } else {
            double IP = totalBobot / totalSKS;
            System.out.printf("\nIP Semester: %.2f\n", IP);

            int maksSKS;
            if (IP >= 3.50) {
                maksSKS = 24;
            } else if (IP >= 3.00) {
                maksSKS = 22;
            } else if (IP >= 2.00) {
                maksSKS = 20;
            } else {
                maksSKS = 18;
            }

            System.out.println("Maksimal SKS yang bisa diambil: " + maksSKS);
        }

        sc.close();
    }
}

    
