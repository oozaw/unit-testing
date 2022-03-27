public class WaliKelas {
    private String nama;
    private Kelas kelas = new Kelas();

    public WaliKelas () {

    }

    public WaliKelas(String nama) {
        this.nama = nama;
    }

    public WaliKelas(String nama, Kelas kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String detailWk() {
        return "Nama: " + this.nama + "\nKelas: " + this.kelas.getNama();
    }

    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
    }

    public String getNamaKelas() {
        return kelas.getNama();
    }
}
