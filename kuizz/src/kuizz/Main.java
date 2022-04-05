/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuizz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int lomba ;
        System.out.println("Lomba Apresiasi Pahlawan Wanita Indonesia oleh UPNVYK");
        System.out.println("Terdapat 2 kategori perlombaan : ");
        System.out.println("    1. Animasi (tim) ");
        System.out.println("    2. Menulis Surat (Individu) ");
        Scanner input = new Scanner(System.in);
        System.out.print("Pilih Kategori perlombaan : ");lomba = input.nextInt();
        
        Menulis tulis = new Menulis();
        Animasi anima = new Animasi();
        if (lomba == 2){
            tulis.surat();
        }else if (lomba == 1){
            anima.anim();
        }
    }
    
}
