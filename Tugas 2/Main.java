import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MataKuliahManager manager = new MataKuliahManager();
        int pilihan;

        do {
            System.out.println("\n=========================");
            System.out.println("=== Menu Mata Kuliah ===");
            System.out.println("=========================");
            System.out.println("1. Tambah Mata Kuliah");
            System.out.println("2. Tampilkan Mata Kuliah");
            System.out.println("3. Hapus Mata Kuliah");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Input harus berupa angka!");
                System.out.print("Pilih opsi: ");
                scanner.next();
            }
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mata Kuliah: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan SKS: ");
                    int sks;
                    while (!scanner.hasNextInt()) {
                        System.out.println("SKS harus berupa angka!");
                        System.out.print("Masukkan SKS: ");
                        scanner.next();
                    }
                    sks = scanner.nextInt();
                    scanner.nextLine();
                    manager.tambahMataKuliah(new MataKuliah(nama, sks));
                    System.out.println("Mata kuliah berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("\nDaftar Mata Kuliah:");
                    if (manager.getDaftarMataKuliah().isEmpty()) {
                        System.out.println("Tidak ada mata kuliah yang terdaftar.");
                    } else {
                        manager.tampilkanMataKuliah();
                    }
                    break;
                case 3:
                    System.out.print("Masukkan Nama Mata Kuliah yang ingin dihapus: ");
                    String namaHapus = scanner.nextLine();
                    if (manager.hapusMataKuliah(namaHapus)) {
                        System.out.println("Mata kuliah berhasil dihapus!");
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mata Kuliah yang ingin dicari: ");
                    String namaCari = scanner.nextLine();
                    MataKuliah mataKuliahDitemukan = manager.cariMataKuliah(namaCari);
                    if (mataKuliahDitemukan != null) {
                        System.out.println("Mata Kuliah Ditemukan: " + mataKuliahDitemukan);
                    } else {
                        System.out.println("Mata Kuliah tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}