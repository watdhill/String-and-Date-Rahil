// Kelas Produk
class Produk {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    public Produk(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang; // Variabel kodeBarang adalah tipe String untuk menyimpan kode barang.
        this.namaBarang = namaBarang; // Variabel namaBarang adalah tipe String untuk menyimpan nama barang.
        this.hargaBarang = hargaBarang; // Variabel hargaBarang menyimpan harga barang.
    }

    // Menggunakan String untuk menggabungkan informasi barang
    public String displayInfo() {
        return "Kode Barang : " + kodeBarang + "\nNama Barang : " + namaBarang + "\nHarga Barang : " + hargaBarang;
    }
}
