
package pertemuan2;

public class Smartphone {
    String namabrand,namatipe;
    private int tanggalrelease;
    
    public Smartphone(String namabrand,String namatipe){
     this.namabrand=namabrand;
     this.namatipe=namatipe;
             
    }
    
    public Smartphone(){
        
    }
    
    void tampilkan(){
        System.out.println("Nama Brand : "+namabrand);
        System.out.println("Nama Tipe : "+namatipe);
    }
    
    void setNT(String ubahnamatipe){
        namatipe=ubahnamatipe;
    }
    
    public void setTL(int ubahtangalrelease){
        tanggalrelease=ubahtangalrelease;
    }
    
    String getNT(){
        return namatipe;
    }
    
    public int getTL(){
        return tanggalrelease;
        
    }
    
    
}
