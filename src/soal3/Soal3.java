/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] barang = {"Toshiba", "Asus", "Acer", "Apple"};
        int[] harga = {900000, 1000000, 1100000, 2000000};
        System.out.println("<<Daftar Harga Laptop>>");
        for (int i = 0; i < harga.length; i++) {
            System.out.println(i + "." + barang[i] + " Harga\t: Rp." + harga[i]);
        }
        
        System.out.println("-- Pilih Angka Laptop Yang Diinginkan --");
        System.out.print("Pilihan\t\t\t: ");
        int pilihan = input.nextInt();
        int hargabarang=harga[pilihan];
        System.out.println("Barang\t\t\t: "+barang[pilihan] +"(Rp."+ harga[pilihan]+")");
        System.out.println("Total Pembayaran\t: Rp."+ harga[pilihan]);
        System.out.print("Masukan Nominal Uang\t: Rp." );
        int uang = input.nextInt();
        
    if (harga[pilihan]>=1000000){
        System.out.println("Mendapat diskon 5% setiap pembelian 1000000 ke atas");
        double diskon = harga[pilihan]*0.05;
        double Kembalian =uang-(harga[pilihan]-diskon);
        System.out.println("Kembalian\t\t: " +Kembalian);
        
    }
    else{
        System.out.println("Terimakasih");
        int Kembalian = uang-harga[pilihan];
        System.out.println("Kembalian\t\t: " +Kembalian);
        
    }
    }

}
