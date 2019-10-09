package Tugas.Pratikum;

import java.util.Scanner;

public class Tugas_Pratikum1 {
    public static void main(String[]args){
        
        //Deklrasi
        Scanner Int = new Scanner(System.in);
        Scanner Int1 = new Scanner(System.in);
        System.out.println("=-=Selamat datang di Aplikasi perhitungan 'LUAS PERMUKAAN' Bola & Balok=-=");
        System.out.println("Pilihan Menu : ");
        System.out.print("[1] Luas Permukaan Bola\n[2] Luas Permukaan Balok\n\nPilihan Anda => ");
        int input = Int.nextInt();
        
        // Menu
        if(input == 1) {
            System.out.println("\n=-=Luas Permukaan Bola=-=");
            System.out.print("Masukkan salah satu :\n[1]Diameter\n[2]Jari-jari\n\nPilihan Anda => ");
            int input1 = Int1.nextInt();
            
            if(input1 == 1){
                System.out.print("Masukkan Diameter Bola : ");
                int diameter = Int1.nextInt();
                System.out.println("Rumus Luas Permukaan Bola :\n4.π.r2\n\n=-=Mulai Proses Menghitung=-=");
                
                bola(diameter);
                
            } else if (input1 == 2){
                System.out.print("Masukkan Jari-jari Bola : ");
                int jari = Int1.nextInt();
                System.out.println("Rumus Luas Permukaan Bola :\n4.π.r2\n\n=-=Mulai Proses Menghitung=-=");
                
                bola1(jari);
                
            }
            
        } else if (input == 2) {
            System.out.print("\n=-=Luas Permukaan Balok=-=\nPanjang Balok = ");
            int panjang = Int1.nextInt();
            System.out.print("Tinggi Balok = ");
            int tinggi = Int1.nextInt();
            System.out.print("Lebar Balok = ");
            int lebar = Int1.nextInt();
            
            balok(panjang, tinggi, lebar);
            
        } else {
            System.out.println("Menu tidak tersedia, Aplikasi akan tutup dengan sendirinya.");
        }
    }
    public static double balok(int panjang, int tinggi, int lebar){
        double balok = 2 * (panjang * lebar) + 2 * (panjang * tinggi) + 2 * ( lebar * tinggi);
        System.out.println("Luas Permukaan Balok = " + balok);
        return 0;
    }
    
    public static double bola(int diameter){
        int Diameter = diameter / 2;
        System.out.println("Luas Permukaan Bola = " + 4 * (22 / 7) * Diameter * Diameter );
        return 0;
    }
    
    public static double bola1(int jari){
        System.out.println("Luas Permukaan  Bola = " + 4 * (22 / 7) * jari * jari);
        return 0;
    }
}
