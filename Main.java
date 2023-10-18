package Operasi;

import Operasi.Matriks;
import Operasi.Pecahan;

public class Main {
    public static void main(String[] args) {
        Pecahan pecahan1 = new Pecahan(7, 10);
        Pecahan pecahan2 = new Pecahan(5, 8);

        System.out.println("Pecahan 1: " + pecahan1);
        System.out.println("Pecahan 2: " + pecahan2);

        Pecahan hasilpenambahan = pecahan1.tambah(pecahan2);
        System.out.println("Hasil Penjumlahan: " + hasilpenambahan);

        Pecahan hasilpengurangan = pecahan1.kurang(pecahan2);
        System.out.println("Hasil Pengurangan: " + hasilpengurangan);

        Pecahan hasilperkalian = pecahan1.kali(pecahan2);
        System.out.println("Hasil Perkalian: " + hasilperkalian);

        Pecahan hasilpembagian = pecahan1.bagi(pecahan2);
        System.out.println("Hasil Pembagian: " + hasilpembagian);

        Matriks matriks1 = new Matriks(2, 2);
        matriks1.angka[0][0] = pecahan1;
        matriks1.angka[0][1] = pecahan2;
        matriks1.angka[1][0] = pecahan1;
        matriks1.angka[1][1] = pecahan2;

        Matriks matriks2 = new Matriks(2, 2);
        matriks2.angka[0][0] = pecahan2;
        matriks2.angka[0][1] = pecahan1;
        matriks2.angka[1][0] = pecahan2;
        matriks2.angka[1][1] = pecahan1;

        System.out.println("Matriks 1 :");
        System.out.println(matriks1);

        System.out.println("Matriks 2 :");
        System.out.println(matriks2);

        matriks1.penambahan(matriks2);
        System.out.println("Hasil Penjumlahan : ");
        System.out.println(matriks1);

        matriks1.pengurangan(matriks2);
        System.out.println("Hasil Pengurangan : ");
        System.out.println(matriks1);

        matriks1.dot(matriks2);
        System.out.println("Hasil Dot Product : ");
        System.out.println(matriks1);

        matriks1.transpose();
        System.out.println("Hasil Transpose : ");
        System.out.println(matriks1);

        matriks1.inverse();
        System.out.println("Hasil Invers : ");
        System.out.println(matriks2);
    }
}