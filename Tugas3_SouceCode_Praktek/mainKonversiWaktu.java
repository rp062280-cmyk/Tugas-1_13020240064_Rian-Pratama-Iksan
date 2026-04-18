package konversiwaktu;

import java.util.Scanner;

public class mainKonversiWaktu {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Total detik: ");
            // Menggunakan long karena input di gambar cukup besar (miliaran)
            long totalDetik = input.nextLong();
            
            // Logika Matematika Konversi Waktu
            long detikSaatIni = totalDetik % 60;
            long totalMenit  = totalDetik / 60;
            long menitSaatIni = totalMenit % 60;
            long totalJam    = totalMenit / 60;
            long jamSaatIni   = totalJam % 24;
            
            // Output Bagian Atas
            System.out.println("==================");
            // %02d artinya angka akan ditampilkan 2 digit (misal: 1 jadi 01)
            System.out.printf("Waktu: %02d:%02d:%02d\n", jamSaatIni, menitSaatIni, detikSaatIni);
            System.out.println("==================");
            
            // Output Rincian
            System.out.println("\nTotal Detik   : " + totalDetik);
            System.out.println("detikSaat ini : " + detikSaatIni);
            System.out.println("menitSaat ini : " + menitSaatIni);
            System.out.println("jamSaat ini   : " + jamSaatIni);
            
            // Contoh Logika Khusus (Seperti di gambar "Tepat 1 Hari")
            if (totalDetik == 86400) {
                System.out.println("\n(tepat 1 hari)");
            }
        }
    }
}