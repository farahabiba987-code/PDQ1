package raraa.task;

public class lengthVScapasity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(50);
        sb.append("Java");
        
        System.out.println("Isi: " + sb);
        System.out.println("Length (isi): " + sb.length());
        System.out.println("Capacity (tempat): " + sb.capacity());
    }
}
