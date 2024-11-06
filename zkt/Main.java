import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zakat zakat = new Zakat();

        System.out.print(" nama Anda sebagai donatur: ");
        String nmdonat = scanner.nextLine();
        penyalur penyalur = new penyalur(nmdonat);

        
        System.out.print(" nama penerima zakat: ");
        String namapenerima = scanner.nextLine();
        System.out.print(" alamat penerima zakat: ");
        String alamatpenerima = scanner.nextLine();
        penerima penerima = new penerima(namapenerima, alamatpenerima);

        int pilihan;
        do {
            System.out.println("\nKalkulator Zakat");
            System.out.println("1. Zakat Fitrah");
            System.out.println("2. Zakat Maal");
            System.out.println("3. Tampilkan Informasi Donatur dan penerima");
            System.out.println("4. Keluar");
            System.out.print("Pilih jenis zakat (1/2/3/4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah jiwa dalam keluarga: ");
                    int jumlahJiwa = scanner.nextInt();
                    double zakatFitrah = zakat.htzktfit(jumlahJiwa);
                    penyalur.setjmlzkt(zakatFitrah);
                    System.out.println("Zakat Fitrah yang harus dibayar: " + zakatFitrah + " kg beras.");
                    break;
                case 2:
                System.out.println("\nPilih jenis harta:");
                System.out.println("1. Uang Tunai");
                System.out.println("2. Emas");
                System.out.println("3. Properti");
                System.out.println("4. Barang dagangan");
                System.out.print("Pilih jenis harta (1/2/3): ");
                int jenisHarta = scanner.nextInt();

                double nilaiKekayaan;
                switch (jenisHarta) {
                    case 1:
                        System.out.print("Masukkan total uang tunai: ");
                        nilaiKekayaan = scanner.nextDouble();
                        break;
                    case 2:
                        System.out.print("Masukkan berat emas dalam gram: ");
                        double beratEmas = scanner.nextDouble();
                        double hargaPerGram = 1500000; 
                        nilaiKekayaan = beratEmas * hargaPerGram;
                        System.out.println("Nilai emas (dalam rupiah): " + nilaiKekayaan);
                        break;
                    case 3:
                        System.out.print("Masukkan nilai properti: ");
                        nilaiKekayaan = scanner.nextDouble();
                        break;
                    case 4:
                        System.out.print("Masukkan nilai barang dagangan: ");
                        nilaiKekayaan = scanner.nextDouble();
                        break;
                    default:
                        System.out.println("Jenis harta tidak valid.");
                        continue; // Kembali ke menu zakat maal
                }

                double zakatMaal = zakat.htzktmaal(nilaiKekayaan);
                penyalur.setjmlzkt(zakatMaal);
                System.out.println("Zakat Maal yang harus dibayar: " + zakatMaal);
                break;
                case 3:
                    
                    System.out.println("\nInformasi Donatur (penyalur):");
                    System.out.println("Nama: " + penyalur.getNama());
                    System.out.println("Jumlah Zakat yang Dibayar: " + penyalur.getjmlzkt());

                    System.out.println("\nInformasi penerima Zakat:");
                    System.out.println(penerima);
                    break;
                case 4:
                    System.out.println("Terima kasih:), " + penyalur.getNama() + ". Program selesai ;).");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
