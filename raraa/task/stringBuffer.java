package raraa.task;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sbA = new StringBuffer();
        System.out.println("sbA: '" + sbA + "' | panjang: " + sbA.length() + " | kapasitas: " + sbA.capacity());
        
        StringBuffer sbB = new StringBuffer(100);
        System.out.println("sbB: '" + sbB + "' | panjang: " + sbB.length() + " | kapasitas: " + sbB.capacity());
        
        StringBuffer sbC = new StringBuffer("Halo");
        System.out.println("sbC: '" + sbC + "' | panjang: " + sbC.length() + " | kapasitas: " + sbC.capacity());
    }
}
