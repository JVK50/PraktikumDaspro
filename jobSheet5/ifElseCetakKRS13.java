package PraktikumDaspro.jobSheet5;
import java.util.Scanner;
public class ifElseCetakKRS13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");

        System.out.println("Masukkan semester: ");
        int semester = sc.nextInt();

        if (semester < 9 ) {
            System.out.println("KRS semester " + semester + " ditampilkan");
        }
        else {
            System.out.println("Semester tidak valid");
        }
        sc.close();
    }
}
