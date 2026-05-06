package replayaLife.For;

public class totalPendapatan {
    public static void main(String[] args) {
        int jumlahHari = 3; //total pendapatan selama 3 hari
        int transaksiperHari = 3; // Jumlah barang yang terjual
        int nominalTransaksi = 50000; // Harga per transaksi
        int totalseluruhPendapatan = 0; // total pendapatan
        int totalHarian = 0; // Total pendapatan per hari

        //loop untuk hari
        for (int hari = 1; hari <= jumlahHari; hari++) {
            int pendapatanHari = transaksiperHari * nominalTransaksi; // Pendapatan per hari
            System.out.println("Hari ke " + hari + ": " + pendapatanHari);

            //loop untuk transaksi
            for (int transaksi = 1; transaksi <= transaksiperHari; transaksi++) {
                totalHarian += nominalTransaksi; // Menambahkan pendapatan per transaksi ke total harian
                totalseluruhPendapatan += totalHarian; // Menambahkan total harian ke total seluruh pendapatan
                System.out.println("- Transaksi ke "+ transaksi +": " + nominalTransaksi);
            }
        }
        System.out.println("Total Pendapatan: " + totalseluruhPendapatan);
        System.out.println("Total Pendapatan "+ jumlahHari +" Hari: " + nominalTransaksi * transaksiperHari * jumlahHari);
    }
}
