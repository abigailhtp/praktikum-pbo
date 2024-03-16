package org.motor;
import org.kendaraan.Kendaraan;

public class Motor extends Kendaraan{
    private int cc;
    public Motor(String nama, int cc){
        super(nama);
        this.cc=cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCC(int cc){
        this.cc=cc;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Jenis kendaraan: Motor");
        System.out.println("Kapasitas mesin cc motor: "+getCc());
        System.out.println("Motor diperkirakan memiliki tenaga "+hitungHorsepower(16)+" HP dengan "+hitungHorsepower(15)+" sebagai batas bawah dan "+hitungHorsepower(17)+" sebagai batas atas interval");
    }

    public double hitungHorsepower(int angka) {
        if (angka<18 && angka>=15) {
            return (getCc() / angka);
        }else{
            return 0;
        }
    }

    public void klakson(){
        System.out.println(getNama()+" berbunyi, Womp Womp!");
    }

}
