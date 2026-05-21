import java.util.Scanner;

public class funtionluasPersegipanjang {
    static int luasPersegipanjang(int panjang, int lebar) {
        int luas  = panjang * lebar;
        return luas; 
    }
     public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int p  = myObj.nextInt();
        int l = myObj.nextInt();
        
        int luas = luasPersegipanjang(p, l);
        System.out.println(luas);
    }
}
