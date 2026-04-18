package datamahasiswa;

import java.util.Scanner;

public class mainDataMahasiswa {
    public static void main(String[] args) {
        // Bagian Input Data
        try (Scanner input = new Scanner(System.in)) {
            // Bagian Input Data
            System.out.print("Nama     : ");
            String nama = input.nextLine();
            
            System.out.print("NIM      : ");
            String nim = input.nextLine();
            
            System.out.print("Jml MK   : ");
            int jmlMK = input.nextInt();
            
            // Inisialisasi array untuk menyimpan nilai
            double[] daftarNilai = new double[jmlMK];
            double total = 0;
            
            // Loop untuk mengambil input nilai tiap Mata Kuliah
            for (int i = 0; i < jmlMK; i++) {
                System.out.print("Nilai MK-" + (i + 1) + ": ");
                daftarNilai[i] = input.nextDouble();
                total += daftarNilai[i]; // Menjumlahkan total nilai
            }
            
            // Proses Logika (Rata-rata, Grade, dan Kelulusan)
            double rataRata = total / jmlMK;
            
            char grade;
            if (rataRata >= 85) {
                grade = 'A';
            } else if (rataRata >= 75) {
                grade = 'B';
            } else if (rataRata >= 65) {
                grade = 'C';
            } else if (rataRata >= 50) {
                grade = 'D';
            } else {
                grade = 'E';
            }
            
            boolean lulus = (rataRata >= 65);
            
            // Terminal Output Rapor (Sesuai Gambar Studi Kasus 2)
            System.out.println("\n=== RAPOR ===");
            System.out.println("Nama   : " + nama);
            System.out.println("NIM    : " + nim);
            System.out.println("Nilai:");
            
            for (int i = 0; i < jmlMK; i++) {
                // (int) digunakan agar tampilan nilai bulat seperti di gambar (contoh: 85 bukan 85.0)
                System.out.println("  MK-" + (i + 1) + " : " + (int)daftarNilai[i]);
            }
            
            System.out.printf("Rata   : %.2f\n", rataRata);
            System.out.println("Grade  : " + grade);
            System.out.println("Lulus  : " + lulus);
        }
    }
}