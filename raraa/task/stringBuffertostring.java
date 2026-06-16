package raraa.task;

public class stringBuffertostring {
    public static void main(String[] args) {
        
        String stringAwal = "Belajar Java";
        StringBuffer sb = new StringBuffer(stringAwal);
        String stringAkhir = sb.toString();
        
        System.out.println("String Awal : " + stringAwal);
        System.out.println("String Akhir: " + stringAkhir);
        
        System.out.println("Aku suka belajar java " + stringAwal.equals(stringAkhir));
    }
}