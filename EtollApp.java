package Daysatu;

import java.util.Scanner;

class KartuDigital {
    private int saldo;

    public KartuDigital(int saldoAwal) {
        saldo = saldoAwal;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean tapIn() {
        int biaya = 3000;
        if (saldo >= 10000) {
            saldo -= biaya;
            System.out.println("Tap in berhasil. Saldo terpotong Rp" + biaya);
            return true;
        } else {
            System.out.println("Tap in gagal. Saldo kurang dari Rp10.000, silahkan isi saldo terlebih dahulu.");
            return false;
        }
    }

    public void isiSaldo(int nominal) {
        if (nominal > 0) {
            saldo += nominal;
            System.out.println("Isi saldo berhasil. Saldo bertambah Rp" + nominal);
        } else {
            System.out.println("Nominal isi saldo tidak valid.");
        }
    }
}

public class EtollApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        KartuDigital kartu = new KartuDigital(5000);

        int pilihan;
        do {
            System.out.println("\n=== MENU E-TOLL ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tap In");
            System.out.println("3. Isi Saldo");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo saat ini: Rp" + kartu.getSaldo());
                    break;
                case 2:
                    
                    boolean sukses = kartu.tapIn();
                    if (!sukses) {
                        System.out.print("Masukkan nominal isi saldo: ");
                        int nominal = scanner.nextInt();
                        kartu.isiSaldo(nominal);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nominal isi saldo: ");
                    int nominal = scanner.nextInt();
                    kartu.isiSaldo(nominal);
                    break;
                case 4:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
