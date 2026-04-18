import java.util.Scanner;

// Nama class ini harus sama dengan nama file: KalkulatorSederhana.java
public class KalkulatorSederhana {

    // Inner class untuk logika kalkulator (Enkapsulasi)
    static class Kalkulator {
        private final double angka1;
        private final double angka2;
        private final char operator;

        // Konstruktor
        public Kalkulator(double angka1, double angka2, char operator) {
            this.angka1 = angka1;
            this.angka2 = angka2;
            this.operator = operator;
        }

        public void tampilHasil() {
            double hasil = 0;
            boolean error = false;

            switch (operator) {
                case '+' -> hasil = angka1 + angka2;
                case '-' -> hasil = angka1 - angka2;
                case '*' -> hasil = angka1 * angka2;
                case '/' -> {
                    if (angka2 == 0) {
                        System.out.println("Error: pembagian dengan nol!");
                        hasil = 0;
                    } else {
                        hasil = angka1 / angka2;
                    }
                }
                default -> {
                    System.out.println("Operator tidak valid!");
                    error = true;
                }
            }

            if (!error) {
                System.out.printf("Hasil: %.2f %c %.2f = %.2f\n", angka1, operator, angka2, hasil);
            }
        }
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            char lagi;
            
            do {
                System.out.print("\nAngka 1  : ");
                double a1 = input.nextDouble();
                
                System.out.print("Angka 2  : ");
                double a2 = input.nextDouble();
                
                System.out.print("Operator : ");
                char op = input.next().charAt(0);
                
                Kalkulator kal = new Kalkulator(a1, a2, op);
                kal.tampilHasil();
                
                System.out.print("\nHitung lagi? (y/n): ");
                lagi = input.next().toLowerCase().charAt(0);
                
            } while (lagi == 'y');
            
            System.out.println("\nProgram selesai.");
        }
    }
}