package PraktikumDaspro.jobSheet5;

import java.util.Scanner;

public class wifiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cek Akses ---");
        System.out.println("mahasiswa atau dosen?: ");
        String status = sc.nextLine();

        if (status.equalsIgnoreCase("mahasiswa")) {
            System.out.println("Masukkan jumlah SKS yang diambil: ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Akses diterima");
            } else {
                System.out.println("Akses ditolak");
            }
        } else if (status.equalsIgnoreCase("dosen")) {
            System.out.println("Akses diterima");
        } else {
            System.out.println("Akses ditolak");
        }
        sc.close();
    }
}
