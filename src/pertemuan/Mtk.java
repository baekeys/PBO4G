package pertemuan;

import java.util.Scanner;


public class Mtk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nama Anda: ");
        String nama = input.nextLine();
        
        System.out.println("Halo, "+nama+", silahkan coba aplikasi");
        
        System.out.print("Masukan Bilangan Pertama : ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukan Bilangan Kedua : ");
        int bil2 = input.nextInt();
        
        int hasil = bil1 * bil2;
        
        System.out.println("Hasil: "+hasil);
        
    }
}
