public class Mahasiswa extends Manusia {
    private String NIM;
    private String NamaLengkap;
    private double ipkMahasiswa;
    private int Semester;

    public Mahasiswa(String NIM, String NamaLengkap, double ipkMahasiswa, int Semester) {
        this.NIM = NIM;
        this.NamaLengkap = NamaLengkap;
        this.ipkMahasiswa = ipkMahasiswa;
        this.Semester = Semester;
    }

    public void setNimMahasiswa(String NIM) {
        this.NIM = NIM;
    }

    public String getNimMahasiswa() {
        return this.NIM;
    }

    public void setNamaMahasiswa(String NamaLengkap) {
        this.NamaLengkap = NamaLengkap;
    }

    public String getNamaMahasiswa() {
        return this.NamaLengkap;
    }

    public void setIPK(double ipkMahasiswa) {
        this.ipkMahasiswa = ipkMahasiswa;
    }

    public double getIPK() {
        return this.ipkMahasiswa;
    }

    public void setSemesterMahasiswa(int Semester) {
        this.Semester = Semester;
    }

    public int getSemesterMahasiswa() {
        return this.Semester;
    }

    public void getDetailMahasiswa() {
        System.out.printf("%10s %20s %10s %10s %20s %20s", "NIM", "NAMA", "IPK", "SEMESTER", "TINGGI BADAN", "BERAT BADAN");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %20s %10s %10s %20s %20s", this.NIM, this.NamaLengkap.toUpperCase(), String.valueOf(this.ipkMahasiswa), String.valueOf(this.Semester), String.valueOf(this.tinggiBadan), String.valueOf(this.beratBadan));
        System.out.println();
    }
}
