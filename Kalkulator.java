import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;

        do {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            System.out.print("Masukkan Kelas: ");
            String kelas = input.nextLine();

            System.out.println("\n-- Informasi Pengguna --");
            System.out.println("Nama  : " + nama);
            System.out.println("NIM   : " + nim);
            System.out.println("Kelas : " + kelas);

            System.out.println("\nPilih jenis zakat yang ingin dihitung:");
            System.out.println("1. Zakat Fitrah");
            System.out.println("2. Zakat Maal");
            System.out.println("3. Zakat Profesi");
            System.out.println("4. Zakat Ternak");
            System.out.print("Masukkan pilihan (1-4): ");
            int jenisZakat = input.nextInt();

            if (jenisZakat == 1) {
                System.out.println("Zakat Fitrah adalah 2.5 kg beras atau setara uang.");
                System.out.println("Kewajiban zakat fitrah untuk setiap orang.");
            } else if (jenisZakat == 2) {
                System.out.print("Masukkan jumlah harta : ");
                double harta = input.nextDouble();

                double hargaEmas = 965000;
                double nisabMaal = 85 * hargaEmas;
                if (harta >= nisabMaal) {
                    double zakatMaal = harta * 2.5 / 100;
                    System.out.printf("Jumlah zakat maal yang harus dibayarkan adalah: %.2f%n", zakatMaal);
                } else {
                    System.out.println("Harta belum mencapai nisab, zakat maal tidak wajib.");
                }

            } else if (jenisZakat == 3) {
                System.out.print("Masukkan penghasilan bulanan : ");
                double penghasilan = input.nextDouble();

                double hargaBeras = 10000;
                double nisabProfesi = 520 * hargaBeras;
                if (penghasilan >= nisabProfesi) {
                    double zakatProfesi = penghasilan * 2.5 / 100;
                    System.out.printf("Jumlah zakat profesi yang harus dibayarkan adalah: %.2f%n", zakatProfesi);
                } else {
                    System.out.println("Penghasilan belum mencapai nisab, zakat profesi tidak wajib.");
                }

            } else if (jenisZakat == 4) {
                System.out.println("Pilih jenis ternak:");
                System.out.println("1. Kambing");
                System.out.println("2. Sapi");
                System.out.print("Masukkan pilihan (1-2): ");
                int jenisTernak = input.nextInt();

                int jumlahTernak;
                if (jenisTernak == 1) {
                    System.out.print("Masukkan jumlah kambing: ");
                    jumlahTernak = input.nextInt();

                    if (jumlahTernak >= 40) {
                        System.out.println("Zakat kambing wajib dikeluarkan 1 ekor kambing.");
                    } else {
                        System.out.println("Jumlah kambing belum mencapai nisab, zakat tidak wajib.");
                    }
                } else if (jenisTernak == 2) {
                    System.out.print("Masukkan jumlah sapi: ");
                    jumlahTernak = input.nextInt();

                    if (jumlahTernak >= 30) {
                        System.out.println("Zakat sapi wajib dikeluarkan 1 ekor sapi.");
                    } else {
                        System.out.println("Jumlah sapi belum mencapai nisab, zakat tidak wajib.");
                    }
                } else {
                    System.out.println("Pilihan ternak tidak valid.");
                }
            } else {
                System.out.println("Pilihan zakat tidak valid.");
            }

            input.nextLine();

            System.out.print("\nApakah Anda ingin menghitung zakat lagi? (ya/tidak): ");
            pilihan = input.nextLine();

            while (!pilihan.equalsIgnoreCase("ya") && !pilihan.equalsIgnoreCase("tidak")) {
                System.out.print("Input tidak valid. Masukkan 'ya' atau 'tidak': ");
                pilihan = input.nextLine();
            }

        } while (pilihan.equalsIgnoreCase("ya"));

        System.out.println("Program selesai.");
        input.close();
    }
}
