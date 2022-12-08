/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifbesarang;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ifbesarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String maskapai, tujuan;
        int harga;
        Scanner scan = new Scanner(System.in);
        System.out.println("Selamat Datang Di Travel Makassar");
        System.out.print ("Maskapai apakah yang anda ingin gunakan?(1.Garuda, 2.Lion, 3.Sriwijaya):");
            maskapai = scan.next();
                if ("Garuda".equalsIgnoreCase(maskapai))
                {
                System.out.print ("Kemanakah tujuan Anda? (1.Jakarta, 2.Surabaya, 3.Bali):");
                tujuan = scan.next();
                if ("Jakarta".equalsIgnoreCase(tujuan))
                {
                      harga = 1200000;
                    System.out.println("Harga yang harus anda bayar yaitu Rp"+harga);
                }
                else if ("Surabaya".equalsIgnoreCase(tujuan))
                {
                harga = 600000;
                System.out.println ("Harga yang harus Anda bayar yaitu Rp"+harga);
                }
                else if ("Bali".equalsIgnoreCase(tujuan))
                {
                harga = 800000;
                System.out.println ("Harga yang harus Anda bayar yaitu Rp"+harga);
                }
                else 
                {
                    System.out.print ("Tujuan yang anda masukan tidak ada dalam daftar kami");
                }
                }
                else if ("Lion".equalsIgnoreCase(maskapai))
                {
                System.out.print ("Kemanakah tujuan Anda? (1.Jakarta, 2.Surabaya, 3.Bali):");
                tujuan = scan.next();
                if ("Jakarta".equalsIgnoreCase(tujuan))
                {
                      harga = 1200000;
                    System.out.println("Harga yang harus anda bayar yaitu Rp"+harga);
                }
                else if ("Surabaya".equalsIgnoreCase(tujuan))
                {
                harga = 600000;
                System.out.println ("Harga yang harus Anda bayar yaitu Rp"+harga);
                }
                else if ("Bali".equalsIgnoreCase(tujuan))
                {
                harga = 800000;
                System.out.println ("Harga yang harus Anda bayar yaitu Rp"+harga);
                }
                else
                {
                    System.out.print ("Tujuan yang anda masukan tidak ada dalam daftar kami");
                }
                }
                else if ("Sriwijaya".equalsIgnoreCase(maskapai))
                {
                System.out.print ("Kemanakah tujuan Anda? (1.Jakarta, 2.Surabaya, 3.Bali):");
                tujuan = scan.next();
                if ("Jakarta".equalsIgnoreCase(tujuan))
                {
                      harga = 700000;
                    System.out.println("Harga yang harus anda bayar yaitu Rp"+harga);
                }
                else if ("Surabaya".equalsIgnoreCase(tujuan))
                {
                harga = 4200000;
                System.out.println ("Harga yang harus Anda bayar yaitu Rp"+harga);
                }
                else if ("Bali".equalsIgnoreCase(tujuan))
                {
                harga = 5500000;
                System.out.println ("Harga yang harus Anda bayar yaitu Rp"+harga);
                }
                else
                {
                    System.out.print ("Tujuan yang anda masukan tidak ada dalam daftar kami");
                }
                }
                else
        {
            System.out.println("Maskapai yang Anda masukkan tidak ada dalam daftar kami");
        }        
                
    }
    
}
