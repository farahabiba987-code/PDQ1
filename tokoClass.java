import java.util.Scanner;

public class tokoClass { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        nama barang --> string
        harga barang --> int
        jumlah yang dibeli --> int
        total yang dibayar  --> int
        */

        System.out.print("Masukkan Nama Barang : ");
        String namaBarang = sc.nextLine();
        
        System.out.print("Masukkan harga barang :");
        int hargaBarang = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Masukkan jumlah yang dibeli :");
        int jumlahYangDibeli = sc.nextInt();

        System.out.print("Masukkan total yang dibayar :");
        int totalBayar = hargaBarang * jumlahYangDibeli;

        System.out.println("nama barang : " +namaBarang);
        System.out.println("harga barang : " +hargaBarang);
        System.out.println("jumlah yang dibeli : " +jumlahYangDibeli);
        System.out.println("total bayar : " +totalBayar);
    }
}
