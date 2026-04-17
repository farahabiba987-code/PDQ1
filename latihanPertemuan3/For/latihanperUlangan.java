package latihanPertemuan3.For;

import java.util.Scanner;
public class latihanperUlangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        1. Entri data
        2. print data
        
        harus hitung total belanja, dimana menu bisa > 5
    */
    //variabel
    int menu, total = 0, harga=0, jumlah=0, iterasi=0;
    String namaKegiatan = "0", namaBarang = "0", jumlahBarang = "0";
        
        //menu bisa diulang>> while/dowhile
        do{
            System.out.println("1. Entri Data");
            System.out.println("2. Print Data");
            System.out.print("pilih menu : ");
            menu = sc.nextInt();
            
            //percabangan menu>>switch case
        switch(menu){
            case 1:
                //entri data
                System.out.println("=== Entri Data ===");
                //data diulang > 5x
                System.out.println("jumlah data yang akan diinputkan : ");
                iterasi = sc.nextInt();
                for (int i = 1; i <= iterasi; i++) {
                    System.out.println();("Nama Kegiatan : ");
                    namaKegiatan = sc.nextLine();

                    System.out.println("Jumlah Barang : ");
                    jumlahBarang = sc.nextInt();

                    System.out.print("Harga Barang : ");
                    harga = sc.nextInt();
                    System.out.println("total += jumlahBarang * harga;");
            break;
            }

            case 2:
                //exit
                default:
                System.exit(0);
            break;
        }
        } while (true);
    }
}
        