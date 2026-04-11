package latihanPertemuan3.While;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ini adalah program while loop
        boolean checkBoolean = true;
        while (checkBoolean) {
            System.out.print("Halo apa kamu suka coklat ? (Y/n): ");
            String opsi = sc.nextLine().trim();
            if (opsi.equalsIgnoreCase("Y")){
                checkBoolean = false;
                System.out.println("Kamu suka coklat");
            } else if (opsi.equalsIgnoreCase("n")) {
                checkBoolean = false;
                System.out.println("Kamu tidak suka coklat");
            } else {
            }
        }
    }
}
