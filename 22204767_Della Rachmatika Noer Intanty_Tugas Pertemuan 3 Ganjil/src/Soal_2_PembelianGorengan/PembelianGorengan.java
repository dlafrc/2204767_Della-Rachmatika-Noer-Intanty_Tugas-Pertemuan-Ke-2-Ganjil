/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_2_PembelianGorengan;

import java.util.Scanner;

/**
 *
 * @author DELLA
 */

/* Soal:
   Buatlah algoritma dalam Bahasa Java Anda akan keluar membeli gorengan jika
   mempunyai uang lebih besar dari 5000 (rupiah) dan hari tidak hujan, yang dapat ditulis
   sebagai ekspresi: (uang > 5000) && (!hujan) */

public class PembelianGorengan {
        public static void main(String[] args) {
        // Menggunakan Scanner untuk menerima input uang dan kondisi hujan
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah uang: ");
        int uang = input.nextInt();

        System.out.print("Apakah hari hujan? (true/false): ");
        boolean hujan = input.nextBoolean();

        // Memeriksa kondisi untuk membeli gorengan
        if (uang > 5000 && !hujan) {
            System.out.println("Beli gorengan!");
        } else {
            System.out.println("Tidak beli gorengan.");
        }

        input.close();
    }
}

