package org.kendaraan;

public class Kendaraan {
    protected String nama;
    protected int kecepatan;
    public Kendaraan(String nama){
        this.nama=nama;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public int getKecepatan(){
        return kecepatan;
    }
    public void setKecepatan(int kecepatan){
        this.kecepatan=kecepatan;
    }

    public void klakson(){
        System.out.println(getNama()+" berbunyi" );
    }
    public void cetakInfo(){
        System.out.println("\nNama Kendaraan :"+getNama());
        System.out.println("Kecepatan :"+getKecepatan());
    }
}
