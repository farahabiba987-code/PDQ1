package src.farel;

import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan umur anda : ");
        int umur = sc.nextInt();
        String keterangan = "";
        if (umur > 17 && umur <=30) {
            keterangan = "TUEK";
        }else if(umur > 30){
            keterangan = "FOSIL";


        } else if (umur < 0) {
            keterangan = "HUUUU BOONG";
        } else {
            keterangan = "ENOM";
        }
        System.out.println("UMUR MU = " + umur + " , " + keterangan);
        switch (keterangan) {
            case "TUEK":
                System.out.println("LHOOOO TUAAAAA");
                break;
            case "ENOM" : 
                System.out.println("HOOO ENOM NJIR");
                break;
                
            case "FOSIL" :
                System.out.println("NJIR BBM");
                break;
                    
            default:
                System.out.println(" ANJAIIIIII");
                break;
        }
    }
}
