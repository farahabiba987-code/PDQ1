package raraa;

import java.util.Scanner;

public class ipkMahasiswi {
    static  Scanner sc = new Scanner(System.in);
    static void main(String[] args) {
        String[] nama_matkul = {"Sistem Informasi Manajemen", "Basis Data", "Sistem Informasi Sumber Daya Manusia", "Pemasaran Digital", "Desain Antar Muka", "Pemrograman Dasar", "Praktek Pemograman Dasar", "Bahasa Indonesia", "Matematika Bisnis"};
        double[] nilai_sks = {2,3,2,2,3,3,3,2,3};
        double[] nilai_akhir = new double[nama_matkul.length];
        double[] nilai_bobot = new double[nama_matkul.length];
        System.out.print("Masukkan Nama : ");
        String name = sc.nextLine();
        for (int i = 0; i < nama_matkul.length; i++) {
             System.out.print("Masukkan Nilai akhir matkul " + nama_matkul[i] + " : ");
             nilai_akhir[i] = sc.nextDouble();

             // if else buat nge assign nilai bobot ke array berdasarkan nilai akhirnya.
            if (nilai_akhir[i]<= 100 && nilai_akhir[i]>= 80){
                nilai_bobot[i] = 4.0;
            } else if (nilai_akhir[i] < 80 && nilai_akhir[i]>= 75) {
                nilai_bobot[i] = 3.5;
            } else if (nilai_akhir[i] < 75 && nilai_akhir[i]>= 65) {
                nilai_bobot[i] = 3.0;
            } else if (nilai_akhir[i] < 65 && nilai_akhir[i]>= 60) {
                nilai_bobot[i] = 2.5;
            } else if (nilai_akhir[i] < 59 && nilai_akhir[i]>= 55) {
                nilai_bobot[i] = 2.0;
            } else if (nilai_akhir[i] < 55 && nilai_akhir[i]>= 40) {
                nilai_bobot[i] = 1.0;
            } else if (nilai_akhir[i] < 40 && nilai_akhir[i]>= 0) {
                nilai_bobot[i] = 0.0;
            } else {
                nilai_bobot[i] = 0.0;
            }
            // buat prevent bug scanner
            sc.nextLine();
        }
        double hasil = 0; // declare variable dlu
        double totalSks = 0; // ini juga

        for (int i = 0; i < nilai_akhir.length; i++) {
            hasil = hasil + (nilai_bobot[i] * nilai_sks[i]); // hitung perkalian bobot dengan sks nya
            totalSks = totalSks + nilai_sks[i]; // jumlah semua total sks
        }
        // hitung ips nya
        double ips = hasil / totalSks;

        System.out.println("IPS " + name + " adalah : " + ips);
        if (ips <= 4.0 && ips >=3.5){
            System.out.println("Total SKS Maksimum yang bisa diambil : 24 sks");
        }
        else if (ips < 3.5  && ips >=3.0){
            System.out.println("Total SKS Maksimum yang bisa diambil : 22 sks");
        }
        else if (ips < 3.0  && ips >=2.5){
            System.out.println("Total SKS Maksimum yang bisa diambil : 20 sks");
        }
        else if (ips < 2.5 ){
            System.out.println("Total SKS Maksimum yang bisa diambil : 18 sks");
        }
        else {
            System.out.println("Invalid IPS, Silahkan pergi ke AAK untuk info lebih lanjut.");
        
        }
    } 
}
