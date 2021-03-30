package tugas;

import java.util.Arrays;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int panjang = 0;
        System.out.print("masukan panjang nilai : ");
        panjang = s.nextInt();
        int[] angka = new int[panjang];
    
        for (int i = 0; i < panjang; i++) {
            System.out.print("masukan nilai ke-" + i + " : ");
            angka[i] = s.nextInt();
        }

        System.out.print("[ ");
        for (int i : angka) {
            System.out.print(i + " ");
        }
        System.out.println("]");

        Arrays.sort(angka);
        System.out.println("Nilai setelah diurutkan dari yang terkecil - terbesar");
        System.out.println("=====================================================");
        System.out.print("[ ");
        for (int i : angka) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}
