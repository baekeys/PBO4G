
package pertemuan2;

public class SmartphoneRun {
    public static void main(String[]args){
        
        Smartphone smp = new Smartphone();
        
        smp.namabrand="Samsung";
        smp.namatipe="S22";
        smp.setTL(2022);
        
        System.out.println("Nama Brand : "+smp.namabrand);
        System.out.println("Nama Tipe : "+smp.namatipe);
        System.out.println("Tanggal Release : "+smp.getTL());
        
//        System.out.println("=======================");
//        System.out.println("Upgrade Device ");
//        
//        smp.setNT("S23");
//        System.out.println("Nama Tipe : "+smp.getNT());
//        smp.setTL(2023);
//        System.out.println("Tanggal Release : "+smp.getTL());
//        
        System.out.println("=======================");
        Smartphone smp2 = new Smartphone("Apple","pro max 12");
        smp2.tampilkan();
        
        SmartphoneGaming smpg = new SmartphoneGaming();
        
        System.out.println("=======================");
        System.out.println("Smartphone Gaming ");
        smpg.namabrand="Asus";
        smpg.setNT("Asus ROG 7");
        smpg.setNT("Asus ROG 7");
        smpg.setTL(2023);
        smpg.setCG("YA");
        smpg.setIC("1TB");
        smpg.tampilkan();
    }
}
