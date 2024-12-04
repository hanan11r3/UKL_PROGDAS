import java.util.Scanner;
import java.util.Random;

public class soalsedang3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char pilihan;

        do {
            int bilangan1 = random.nextInt(10) + 1;
            int bilangan2 = random.nextInt(10) + 1;
            char operator = "*/%".charAt(random.nextInt(5));

            System.out.print(bilangan1 + " " + operator + " " + bilangan2 + " = ");
            int jawaban = scanner.nextInt();

            int hasil;
            switch (operator) {
                case '*':
                    hasil = bilangan1 * bilangan2;
                    break;
                case '/':
                    hasil = bilangan1 / bilangan2;
                    break;
                default:
                    hasil = bilangan1 % bilangan2;
                    break;
            }

            if (jawaban == hasil) {
                System.out.println("Jawaban Kamuu benarr sekalii!! mantapp");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + hasil);
            }

            System.out.print("Ingin melanjutkan? (y/n): ");
            pilihan = scanner.next().charAt(0);
        } while (pilihan == 'y' || pilihan == 'Y');
    }
}