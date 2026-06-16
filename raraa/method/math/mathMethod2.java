package math;

import java.util.Scanner;
public class mathMethod2 {

        public static Scanner sc = new Scanner(System.in);
        static void main(String[] args) {
            System.out.print("Masukkan Nilai Akhir : ");
            double nilai = sc.nextDouble();
            nilaimhs(nilai);
            // double nilaiA = 0.0;
            // nilaimhs(nilaiA);
            double pj = 0.0, lb = 0.0;
            //jika ada parameter, maka harus ada variabel tambahan dalam main
            diagonal(pj, lb);
        }
  /*
    Soal 1.
    Input nilai akhir (boleh desimal) utk menampilkan
    nilai yg sudah dibulatkan dan hitung selisih mutlak terhadap
    nilai 100

  */

        static void nilaimhs(double nilai){
            double nilaiBulat = Math.round(nilai);
            double selisih = Math.abs(nilaiBulat - 100);
            System.out.println("nilai Bulatkan "+nilaiBulat);
            System.out.println("selisih ke 100 " +selisih);
        }

  /*
    Soal 2.
  */

        static double diagonal(double panjang, double lebar){
            System.out.print("Masukkan panjang : ");
            panjang = sc.nextDouble();
            System.out.print("Masukkan lebar : ");
            lebar = sc.nextDouble();
            double diagonal = Math.sqrt(Math.pow(panjang,2) + Math.pow(lebar,2));
            System.out.println("Diagonal = " + diagonal);
            return diagonal;
        }
    }
