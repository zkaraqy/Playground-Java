package playground;

import java.util.Scanner;

public class programMenghitungLuasSegitiga {
    
    static double scannerTypeDouble() {
        Scanner sc = new Scanner(System.in);
        double nilai = sc.nextDouble();
        return nilai;
    }

    public static void main(String args[]) {
        System.out.println("Program Menghitung Luas Segitiga");
        for (int i = 0; i < 33; i++) {
            System.out.print("*");
        }
        System.out.print("\n");

        System.out.print("Panjang alas(cm) : ");
        double a = scannerTypeDouble();
        System.out.print("Tinggi(cm) : ");
        double t = scannerTypeDouble();

        for (int i = 0; i < 33; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        
        double L = 0.5 * a * t;
        System.out.println("L = 1/2 * " + a + " * " + t + " = " + L + "cm^2");
    }
}
