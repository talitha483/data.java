package belajar;

import java.util.Scanner;

public class soaltiga1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        //  menyimpan nilai 
        double[] nilaiSiswa = new double[jumlahSiswa];

        // masukkan nilai 
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = input.nextDouble();
        }

        // jumlah total nilai pake for each
        double totalNilai = 0;
        for (double nilai : nilaiSiswa) {
            totalNilai += nilai;
        }

        //  rata-rata nilai
        double rataRata = totalNilai / jumlahSiswa;

        
        System.out.println("Rata-rata nilai ujian Produktif RPL: " + rataRata);
    }
}

