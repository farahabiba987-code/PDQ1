package latihanPertemuan3.For;

import java.util.Scanner;
public class latihanperUlangan {

    public static void main(String[] args) {
        scanner sc = new Scanner(System.in);

        /*
        1. Entri data
        2. print data
        
        harus hitung total belanja, dimana menu bisa > 5
    */
    //variabel
    int menu, total = 0, harga=0, jumlah=0, iterasi=0;
        
        //menu bisa diulang>> while/dowhile
        do{
            System.out.println("1. Entri Data");
            System.out.println("2. Print Data");
            System.out.println("pilih menu : ");
            menu = sc.nextInt();

            //percabangan menu>>switch case
            switch(menu){
                case 1:
                    System.out.println("=== Entri Data ===");
                    //data diulang > 5x
                    System.out.println("berapa banyak barang yang dibutuhan ? : ");
                    iterasi = sc.nextInt();
                    for (int i = 1; i <10; i++) {
                        //input data
                        System.out.println("Masukkan harga barang ke - " + i + " : ");
                        break;
                    }
                      
                    case 2:
                        default:
                        System.exit(0);
                        break;
                
                    }
                }
            }
        }
    }    
} 