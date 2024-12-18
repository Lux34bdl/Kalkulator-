import java.util.ArrayList;
import java.util.List;

public class MataKuliahManager {
    private List<MataKuliah> daftarMataKuliah;

    public MataKuliahManager() {
        daftarMataKuliah = new ArrayList<>();
    }

    public void tambahMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    public void tampilkanMataKuliah() {
        for (MataKuliah mataKuliah : daftarMataKuliah) {
            System.out.println(mataKuliah);
        }
    }

    public boolean hapusMataKuliah(String nama) {
        return daftarMataKuliah.removeIf(mataKuliah -> mataKuliah.getNama().equalsIgnoreCase(nama));
    }

    public MataKuliah cariMataKuliah(String nama) {
        for (MataKuliah mataKuliah : daftarMataKuliah) {
            if (mataKuliah.getNama().equalsIgnoreCase(nama)) {
                return mataKuliah;
            }
        }
        return null;
    }

    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }
}
