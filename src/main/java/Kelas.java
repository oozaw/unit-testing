public class Kelas {
    private String nama;
    private WaliKelas waliKelas;

    public Kelas() {
    }

    public Kelas(String nama, WaliKelas waliKelas) {
        this.nama = nama;
        this.waliKelas = waliKelas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setWaliKelas(WaliKelas waliKelas) {
        this.waliKelas = waliKelas;
    }

    public String getDetailWaliKelas() {
        return waliKelas.detailWk();
    }
}