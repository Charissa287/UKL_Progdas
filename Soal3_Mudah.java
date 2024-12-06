public class Soal3_Mudah {
    public static void main(String[] args) {
        for (int i = 100; i >= 35; i--) {
            if (i == 35) {
                System.out.println(i + ". saya senang");
            } else if (i % 4 == 0) {
                System.out.println(i + ". saya kelas 10");
            } else if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println(i + ". saya anak moklet");
            } else {
                System.out.println(i + ". saya anak wikusama");
            }
        }
    }
}