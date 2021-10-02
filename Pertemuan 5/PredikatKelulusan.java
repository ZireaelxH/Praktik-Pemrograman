import java.util.Scanner;

public class PredikatKelulusan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan IPK Anda = ");
        double ipk = scanner.nextDouble();
        System.out.print("Masukkan Lama Studi Anda = ");
        double lamaStudi = scanner.nextDouble();
        if (ipk >= 3.51 && ipk <= 4 && lamaStudi <= 4) {
            System.out.println("Selamat, Anda mendapatkan predikat Summa Cumlaude");
        } else if (ipk >= 3.51 && ipk <= 4 && lamaStudi > 4) {
            System.out.println("Selamat, Anda mendapatkan predikat Cumlaude");
        } else if (ipk >= 3.01 && ipk < 3.51) {
            System.out.println("Anda mendapatkan predikat Sangat Memuaskan");
        } else if (ipk >= 2.76 && ipk < 3.01) {
            System.out.println("Anda mendapatkan predikat Memuaskan");
        } else if (ipk >= 2.00 && ipk < 2.76) {
            System.out.println("Anda mendapatkan predikat Cukup");
        } else if (ipk < 2.00 && ipk >= 0) {
            System.out.println("Anda dinyatakan Tidak Lulus");
        } else {
            System.out.println("Predikat Anda tidak valid");
        }
    }
}