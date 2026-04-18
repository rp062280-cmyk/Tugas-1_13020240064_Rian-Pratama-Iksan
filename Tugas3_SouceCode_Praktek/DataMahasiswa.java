package datamahasiswa;

import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        // Input Data
        try (Scanner input = new Scanner(System.in)) {
            // Input Data
            System.out.print("Nama     : ");
            String nama = input.nextLine();
            
            System.out.print("NIM      : ");
            String nim = input.nextLine();
            
            System.out.print("Jml MK   : ");
            int jmlMK = input.nextInt();
            
            // Array untuk menyimpan nilai berdasarkan jumlah MK
            double[] nilaiMK = new double[jmlMK];
            double totalNilai = 0;
            
            for (int i = 0; i < jmlMK; i++) {
                System.out.print("Nilai MK-" + (i + 1) + ": ");
                nilaiMK[i] = input.nextDouble();
                totalNilai += nilaiMK[i];
            }
            
            // Perhitungan Rata-rata
            double rataRata = totalNilai / jmlMK;
            
            // Penentuan Grade
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
            
            // Penentuan Status Lulus
            boolean lulus = rataRata >= 65;
            
            // Output Rapor sesuai format gambar
            System.out.println("\n=== RAPOR ===");
            System.out.println("Nama   : " + nama);
            System.out.println("NIM    : " + nim);
            System.out.println("Nilai:");
            
            for (int i = 0; i < jmlMK; i++) {
                System.out.println("  MK-" + (i + 1) + " : " + (int)nilaiMK[i]);
            }
            
            System.out.printf("Rata   : %.2f\n", rataRata);
            System.out.println("Grade  : " + grade);
            System.out.println("Lulus  : " + lulus);
        }
    }
}