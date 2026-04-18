package konversiwaktu;

import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Total detik: ");
            long totalDetik = input.nextLong();
            
            // Logika konversi
            // 1. Detik saat ini adalah sisa bagi dari 60
            long detikSaatIni = totalDetik % 60;
            
            // 2. Total menit adalah total detik dibagi 60
            long totalMenit = totalDetik / 60;
            
            // 3. Menit saat ini adalah sisa bagi total menit dari 60
            long menitSaatIni = totalMenit % 60;
            
            // 4. Total jam adalah total menit dibagi 60
            long totalJam = totalMenit / 60;
            
            // 5. Jam saat ini adalah sisa bagi total jam dari 24 (agar format 24 jam)
            long jamSaatIni = totalJam % 24;
            
            // Output Pertama sesuai gambar
            System.out.println("================");
            System.out.printf("Waktu: %02d:%02d:%02d\n", jamSaatIni, menitSaatIni, detikSaatIni);
            System.out.println("================");
            
            // Output Detail
            System.out.println("\nTotal Detik   : " + totalDetik);
            System.out.println("detikSaat ini : " + detikSaatIni);
            System.out.println("menitSaat ini : " + menitSaatIni);
            System.out.println("jamSaat ini   : " + jamSaatIni);
            
            // Contoh Logika Tambahan untuk "Tepat 1 Hari"
            if (totalDetik == 86400) {
                System.out.println("\nInput  : 86400");
                System.out.println("Output : 00:00:00 (tepat 1 hari)");
            }
        }
    }
}