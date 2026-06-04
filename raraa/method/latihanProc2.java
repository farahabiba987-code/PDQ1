
import java.util.Scanner;
public class latihanProc2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inputData();
    }

    static void inputData() {
        System.out.print("Masukkan nama barang: ");
        String namaBarang = sc.nextLine();
        System.out.print("Masukkan harga barang: ");
        int hargaBarang = sc.nextInt();
        System.out.print("Masukkan jumlah beli: ");
        int jumlahBeli = sc.nextInt();

        int totalBayar = totalBayar(hargaBarang, jumlahBeli);
        outputData(namaBarang, hargaBarang, jumlahBeli, totalBayar);
    }

    static int totalBayar(int hargaBarang, int jumlahBeli) {
        return hargaBarang * jumlahBeli;
    }

    static void outputData(String namaBarang, int hargaBarang, int jumlahBeli, int totalBayar) {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total Bayar: " + totalBayar);
    }
}

//1. Buat procedure inputData yang memiliki inputan data nama barang, harga barang, dan jumlah beli.
//2. Buat fungsi dengan nama totalBayar yang memiliki parameter harga barang dan jumlah beli 
//3. Rumus totalBayar adalah harga barang * jumlah beli
//4. Hasil output dari fungsi totalBayar dicetak pada inputData
//5. Buat prosecedure outputData untuk mencetak semua data (nama barang, harga barang, jumlah beli dan total)
