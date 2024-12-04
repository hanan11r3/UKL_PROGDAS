import java.util.Scanner;

public class soalsusah3 {
    public static void main(String[] args) {
        
        int []array = {1,2,3,4,4,4,5,5,6};
        int[] unique = new int[array.length]; // Array untuk menyimpan elemen unik
        int[] frekuensi = new int[array.length];   // Array untuk menyimpan frekuensi
      

        int indeks = 0;

        for (int i = 0; i < array.length; i++) {
            boolean ditemukan = false;
            for (int j = 0; j < indeks; j++) {
                if (array[i] == unique[j]) {
                    frekuensi[j]++;
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                unique[indeks] = array[i];
                frekuensi[indeks] = 1;
                indeks++;
            }
        }

        for (int i = 0; i < indeks; i++) {
            System.out.println(unique[i] + " muncul " + frekuensi[i] + " kali");
        }
    }
}