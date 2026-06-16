package math;

public class contohMath {

    static double luasLingkaran(double r) {

        static void main(String[] args) {
            hipotenusa();
            luasLingkaran(7);
        }
        static double luasLingkaran(double r) {
        double jari = 7;
        double luas = Math.PI * Math.pow(jari, 2);

        //pembulatan hasil ke 2 angka di belakang koma
        double hasil = Math.round(luas * 100.0) / 100.0;
        double bulat = Math.round(luas);

        System.out.println("Luas lingkaran : "+luas);
        System.out.println("hasil pembulatan : "+hasil);
        System.out.println("hasil pembulatan 2 digit : "+bulat);
        return hasil;
    }
    static double hipotenusa() {
        double sisiA = 3, sisiB = 8;
        double hipotenusa = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        System.out.println("Hasil hipotenusa : "+hipotenusa);
        return Hasilhipotenusa;
    }
}
