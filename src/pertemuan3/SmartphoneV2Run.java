package pertemuan3;

public class SmartphoneV2Run {
public static void main(String[] args) {
        SmartphoneV2 smp = new SmartphoneV2("Samsung", "S22", 2022);

        // using accessor methods to get the values
        System.out.println("Nama Brand : " + smp.getNamaBrand());
        System.out.println("Nama Tipe : " + smp.getNamaTipe());
        System.out.println("Tanggal Release : " + smp.getTanggalRelease());

        // using mutator methods to set new values
        smp.setNamaBrand("Xiaomi");
        smp.setNamaTipe("Mi 12");
        smp.setTanggalRelease(2023);

        // using accessor methods again to get the updated values
        System.out.println("Nama Brand : " + smp.getNamaBrand());
        System.out.println("Nama Tipe : " + smp.getNamaTipe());
        System.out.println("Tanggal Release : " + smp.getTanggalRelease());
    }
}