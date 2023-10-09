package uts;

import java.util.Scanner;

public class MuhammadAzkaRaki2311016110005Soal4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String nama1, nama2, nama3, NIM1, NIM2, NIM3, status1, status2, status3;
        double nilaiBahasaMhs1, nilaiPancasilaMhs1, nilaiMtkMhs1, nilaiBahasaMhs2, nilaiPancasilaMhs2, nilaiMtkMhs2, nilaiBahasaMhs3, nilaiPancasilaMhs3, nilaiMtkMhs3, rata_rata1, rata_rata2, rata_rata3;

        System.out.println("=======================");
        System.out.println("Input Nilai");
        System.out.println("=======================");
        System.out.print("Nama            : ");
        nama1 = input.nextLine();
        System.out.print("NIM             : ");
        NIM1 = input.nextLine();
        System.out.print("Nilai Bahasa    : ");
        nilaiBahasaMhs1 = input.nextDouble();
        System.out.print("Nilai Pancasila : ");
        nilaiPancasilaMhs1 = input.nextDouble();
        System.out.print("Nilai Matematika: ");
        nilaiMtkMhs1 = input.nextDouble();
        System.out.println("=======================");
        rata_rata1 = (nilaiBahasaMhs1 + nilaiMtkMhs1 + nilaiPancasilaMhs1) / 3;
        status1 = (rata_rata1 > 50 && nilaiPancasilaMhs1 > 50) ? "LULUS" : "TIDAK LULUS";
        System.out.println("Rata-Rata     : " + rata_rata1);
        System.out.println("Status        : " + status1);

        System.out.println("");
        System.out.println("=======================");
        System.out.println("Input Nilai");
        System.out.println("=======================");
        System.out.print("Nama            : ");
        nama2 = input.nextLine();
        nama2 = input.nextLine();
        System.out.print("NIM             : ");
        NIM2 = input.nextLine();
        System.out.print("Nilai Bahasa    : ");
        nilaiBahasaMhs2 = input.nextDouble();
        System.out.print("Nilai Pancasila : ");
        nilaiPancasilaMhs2 = input.nextDouble();
        System.out.print("Nilai Matematika: ");
        nilaiMtkMhs2 = input.nextDouble();
        System.out.println("=======================");
        rata_rata2 = (nilaiBahasaMhs2 + nilaiMtkMhs2 + nilaiPancasilaMhs2) / 3;
        status2 = (rata_rata2 > 50 && nilaiPancasilaMhs2 > 50) ? "LULUS" : "TIDAK LULUS";
        System.out.println("Rata-Rata     : " + rata_rata2);
        System.out.println("Status        : " + status2);

        System.out.println("");
        System.out.println("=======================");
        System.out.println("Input Nilai");
        System.out.println("=======================");
        System.out.print("Nama            : ");
        nama3 = input.nextLine();
        nama3 = input.nextLine();
        System.out.print("NIM             : ");
        NIM3 = input.nextLine();
        System.out.print("Nilai Bahasa    : ");
        nilaiBahasaMhs3 = input.nextDouble();
        System.out.print("Nilai Pancasila : ");
        nilaiPancasilaMhs3 = input.nextDouble();
        System.out.print("Nilai Matematika: ");
        nilaiMtkMhs3 = input.nextDouble();
        System.out.println("=======================");
        rata_rata3 = (nilaiBahasaMhs3 + nilaiMtkMhs3 + nilaiPancasilaMhs3) / 3;
        status3 = (rata_rata3 > 50 && nilaiPancasilaMhs3 > 50) ? "LULUS" : "TIDAK LULUS";
        System.out.println("Rata-Rata     : " + rata_rata3);
        System.out.println("Status        : " + status3);

        System.out.println("");
        System.out.println("=============================================================================");
        System.out.println("Nama" + "\t" + "NIM" + "\t" + "Rata-rata" + "\t" + "Status");
        System.out.println("=============================================================================");
        System.out.println(nama1 + "\t" + NIM1 + "\t" + rata_rata1 + "\t\t" + status1);
        System.out.println(nama2 + "\t" + NIM2 + "\t" + rata_rata2 + "\t\t" + status2);
        System.out.println(nama3 + "\t" + NIM3 + "\t" + rata_rata3 + "\t\t" + status3);
        System.out.println("=============================================================================");

    }
}
