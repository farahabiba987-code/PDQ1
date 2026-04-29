package raraa.Array;

import java.util.*;

public class latihanArray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi variabel
        //kategori & harga isian bebas, total, jumlah beli
        String[] kategori = null;
        int[] harga = null;
        int[] kategoriArr = null;
        int pilihMenu=0, jumlahKategori=0;

        //loop menu
        do {
            System.out.println("Pemesanan Tiket Surabaya zoo");
            System.out.println("1. Input kategori dan harga tiket");
            System.out.println("2. Input jumlah tiket yang dipesan");
            System.out.println("3. Lihat total harga yang harus dibayar");
            System.out.println("4. Keluar program");
            System.out.print("pilih menu: ");
            pilihMenu = sc.nextInt();

            switch (pilihMenu) {
                case 1 :
                    //input kategori dan harga >> array 1D
                    System.out.print("Jumlah kategori yang ingin diisi: ");
                    jumlahKategori = sc.nextInt();
                    sc.nextLine();

                    //deklarasi ulang arrray utk menambahkan elemen array
                    kategori = new String[jumlahKategori];
                    harga = new int[jumlahKategori];
                    String [] namaKategori = {"Dewasa", "Remaja", "Anak-anak", "Lansia"};

                    //input data array >> loop (for
                    for(int i=0; i<kategori.length; i++){
                        System.out.print("Nama kategori: ");
                        kategori[i]=sc.nextLine().trim();
                        System.out.print("Harga: ");
                        harga[i] = sc.nextInt();

                        sc.nextLine();
                    }

                    //output data array >> loop (for)
                    for(int i=0; i<kategori.length; i++){
                        System.out.println("Kategori ke"+(i+1)+": "+kategori[i]);
                        System.out.println("Harga ke"+(i+1)+": "+harga[i]);
                    }
                    break;
                case 2 :
                    //input jumlah beli
                    //cetak pilihan kategori dan harga apa saja
                    //input
                    if (kategori == null || harga == null) {
                        System.out.println("Silahkan isi kategori di menu 1 terlebih dahulu!");
                    } else {
                        System.out.println("\n--- Pilih Kategori Tiket ---");
                        for (int i = 0; i < kategori.length; i++) {
                            System.out.println((i + 1) + ". " + kategori[i] + " (Rp " + harga[i] + ")");
                        }
                        System.out.print("Pilih nomor kategori: ");
                        int pilihan = sc.nextInt();
                        kategoriArr = new int[kategori.length]; // Array untuk menyimpan jumlah beli per kategori

                        if (pilihan > 0 && pilihan <= kategori.length) {
                            System.out.print("Masukkan jumlah tiket untuk " + kategori[pilihan - 1] + ": ");

                            // Menyimpan jumlah beli ke index yang sesuai
                            kategoriArr[pilihan - 1] += sc.nextInt();
                            System.out.println("Berhasil ditambahkan ke keranjang.");
                        } else {
                            System.out.println("Pilihan tidak valid!");
                        }
                    }
                    break;

                case 3:
                    if (kategori == null){
                        System.out.println("Tidak ada tiket yang dibeli !!!");
                        continue;
                    }

                    System.out.println("=== Total ===");
                    int grandTotal = 0;
                    for (int i = 0; i < kategoriArr.length; i++) {
                        int subTotal = kategoriArr[i] * harga[i];
                        grandTotal += subTotal;
                        System.out.println("Tiket Kategori - "+ kategori[i] + " (Rp  " + harga[i] + "): " + kategoriArr[i] + " : Rp " + subTotal);
                    }
                    System.out.println("Total pembelian tiket sebesar Rp " +grandTotal);
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (true);
    }
}