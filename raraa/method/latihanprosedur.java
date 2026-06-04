    1. prosedur untuk input data mahasiswa dengan inputan nilai UTS, UAS, dan Tugas
    2. fungsi dengan nama nilaiAkhir yg memiliki parameter uts, uaas, dan tugas bertipe integer

package procedure;
import java.util.Scanner;
public class latihanprosedur {
    static Scanner sc = new Scanner(System.in);
    
    static void inputData() {
        System.out.print("Masukkan nilai UTS:");
        int uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS:");
        int uas = sc.nextInt();
        System.out.print("Masukkan nilai Tugas:");
        int tugas = sc.nextInt();

        System.out.println("Nilai akhir:" + nilaiAkhir(uts, uas, tugas));

    }
    
    //2. proc/func itu bisa di panggil di main atau di dalam proc/func lain
    static int nilaiAkhir(int uts, int uas, int tugas) {
        //nilai akhir = (uts*25%) + (uas*35&) + (tugas*40%)
        int nilaiAkhir = (uts * 25 / 100) + (uas * 35 / 100) + (tugas * 40 / 100);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        return nilaiAkhir;
    }

    public static void main(String[] args) {
        int uts = 0, uas = 0, tugas = 0;
        inputData();
    }

    

    
}
