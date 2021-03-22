
package Tugas;

import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                         IBNU MAJU JAYA (IMJ)");
        System.out.println("                        Promo Belanja Berhadiah");
        System.out.println("                      Khusus Pembelian 5 Pertama");
        System.out.println("                   Dengan Harga Minimum Rp 10.000,00");
        System.out.println("-------------------------------------------------------------------------");
        System.out.print("Masukan nama pembeli : ");
        String nama = s.nextLine();
        int[] barang = new int[5];
        int total = 0;
        for (int i = 0; i < barang.length; i++) {
            System.out.print("Masukan harga barang ke-" + (i + 1) + " : ");
            barang[i] = s.nextInt();
            total = total + barang[i];
        }
        
        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp. " + total);
        
        // cek promo
        boolean promo = false;
        for (int i = 0; i < barang.length; i++) {
            promo = barang[i] >= 10000;
        }
        
        if (promo == true) {
            System.out.println("Selamat...");
            System.out.println("Anda mendapat hadiah 1 buah piring cantik");
        } else {
            System.out.println("anda tidak mendapat promo");
        }
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                             Terima Kasih");
        System.out.println("                 nda sudah berbelanja di IBNU MAJU JAYA");
        
    }
}
