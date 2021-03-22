
package Tugas;

public class c {
    public static void main(String[] args) {
        int[][] angka = {
            {5,6,1,7},
            {8,1,2,9},
            {5,4,7,1},
            {8,3,7,5}            
        };
        /*
        BREAKDOWN KODENYA
        -----------------
        System.out.print("[ ");
        for (int i = 0; i < angka[0].length; i++) {
            System.out.print(angka[0][i] + " ");
        }
        System.out.println("]");
        System.out.print("[ ");
        for (int i = 0; i < angka[1].length; i++) {
            System.out.print(angka[1][i] + " ");
        }
        System.out.println("]");
        System.out.print("[ ");
        for (int i = 0; i < angka[2].length; i++) {
            System.out.print(angka[2][i] + " ");
        }
        System.out.println("]");
        System.out.print("[ ");
        for (int i = 0; i < angka[3].length; i++) {
            System.out.print(angka[3][i] + " ");
        }
        System.out.println("]");

        */
        for (int[] angka1 : angka) {
            System.out.print("[ ");
            for (int j = 0; j < 4; j++) {
                System.out.print(angka1[j] + " ");
            }
            System.out.println("]");
        }
    }
}
