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
public class Menulis {
    String nama, sekolah, hasil;
    float struktur, isi, kreatif, bahasa;
    double na;
    int pil, ex, x;
    
    void surat(){
            System.out.println("=== FORM PENDAFTARAN ===");
            Scanner input = new Scanner(System.in);
            System.out.println("Input Nama : "); nama = input.nextLine();
            System.out.println("Asal Sekolah : "); sekolah = input.nextLine();
        do{
            
            System.out.println("--- Form Penilaian ---");
            System.out.println("Keterangan : Nilai yang valid berada di antara 0 - 100");
            System.out.print("Input Nilai Struktur Surat : "); struktur = input.nextFloat();
            System.out.print("Input Nilai Isi Surat : "); isi = input.nextFloat();
            System.out.print("Input Nilai Kreativitas : "); kreatif = input.nextFloat();
            System.out.print("Input Nilai Penerapan Kaidah Bahasa : "); bahasa = input.nextFloat();
            na = struktur*10/100 + isi*40/100 + kreatif*30/100 + bahasa*20/100;
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
                System.out.println("" + nama + " dari " + sekolah + " telah " + hasil + " dalam lomba seleksi menulis surat");
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
