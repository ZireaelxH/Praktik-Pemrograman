import java.util.Scanner;

public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        Siakad siakad = new Siakad();
        int menu = 0;
        while (menu != 9) {
            menu = menuAwal();
            if (menu == 1) {
                siakad.lihatData();
            } else if (menu == 2) {
                siakad.tambahData();
            } else if (menu == 3) {
                siakad.cariData();
            } else if (menu == 4) {
                siakad.ratarataIPK();
            } else if (menu == 5) {
                siakad.editData();
            } else if (menu == 6) {
                siakad.hapusData();
            }
        }
    }

    private static int menuAwal() {
        Scanner console = new Scanner(System.in);
        System.out.println("SIAKAD UNY");
        System.out.println("Menu Utama :");
        System.out.println("1. Lihat Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Rerata IPK");
        System.out.println("5. Edit Data");
        System.out.println("6. Hapus Data");
        System.out.println("9. Keluar");
        System.out.print("Pilih menu = ");
        int menu = console.nextInt();
        return menu;
    }

    private void lihatData() {
        if (jumlahData == 0) {
            System.out.println("Data masih kosong, belum ada data. Mohon tambah data terlebih dahulu");
        } else {
            System.out.println("Berikut adalah data mahasiswa yang telah terdata :");
            for (int i = 0; i < jumlahData; i++) {
                mahasiswa[i].getDetailMahasiswa();
            }
        }
    }

    private void tambahData() {
        Scanner console = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa = ");
        String NIM = console.nextLine();
        System.out.print("Masukan Nama Lengkap Mahasiswa = ");
        String NamaLengkap = console.nextLine();
        double ipkMahasiswa = 0;
        int Semester = 0;
        double tinggi = 0;
        double berat = 0;
        try {
            System.out.print("Masukan IPK Mahasiswa = ");
            ipkMahasiswa = console.nextDouble();
            System.out.print("Masukan Jumlah Semester yang telah ditempuh Mahasiswa = ");
            Semester = console.nextInt();
            System.out.print("Masukan Tinggi Badan Mahasiswa = ");
            tinggi = console.nextDouble();
            System.out.print("Masukan Berat Badan Mahasiswa = ");
            berat = console.nextDouble();
        } catch (Exception e) {
            System.out.println("Masukkan bilangan desimal dengan menggunakan tanda titik. Silahkan edit data Anda setelah ini.");
        }
        Mahasiswa inputMahasiswa = new Mahasiswa(NIM, NamaLengkap, ipkMahasiswa, Semester);
        inputMahasiswa.setTinggiBadan(tinggi);
        inputMahasiswa.setBeratBadan(berat);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
        lihatData();
    }

    public void cariData() {
        Scanner console = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa yang dicari = ");
        String NIM = console.nextLine();
        int index = getIndexByNIM(NIM);
        if (index == -100) {
            System.out.println("NIM yang anda cari tidak ditemukan");
        } else {
            mahasiswa[index].getDetailMahasiswa();
        }
    }

    public int getIndexByNIM(String NIM) {
        for (int i = 0; i < jumlahData; i++) {
            if (mahasiswa[i].getNimMahasiswa().equals(NIM)) {
                return i;
            }
        }
        return -100;
    }

    public void editData() {
        Scanner console = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa yang akan diedit = ");
        String NIM = console.nextLine();
        int index = getIndexByNIM(NIM);
        if (index == -100) {
            System.out.println("NIM Mahasiswa yang akan diedit tidak ditemukan");
        } else {
            mahasiswa[index].getDetailMahasiswa();
            System.out.print("Masukkan nama Mahasiswa yang baru = ");
            String NamaLengkap = console.nextLine();
            mahasiswa[index].setNamaMahasiswa(NamaLengkap);
            System.out.print("Masukkan IPK Mahasiswa yang baru = ");
            double ipkMahasiswa = console.nextDouble();
            mahasiswa[index].setIPK(ipkMahasiswa);
            System.out.print("Masukkan jumlah semester Mahasiswa yang baru = ");
            int Semester = console.nextInt();
            mahasiswa[index].setSemesterMahasiswa(Semester);
            System.out.print("Masukkan tinggi badan Mahasiswa yang baru = ");
            double tinggiBadan = console.nextDouble();
            mahasiswa[index].setTinggiBadan(tinggiBadan);
            System.out.print("Masukkan berat badan Mahasiswa yang baru = ");
            double beratBadan = console.nextDouble();
            mahasiswa[index].setBeratBadan(beratBadan);
            mahasiswa[index].getDetailMahasiswa();
        }
    }

    public void hapusData() {
        Scanner console = new Scanner(System.in);
        System.out.print("Masukkan NIM dari data Mahasiswa yang akan dihapus = ");
        String NIM = console.nextLine();
        int index = getIndexByNIM(NIM);
        if (index == -100) {
            System.out.println("Data yang akan dihapus tidak ditemukan");
        } else {
            for (int i = index; i < jumlahData; i++) {
                mahasiswa[i] = mahasiswa[i + 1];
            }
            jumlahData--;
            lihatData();
        }
    }

    public void ratarataIPK() {
        double totalNilai = 0.0;
        for (int i = 0; i < jumlahData; i++) {
            totalNilai += mahasiswa[i].getIPK();
        }

        double rataRata = totalNilai / jumlahData;
        System.out.println("Rata-rata IPK Mahasiswa = " + rataRata);
    }
}
