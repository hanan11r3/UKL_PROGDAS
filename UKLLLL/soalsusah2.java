import java.util.Arrays;
import java.util.Scanner;

public class soalsusah2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan jumlah element");
        int n = input.nextInt();

        System.out.println("masukkan bilangan");
        int []bilangan = new int[n];

        for(int i = 0; i < bilangan.length; i++){
            bilangan[i] = input.nextInt();
        }
        
  

        //untuk mencari elemen yang duplikat
        boolean duplikat= false;
        for (int i = 0; i < bilangan.length; i++) {
            for (int j = i + 1; j < bilangan.length; j++) {
                if (bilangan[i] == bilangan[j]) {
                    duplikat= true;
                    System.out.println("Array memiliki elemen duplikat: " + bilangan[i]);
                    break;
                }
            }
            if (duplikat) {
                break;
            }
        }

        if (!duplikat) {
            System.out.println("Array tidak memiliki elemen duplikat.");
        }
    }
}