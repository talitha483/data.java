package belajar;

import java.util.HashMap;
import java.util.Scanner;

public class soaltiga3 {
    public static void hitungFrekuensi(int[] array) {
        HashMap<Integer, Integer> frekuensi = new HashMap<>();
        for(int angka : array){
            frekuensi.put(angka, frekuensi.getOrDefault(angka, 0)+1);
        }
    
        System.out.println("hasil frekuensi: ");
        for ( int angka: frekuensi.keySet()){
            System.out.println(angka+ " muncul "+ frekuensi.get(angka)+ " kali ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("masukkan jumlah: ");
        int jumlah = s.nextInt();

        
        int[]array = new int [jumlah];
        System.out.println("masukkan nilai elemt: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("hasil ke- " + (i+1)+ " : ");
            array[i] = s.nextInt();
            
        }
        hitungFrekuensi(array);
        s.close();
    }
    
}