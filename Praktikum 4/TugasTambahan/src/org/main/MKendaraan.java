package org.main;
import org.kendaraan.Kendaraan;
import org.mobil.Mobil;
import org.truk.Truk;
import org.motor.Motor;

public class MKendaraan {
    public static void main(String[] args){
        Kendaraan kendaraan=new Kendaraan("Kendaraan Abigail");
        Mobil mobil= new Mobil("Bugatti Chiron",2);
        mobil.setKecepatan(45);
        kendaraan.klakson();
        mobil.cetakInfo();
        mobil.klakson();
        mobil.bukaPintu(2);

        Truk truk=new Truk("Mercedez-Benz Actros",20);
        truk.setKecepatan(30);
        truk.setBeratMuatan(5);
        truk.cetakInfo();
        truk.muatBarang(13);
        truk.klakson();

        Motor motor=new Motor("Ducati Panigale V4 R",998);
        motor.setKecepatan(60);
        motor.cetakInfo();
        motor.klakson();

    }
}
