import java.util.Scanner;

public class Soal2_Mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int a = input.nextInt();

        if (a % 2 == 0) {
            System.out.println("Bilangan Genap");
        }else {
            System.out.println("Bilangan Ganjil");
        }        
    }
}