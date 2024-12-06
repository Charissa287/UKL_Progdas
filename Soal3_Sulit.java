import java.util.Scanner;

public class Soal3_Sulit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data dalam array: ");
        int a = scanner.nextInt();
        
        int[] array = new int[a];
  
        System.out.println("Masukkan data array:");
        for (int i = 0; i < a; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\n--- Frekuensi Data ---");
        for (int i = 0; i < array.length; i++) {
            int count = 1;  
            
            if (array[i] == -1) {
                continue;
            }

        
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++; 
                    array[j] = -1;  
                }
            }

            
            System.out.println(array[i] + " muncul " + count + " kali");
        }

        scanner.close();
    }
}