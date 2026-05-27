package function;
import java.util.Scanner;

public class functionNilaiTertinggiArray {
    static int getNilaiMax(int[] arr) {
        int tertinggi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > tertinggi) {
                tertinggi = arr[i];
            }
        }
        return tertinggi;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen array:");
        int n = myObj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan elemen ke-" + (i + 1) + ":");
            arr[i] = myObj.nextInt();
        }
        System.out.println("Nilai tertinggi dalam array adalah:");
        int hasil = getNilaiMax(arr);
        System.out.println(hasil);
    }
}