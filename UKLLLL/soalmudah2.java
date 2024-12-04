import java.util.Scanner;

public class soalmudah2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas bawah: ");
        int batasBawah = scanner.nextInt();

        System.out.print("Masukkan batas atas: ");
        int batasAtas = scanner.nextInt();

        System.out.println("Daftar angka genap antara " + batasBawah + " dan " + batasAtas + ":");

        for (int i = batasBawah; i <= batasAtas; i += 2) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}