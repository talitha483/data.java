package belajar;

import java.util.Scanner;

public class soaldua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//objek secanner

        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        if (bilangan < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= bilangan; i++) {//loop for
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);
        }

        scanner.close();
    }
}

    

