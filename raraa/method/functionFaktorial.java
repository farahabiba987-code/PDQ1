import java.util.Scanner;

public class functionFaktorial {

    // Method static int untuk menghitung faktorial menggunakan perulangan (int n)
    static int factorial(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i; // Bisa juga ditulis: hasil *= i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        // Contoh 1: Menghitung faktorial dari angka langsung (hardcoded seperti contohmu)
        int hasil1 = factorial(5); // n = 5 -> 1 * 2 * 3 * 4 * 5
        System.out.println("Faktorial dari 5 adalah: " + hasil1);

        // Contoh 2: Menghitung faktorial dari variabel i
        int i = 6;
        int hasil2 = factorial(i); // n = 6
        System.out.println("Faktorial dari " + i + " adalah: " + hasil2);

        // Contoh 3: Menerima input dari user menggunakan Scanner
        System.out.print("Masukkan angka untuk dihitung faktorialnya: ");
        int angkaInput = myObj.nextInt();
        
        int hasilInput = factorial(angkaInput);
        System.out.println("Faktorial dari " + angkaInput + " adalah: " + hasilInput);
        
        myObj.close(); // Menutup scanner untuk menghindari 'Resource leak' seperti peringatan di gambarmu
    }
}