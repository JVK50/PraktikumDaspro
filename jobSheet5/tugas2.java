package PraktikumDaspro.jobSheet5;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int numb = sc.nextInt();

        if (numb % 2 == 0) {
            System.out.println("Angka " + numb + " adalah bilangan genap");
        } else {
            System.out.println("Angka " + numb + " adalah bilangan ganjil");
        }
        sc.close();
    }
}
