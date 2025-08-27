package Daysatu;

import java.util.Scanner;

public class tol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Tol Balikpapan - Samarinda ===");
        System.out.println("Pilih gerbang masuk:");
        System.out.println("1. Manggar");
        System.out.println("2. Kilo 13");
        System.out.print("Masukkan pilihan: ");
        int gerbangMasuk = input.nextInt();

        System.out.println("\nPilih gerbang keluar:");
        System.out.println("1. Palaran");
        System.out.println("2. Mahkota");
        System.out.print("Masukkan pilihan: ");
        int gerbangKeluar = input.nextInt();

        int tarif = 0;
        String namaMasuk = "";
        String namaKeluar = "";

        switch (gerbangMasuk) {
            case 1:
                namaMasuk = "Manggar";
                switch (gerbangKeluar) {
                    case 1: tarif = 28000; namaKeluar = "Palaran"; break;
                    case 2: tarif = 35000; namaKeluar = "Mahkota"; break;
                    default:
                        System.out.println("Gerbang keluar tidak tersedia.");
                        return;
                }
                break;

            case 2:
                namaMasuk = "Kilo 13";
                switch (gerbangKeluar) {
                    case 1: tarif = 20000; namaKeluar = "Palaran"; break;
                    case 2: tarif = 25000; namaKeluar = "Mahkota"; break;
                    default:
                        System.out.println("Gerbang keluar tidak tersedia.");
                        return;
                }
                break;

            default:
                System.out.println("Gerbang masuk tidak tersedia.");
                return;
        }

        System.out.println("\n=== Rincian Perjalanan ===");
        System.out.println("Masuk dari : " + namaMasuk);
        System.out.println("Keluar di  : " + namaKeluar);
        System.out.println("Tarif      : Rp " + tarif);
    }
}
