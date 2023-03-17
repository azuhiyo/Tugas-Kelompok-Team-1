package binus.forum;
import java.text.DecimalFormat;
import java.util.Scanner;
public class RestoranBungar {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final DecimalFormat df2 = new DecimalFormat("0");
    public static void main(String[] args){
        
        // Minta User Untuk Menginput Jumlah Orang dan Nama Pesanan
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat siang..." + "\n\r" );
        System.out.print("Pesan untuk berapa orang : ");
        double jumlahOrang = input.nextDouble();

        System.out.print("Pesanan atas nama        : ");
        input.nextLine();

        String namaOrang = input.nextLine();
        System.out.println("\n\r");
        
        // Program Menampilkan Menu Makanan
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
        
        // Minta User Untuk Menginput Jumlah Pesanan
        System.out.println("\n\r" +"Pesanan Anda [batas pesanan 0-10 porsi]" + "\n\r");
        System.out.print("1. Nasi Goreng Spesial      = ");
        double jNG = input.nextDouble();
        System.out.print("2. Ayam Bakar Spesial       = ");
        double jAB = input.nextDouble();
        System.out.print("3. Steak Sirloin Spesial    = ");
        double jSS = input.nextDouble();
        System.out.print("4. Kwetiaw Siram Spesial    = ");
        double jKS = input.nextDouble();
        System.out.print("5. Kambing Guling Spesial   = ");
        double jKG = input.nextDouble();
        
        //Hitung Pembelian Yang Dilakukan Oleh User
        double totNG = jNG * menu1;
        double totAB = jAB * menu2;
        double totSS = jSS * menu3;
        double totKS = jKS * menu4;
        double totKG = jKG * menu5;
        
        //Tampilkan Harga Pembelian Dari Pesanan User
        System.out.println("\n\r" + "\n\r" + "Selamat menikmati makanan anda..." + "\n\r" + "\n\r" + "Pembelian :");
        System.out.println("\n\r" + "1. Nasi Goreng Spesial      = "+ df2.format(jNG) + " porsi * Rp. " + df.format(menu1) + "  = Rp.      " + df.format(totNG));
        System.out.println("2. Ayam Bakar Spesial       = "+ df2.format(jAB) + " porsi * Rp. " + df.format(menu2) + " = Rp.     " + df.format(totAB));
        System.out.println("3. Steak Sirloin Spesial    = "+ df2.format(jSS) + " porsi * Rp. " + df.format(menu3) + " = Rp.     " + df.format(totSS));
        System.out.println("4. Kwetiaw Siram Spesial    = "+ df2.format(jKS) + " porsi * Rp. " + df.format(menu4) + " = Rp.     " + df.format(totKS));
        System.out.println("5. Kambing Guling Spesial   = "+ df2.format(jKG) + " porsi * Rp. " + df.format(menu5) + " = Rp.     " + df.format(totKG) + " +");
    }
}
