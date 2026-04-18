package tokobuah;

import java.util.Scanner;

public class TokoBuah {
    public static void main(String[] args) {
        // Data Buah: Nama, Harga, dan Stok
        try (Scanner input = new Scanner(System.in)) {
            // Data Buah: Nama, Harga, dan Stok
            String[] namaBuah = {"Apel", "Jeruk", "Mangga"};
            int[] hargaBuah = {15000, 12000, 20000};
            int[] stokBuah = {10, 8, 5};
            
            int totalBelanja = 0;
            int pilihan;
            
            // Loop Program Belanja
            do {
                // Menampilkan Daftar Menu
                System.out.println();
                for (int i = 0; i < namaBuah.length; i++) {
                    System.out.printf("%d. %-7s Rp %,d (stok:%d kg)\n",
                            (i + 1), namaBuah[i], hargaBuah[i], stokBuah[i]);
                }
                
                System.out.print("\nPilih (0=stop): ");
                pilihan = input.nextInt();
                
                // Jika pilih 0, loop berhenti
                if (pilihan == 0) {
                    break;
                }
                
                // Validasi pilihan buah
                if (pilihan > 0 && pilihan <= namaBuah.length) {
                    int indeks = pilihan - 1; // Array mulai dari 0
                    
                    System.out.print("Jumlah(kg): ");
                    int jumlahBeli = input.nextInt();
                    
                    // Cek ketersediaan stok
                    if (jumlahBeli <= stokBuah[indeks]) {
                        int subTotal = jumlahBeli * hargaBuah[indeks];
                        stokBuah[indeks] -= jumlahBeli; // Kurangi stok
                        totalBelanja += subTotal;       // Tambah ke total
                        System.out.println("OK +Rp" + subTotal);
                    } else {
                        System.out.println("Stok tidak cukup!");
                    }
                } else {
                    System.out.println("Pilihan tidak tersedia!");
                }
                
            } while (pilihan != 0);
            
            // Output Akhir
            System.out.println("\nTotal: Rp" + totalBelanja);
        }
    }
}