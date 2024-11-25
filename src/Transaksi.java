// Kelas Transaksi menggunakan inheritance dari Produk
class Transaksi extends Produk {
    private String noFaktur; // Variabel String untuk nomor faktur.
    private int jumlahBeli;
    private double total;

    public Transaksi(String kodeBarang, String namaBarang, double hargaBarang, String noFaktur, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang);
        this.noFaktur = noFaktur; // noFaktur adalah tipe String untuk menyimpan nomor faktur.
        this.jumlahBeli = jumlahBeli;
        this.total = 0; // Total akan dihitung melalui metode hitungTotal().
    }

    public void hitungTotal() {
        try {
            // Exception handling untuk memastikan jumlah beli dan harga valid
            if (jumlahBeli < 0 || hargaBarang < 0) {
                throw new IllegalArgumentException("Jumlah beli dan harga barang harus bernilai positif.");
            }
            total = jumlahBeli * hargaBarang;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            total = 0;
        }
    }

    // Menggunakan String untuk menampilkan detail faktur
    public String displayInvoice() {
        return "No Faktur    : " + noFaktur + "\n"
                + displayInfo() + "\n" // Memanggil metode displayInfo() untuk detail barang.
                + "Jumlah Beli  : " + jumlahBeli + "\n"
                + "TOTAL        : " + total;
    }
}
