import java.util.Scanner;

public class Tugas8 {
    public static void main(String[] args) {
        String[] nama = new String[1000];
        double[] ipk = new double[1000];
        String[] sentinel = {"exit", "Exit"};
        int i;
        double total= 0;

        for (i = 1; i<1000; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Data " + i);
            System.out.print("Nama Mahasiswa = ");
            String inputNama = scan.nextLine();
            if (inputNama.equals(sentinel[0]) || (inputNama.equals(sentinel[1]))) {
                break;
            } else {
                nama[i] = inputNama;
            }
            System.out.print("IPK Mahasiswa = ");
            double ipkMhs = scan.nextDouble();
            ipk[i] = ipkMhs;
            System.out.println();
            total = total + ipk[i];
        }

        System.out.println("No"+"\t"+"Nama"+"\t\t\t\t"+"IPK");
        System.out.println("---------------------------------------------------");
        for (int j = 1; j < i; j++) {
            System.out.println(j + "\t" + nama[j] + "\t\t" + ipk[j]);
        }
        System.out.println("---------------------------------------------------");

        System.out.println("\t"+ "Rata-rata IPK " + "\t\t\t" + total / (i - 1));
    }
}