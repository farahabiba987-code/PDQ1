package vscode;

//1.import class
import java.util.Scanner;
public class taskScanner {
    public static void main(String[] args) {
        //2. deklarasi scanner
        Scanner sc = new Scanner(System.in);

        //3. input (deklarasi variabel)
        //value dlm variabel harus diberikan nilai default
        String namaBarang = "";
        int harga = 0, jumlahBeli = 0, total = 0;

        //teks input
        System.out.println("Nama Barang : ");
        namaBarang = sc.nextLine();
        System.out.println("Harga : ");
        harga = sc.nextInt();
        System.out.println("Jumlah beli : ");
        jumlahBeli = sc.nextInt();

        //4.output
        total = harga * jumlahBeli;
        System.out.println("Total : " + total);


        //5. close scanner
        sc.close();

    }
    
}
