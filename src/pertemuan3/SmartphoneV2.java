package pertemuan3;

public class SmartphoneV2 {
    private String namabrand;
    private String namatipe;
    private int tanggalrelease;

    // constructor
    public SmartphoneV2(String brand, String type, int releaseYear) {
        this.namabrand = brand;
        this.namatipe = type;
        this.tanggalrelease = releaseYear;
    }

    // mutator methods
    public void setNamaBrand(String brand) {
        this.namabrand = brand;
    }

    public void setNamaTipe(String type) {
        this.namatipe = type;
    }

    public void setTanggalRelease(int releaseYear) {
        this.tanggalrelease = releaseYear;
    }

    // accessor methods
    public String getNamaBrand() {
        return this.namabrand;
    }

    public String getNamaTipe() {
        return this.namatipe;
    }

    public int getTanggalRelease() {
        return this.tanggalrelease;
    }
}
