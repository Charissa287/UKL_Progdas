import java.util.Scanner;

public class Soal3_SedangRevisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Halo, Selamat datang. Mau beli barang apa? (baju / buku): ");
        String pilihan = scanner.nextLine();
        int jumlahBaju = 0, jumlahBuku = 0;
        String baju, buku;

        if (pilihan.equals("baju")) {
            System.out.print("Mau beli baju berapa? ");
            jumlahBaju = scanner.nextInt();
            System.out.println("Anda membeli " + jumlahBaju + " baju.");
        } else if (pilihan.equals("buku")) {
            System.out.print("Mau beli buku berapa? ");
            jumlahBuku = scanner.nextInt();
            System.out.println("Anda membeli " + jumlahBuku + " buku.");
        } else {
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }

        scanner.nextLine();

        System.out.println("Mau tambah barang? (ya / tidak)");
        String tambah = scanner.nextLine();

        int totalBaju = jumlahBaju, totalBuku = jumlahBuku;

        if (tambah.equals("ya")) {
            System.out.print("Mau tambah barang apa? (baju / buku): ");
            String barang3 = scanner.nextLine();
            if (barang3.equals("baju")) {
                System.out.println("Baik, mau tambah berapa baju?");
                int tambahanBaju = scanner.nextInt();
                totalBaju += tambahanBaju; 
                System.out.println("Anda menambahkan " + tambahanBaju + " baju.");
            } else if (barang3.equals("buku")) {
                System.out.println("Baik, mau tambah berapa buku?");
                int tambahanBuku = scanner.nextInt();
                totalBuku += tambahanBuku; 
                System.out.println("Anda menambahkan " + tambahanBuku + " buku.");
            } else {
                System.out.println("Barang tidak valid.");
            }
        } else if (tambah.equals("tidak")) {
            System.out.println("Terima kasih telah berbelanja.");
        } else {
            System.out.println("Input tidak valid. Silakan masukkan 'ya' atau 'tidak'.");
        }

        System.out.println("\n--- Total Barang yang Dibeli ---");
        System.out.println("Total Baju: " + totalBaju);
        System.out.println("Total Buku: " + totalBuku);

        scanner.close();
    }
}