package tokobuah;

import java.util.Scanner;

public class mainTokoBuah {
    public static void main(String[] args) {
        // Inisialisasi Data Produk (Nama, Harga, Stok)
        try (Scanner input = new Scanner(System.in)) {
            // Inisialisasi Data Produk (Nama, Harga, Stok)
            String[] produk = {"Apel", "Jeruk", "Mangga"};
            int[] harga = {15000, 12000, 20000};
            int[] stok = {10, 8, 5};
            
            int totalBayar = 0;
            int pilihan;
            
            // Perulangan belanja
            do {
                System.out.println();
                // Menampilkan daftar buah secara dinamis dari array
                for (int i = 0; i < produk.length; i++) {
                    System.out.println((i + 1) + ". " + produk[i] + "\t Rp " +
                            String.format("%,d", harga[i]) +
                            " (stok:" + stok[i] + " kg)");
                }
                
                System.out.print("\nPilih (0=stop): ");
                pilihan = input.nextInt();
                
                // Berhenti jika input 0
                if (pilihan == 0) {
                    break;
                }
                
                // Validasi input pilihan (harus 1-3)
                if (pilihan >= 1 && pilihan <= produk.length) {
                    int indeks = pilihan - 1; // Konversi ke indeks array (mulai dari 0)
                    
                    System.out.print("Jumlah(kg): ");
                    int jumlah = input.nextInt();
                    
                    // Logika pengecekan stok
                    if (jumlah <= stok[indeks]) {
                        int subTotal = jumlah * harga[indeks];
                        stok[indeks] -= jumlah; // Mengurangi stok yang ada
                        totalBayar += subTotal; // Menambahkan ke total belanja
                        System.out.println("OK +Rp" + subTotal);
                    } else {
                        // Pesan jika input melebihi stok (seperti di gambar)
                        System.out.println("Stok tidak cukup!");
                    }
                } else {
                    System.out.println("Pilihan tidak valid!");
                }
                
            } while (pilihan != 0);
            
            // Menampilkan hasil akhir belanja
            System.out.println("\nTotal: Rp" + totalBayar);
        }
    }
}