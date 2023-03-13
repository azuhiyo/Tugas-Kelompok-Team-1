package binus.forum;
import java.text.DecimalFormat;
import java.util.Scanner;
public class RestoranBungar {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat siang..." + "\n\r" );
        System.out.print("Pesan untuk berapa orang : ");
        double jumlahOrang = input.nextDouble();

        System.out.print("Pesanan atas nama        : ");

        input.nextLine();

        String namaOrang = input.nextLine();
        System.out.println("\n\r");
        System.out.println("Menu Spesial hari ini");
        System.out.println("=====================" + "\n\r");

        double menu1 = 9_999.99;
        double menu2 = 12_345.67;
        double menu3 = 21_108.40;
        double menu4 = 13_579.13;
        double menu5 = 98_765.43;
        System.out.println("   1. Nasi Goreng Spesial              @ Rp.  " + df.format(menu1));
        System.out.println("   2. Ayam Bakar Spesial               @ Rp. " + df.format(menu2));
        System.out.println("   3. Steak Sirloin Spesial            @ Rp. " + df.format(menu3));
        System.out.println("   4. Kwetiaw Siram Spesial            @ Rp. " + df.format(menu4));
        System.out.println("   5. Kambing Guling Spesial           @ Rp. " + df.format(menu5));
    }
}
