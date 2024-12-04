import java.util.Scanner;

public class uklsedang2 {

    static void volumeTabung(int r, int t) {
        double phi = (double)3.14;
        double result = phi * r * r * t;
        System.out.print("Volume tabungnya adalah " + result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan jarijari tabung");
        int jarijari = input.nextInt();

        System.out.println("masukkan tinggi tabung");
        int tinggi = input.nextInt();
        volumeTabung(jarijari,tinggi );
    }
}  