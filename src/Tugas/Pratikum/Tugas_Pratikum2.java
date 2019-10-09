package Tugas.Pratikum;

import java.util.Scanner;

public class Tugas_Pratikum2 {
    public static String perkenalan(String nama, int NIS, String tempat, int a, int b, int c, String kelamin, String alamat, String motto){
        System.out.println("\n\n=-=Hasil Dari Inputan Anda=-=");
        System.out.println("Nama: " + nama + "\nNIS: " + NIS + "\nTempat lahir: " + tempat + "\nTanggal lahir: " + a + "/" + b + "/" + c + "\nJenis Kelamin: " + kelamin + "\nAlamat di Malang: " + alamat + "\nMotto Hidup: " + motto);
        return null;
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("=-=BioData=-=");
        System.out.print("\nMasukkan Nama anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIS anda: ");
        int NIS = input.nextInt();
        System.out.print("Masukkan Tempat lahir anda: ");
        String tempat = input.nextLine();
        System.out.println("Masukkan Tanggal Lahir anda: ");
        System.out.println("Tanggal/Bulan/Tahun");
        int a = input1.nextInt(); int b = input1.nextInt(); int c = input1.nextInt();
        System.out.print("\nJenis Kelamin anda: ");
        String kelamin = input2.nextLine();
        System.out.print("\nAlamat rumah: ");
        String alamat = input2.nextLine();
        System.out.print("\nMotto Hidup Anda: ");
        String motto = input2.nextLine();
        
        perkenalan(nama, NIS, tempat, a, b, c, kelamin, alamat, motto);
    }
}
