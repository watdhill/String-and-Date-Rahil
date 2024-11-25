import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // LOGIN
        String correctUsername = "rahil"; // Username disimpan dalam variabel String.
        String correctPassword = "1234"; // Password juga disimpan dalam tipe String.
        String correctCaptcha = "ABC123"; // Captcha sebagai validasi tambahan menggunakan String.
        boolean loginSuccess = false;

        System.out.println("+-------------------------------------------+");
        System.out.println("Log in");

        while (!loginSuccess) {
            System.out.print("Username : ");
            String username = scanner.nextLine(); // Input username disimpan sebagai String.

            System.out.print("Password : ");
            String password = scanner.nextLine(); // Input password disimpan sebagai String.

            System.out.print("Captcha  : ");
            String captcha = scanner.nextLine(); // Input captcha disimpan sebagai String.

            // Membandingkan input username, password, dan captcha menggunakan String.equals()
            if (username.equals(correctUsername) && password.equals(correctPassword) && captcha.equals(correctCaptcha)) {
                System.out.println("Login berhasil!");
                loginSuccess = true;
            } else {
                System.out.println("Login gagal, silakan coba lagi.");
            }
        }
        System.out.println("+-------------------------------------------+");

        // Tanggal dan waktu transaksi
        Date date = new Date(); // Membuat objek Date untuk menampilkan waktu transaksi.

        // Input data transaksi
        try {
            System.out.println("\nSelamat Datang di RahilMart");
            System.out.println("Tanggal dan Waktu : " + date.toString()); // Menggunakan metode toString() dari Date.
            System.out.println("+-------------------------------------------+");

            System.out.print("No Faktur     : ");
            String noFaktur = scanner.nextLine(); // Menyimpan nomor faktur sebagai String.

            System.out.print("Kode Barang   : ");
            String kodeBarang = scanner.nextLine(); // Input kode barang sebagai String.

            System.out.print("Nama Barang   : ");
            String namaBarang = scanner.nextLine(); // Input nama barang sebagai String.

            System.out.print("Harga Barang  : ");
            double hargaBarang = Double.parseDouble(scanner.nextLine()); // Harga barang dikonversi dari String ke double.

            System.out.print("Jumlah Beli   : ");
            int jumlahBeli = Integer.parseInt(scanner.nextLine()); // Jumlah beli dikonversi dari String ke integer.

            System.out.print("Nama Kasir    : ");
            String namaKasir = scanner.nextLine(); // Nama kasir disimpan sebagai String.

            // Membuat instance transaksi
            Transaksi transaksi = new Transaksi(kodeBarang, namaBarang, hargaBarang, noFaktur, jumlahBeli);
            transaksi.hitungTotal();

            // Menampilkan faktur transaksi
            System.out.println("\n--- Faktur Pembelian ---");
            System.out.println(transaksi.displayInvoice()); // Menampilkan detail faktur.
            System.out.println("+-------------------------------------------+");
            System.out.println("Kasir       : " + namaKasir); // Menampilkan nama kasir menggunakan String.

        } catch (NumberFormatException e) {
            System.out.println("Input salah! Pastikan harga barang adalah angka dan jumlah beli adalah bilangan bulat.");
        } finally {
            scanner.close();
        }
    }
}