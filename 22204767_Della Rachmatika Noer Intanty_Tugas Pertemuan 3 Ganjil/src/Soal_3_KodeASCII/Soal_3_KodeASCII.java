/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_3_KodeASCII;

/**
 *
 * @author DELLA
 */

/* Soal:
   Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter ‘1’ dan
   karakter ‘2’! */

public class Soal_3_KodeASCII {
    public static void main(String[] args) {
        // Mendefinisikan karakter '1' dan '2'
        char karakter1 = '1'; //1=49
        char karakter2 = '2'; //2=50

        //Menghitung nilai ASCII
        int kodeASCII1 = (int) karakter1;
        int kodeASCII2 = (int) karakter2;

        // Menjumlahkan kode ASCII
        int hasilJumlah = kodeASCII1 + kodeASCII2;

        // Menampilkan hasil
        System.out.println("Jumlah Kode ASCII dari '1' dan '2' adalah: " + hasilJumlah);
    }
}

