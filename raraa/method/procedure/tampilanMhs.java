package procedure;

public class tampilanMhs {
    static void tampilMhs(String nama, String nim, double ipk) {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }
    public static void main(String[] args) {
        tampilMhs("Kelvin Argantara", "26420100089", 4.00);
    }
}