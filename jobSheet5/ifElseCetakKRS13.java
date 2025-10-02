package PraktikumDaspro.jobSheet5;
import java.util.Scanner;
public class ifElseCetakKRS13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (Ya/Tidak): ");
        boolean uktLunas = sc.nextBoolean();
        String ukt = uktLunas ? "Pembayaran UKT sudah lunas" : "registrasi ditolak";
        System.out.println(ukt);
        sc.close();
    }
}
