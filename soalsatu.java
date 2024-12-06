package belajar;

import java.util.Scanner;

public class soalsatu {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Input data 
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        // volume paket
        double volume = panjang * lebar * tinggi;

        //  jarak
        double biayaJarak;
        if (jarak <= 10) {
            biayaJarak = berat * 4250;
        } else {
            biayaJarak = berat * 6000;
        }

        //  volume
        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }

        //  total biaya
        double totalBiaya = biayaJarak + biayaVolume;

        
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);//tampil
    }
    }
    

