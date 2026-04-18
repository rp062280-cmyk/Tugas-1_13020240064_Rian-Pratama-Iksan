package kalkulatorsederhana;

import java.util.Scanner;

public class mainKalkulator {
    public static void main(String[] args) {
        try ( // Inisialisasi Scanner untuk menerima input dari Tuan Muda
                Scanner input = new Scanner(System.in)) {
            char lagi;
            
            // Blok do-while untuk mengulang program sesuai keinginan user
            do {
                System.out.println("--- Input Perhitungan ---");
                
                System.out.print("Angka 1  : ");
                double a1 = input.nextDouble();
                
                System.out.print("Angka 2  : ");
                double a2 = input.nextDouble();
                
                System.out.print("Operator : ");
                char op = input.next().charAt(0);
                
                // Memanggil class Kalkulator (sesuai kodingan sebelumnya)
                Kalkulator kal = new Kalkulator(a1, a2, op);
                
                // Menampilkan hasil ke terminal
                System.out.print("Terminal Output:\n");
                kal.tampilHasil();
                
                // Validasi untuk mengulang
                System.out.print("\nHitung lagi? (y/n): ");
                lagi = input.next().toLowerCase().charAt(0);
                
            } while (lagi == 'y'); // Program mengulang jika input adalah 'y'
            
            System.out.println("\nProgram selesai. Sampai jumpa kembali, Tuan Muda.");
        }
    }
}