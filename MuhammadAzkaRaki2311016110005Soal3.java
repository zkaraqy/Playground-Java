package uts;

import java.util.Scanner;

public class MuhammadAzkaRaki2311016110005Soal3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String operator;
        int bil1, bil2;
        double hasil;
        System.out.print("bilangan 1 : ");
        bil1 = input.nextInt();
        System.out.print("bilangan 2 : ");
        bil2 = input.nextInt();
        System.out.print("Operator yang ingin digunakan (+,-,*,/) : ");
        operator = input.nextLine();
        operator = input.nextLine();
        switch (operator) {
            case "+":
                hasil = bil1 + bil2;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                hasil = bil1 - bil2;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                hasil = bil1 * bil2;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                hasil = bil1 / bil2;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                break;
        }

    }
}
