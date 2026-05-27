package procedure;
public class cetakPemisah {

    public static void main(String[] args) {
        cetakGaris();
        cetakGaris();
        cetakGaris();
    }

    public static void cetakGaris(){
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();
        }
    }