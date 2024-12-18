public class MataKuliah {
    private String nama;
    private int sks;

    public MataKuliah(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString() {
        return String.format("Nama: %s | SKS: %d", nama, sks);
    }
}