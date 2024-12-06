import java.util.Scanner;

public class Soal2_Sulit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah elemen array dari pengguna
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        // Deklarasi array
        int[] array = new int[n];

        // Memasukkan elemen ke dalam array
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        boolean hasDuplicate = false;

        // Periksa duplikat menggunakan perulangan
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Array memiliki elemen duplikat: " + array[i]);
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate) break;
        }

        if (!hasDuplicate) {
            System.out.println("Array tidak memiliki elemen duplikat.");
        }

        scanner.close();
    }
}
