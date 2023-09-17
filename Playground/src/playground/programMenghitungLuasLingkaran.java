
// File playground ini sebagai proyek kecil-kecilan

package playground;

import java.util.Scanner;

public class programMenghitungLuasLingkaran {

    static void hitungLuasLingkaran() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program menghitung luas lingkaran");

        System.out.println("*********************************");

        System.out.print("Masukkan jari-jari(cm) : ");
        double input = sc.nextDouble();
        double Phi = Math.PI;
        double hasil = Math.PI * input * input;

        System.out.println("Rumus : Phi * r^2");
        System.out.println("=> " + Phi + " * " + input + "^2 = " + hasil);
    }

    static void ulangKah() {
        boolean repeat = true;
        while (repeat) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ulang? (Y/N)\n=> ");
            String askForRepeat = sc.nextLine();
            askForRepeat = askForRepeat.toUpperCase();
            switch (askForRepeat) {
                case "Y":
                    hitungLuasLingkaran();
                    break;
                case "N":
                    repeat = false;
                    break;
                default:
                    System.out.println("INVALID");
                    System.out.println("Program dihentikan");
                    repeat = false;
            }
        }
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        hitungLuasLingkaran();
        ulangKah();
    }
}