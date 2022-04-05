/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuizz;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Animasi {
    String nama, sekolah, hasil;
    float alur, konten, kreatif, sinema;
    double na;
    int pil, ex, x;
    void anim(){
        System.out.println("=== FORM PENDAFTARAN ===");
            Scanner input = new Scanner(System.in);
            System.out.println("Input Nama Tim : "); nama = input.nextLine();
            System.out.println("Asal Sekolah : "); sekolah = input.nextLine();
        do{
            
            System.out.println("--- Form Penilaian ---");
            System.out.println("Keterangan : Nilai yang valid berada di antara 0 - 100");
            System.out.print("Input Nilai Alur Cerita : "); alur = input.nextFloat();
            System.out.print("Input Nilai Konten : "); konten = input.nextFloat();
            System.out.print("Input Nilai Kreativitas : "); kreatif = input.nextFloat();
            System.out.print("Input Nilai Sinematografi : "); sinema = input.nextFloat();
            na = alur*15/100 + konten*35/100 + kreatif*35/100 + sinema*15/100;
            if (na >= 85){
                hasil = "Lolos";
            } else {
                hasil = "Gagal";
            }
            do {
            System.out.println("+++ MENU +++");
            System.out.println("    1. Tampil");
            System.out.println("    2. Edit");
            System.out.println("    3. Exit");
            System.out.println("Pilih :"); pil = input.nextInt();
            if (pil == 1){
                System.out.println(" ");
                System.out.println("    Nilai Akhir : " + na);
                System.out.println("    Keterangan  : " + hasil);
                System.out.println("");
                System.out.println("Tim " + nama + " dari " + sekolah + " telah " + hasil + " dalam lomba seleksi Animasi");
                System.out.println("");
                ex = 1;
                x = 1;
            }else if (pil == 2 ){
                ex =1;
                x = 0;
            }else {
                System.out.println("Terimakasih!");
                ex = 0;
                x = 0;
            }
            }while (x==1);
            System.out.println("");
        }while(ex != 0);
    }
}
