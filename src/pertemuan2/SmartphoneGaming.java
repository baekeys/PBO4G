
package pertemuan2;


public class SmartphoneGaming extends Smartphone {
    private String charging,icloud;
    
    public void setCG(String tambahfitur){
        charging=tambahfitur;
    }
     public String getCG(){
        return charging;
    }
      public void setIC(String kapasitasic){
        icloud=kapasitasic;
    }
     public String getIC(){
        return icloud;
    }
     
    @Override
     void tampilkan(){
        System.out.println("Nama Brand : "+namabrand);
        System.out.println("Nama Tipe : "+namatipe);
        System.out.println("Kapasitas ICloud : "+icloud);
    }
}
