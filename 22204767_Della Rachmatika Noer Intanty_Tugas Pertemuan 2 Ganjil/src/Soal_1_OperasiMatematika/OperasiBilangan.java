/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_1_OperasiMatematika;

import java.util.Scanner;

/**
 *
 * @author DELLA
 */

/* Soal:
   Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan
   bilangan bulat dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan! */

public class OperasiBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input tiga bilangan bulat
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bilangan3 = input.nextInt();

        // Operasi matematika
        int hasilTambah = bilangan1 + bilangan2 + bilangan3;
        int hasilKurang = bilangan1 - bilangan2 - bilangan3;
        int hasilKali = bilangan1 * bilangan2 * bilangan3;
        int hasilBagi = bilangan1 / bilangan2 / bilangan3;
        
        // Menampilkan hasil
        System.out.println("Hasil Penjumlahan: " + hasilTambah);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Perkalian: " + hasilKali);
        System.out.println("Hasil Pembagian: " + hasilBagi);
        
        input.close();
    }
}

