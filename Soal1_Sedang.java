import java.util.Scanner;

public class Soal1_Sedang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif: ");
        int a = scanner.nextInt();
        
        // Memeriksa apakah input valid
        if (a < 0) {
            System.out.println("Bilangan harus positif.");
        } else {
            int hasil = 1; // Variabel untuk menyimpan hasil faktorial
            for (int i = 1; i <= a; i++) {
                System.out.print(i+" x ");
                hasil *= i ; // Mengalikan setiap bilangan dari 1 hingga n
            }
            System.out.println("");
            System.out.println("Faktorial dari " + a + " adalah: " + hasil);
        }
        
        scanner.close();
    }
}