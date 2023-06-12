/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author rizqi
 */
public class MahasiswaRun {
    public static void main(String [] args){
        //membuat objek
        Mahasiswa mhs1 = new Mahasiswa();
        
        //memberi nilai pada atribut
        mhs1.nama = "Rizqi";
        mhs1.npm = "2110010182";
        mhs1.umur = 20;    
        
        //menampilkan atribut
        System.out.println ("Nama Mahasiswa : "+mhs1.nama);
        System.out.println ("NPM : "+mhs1.npm);
        System.out.println ("Umur Mahasiswa : "+mhs1.umur+" Tahun");
    }
    
}
