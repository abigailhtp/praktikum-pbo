//Nama file: LimasSegiempat.java
//Nama/NIM : Miriam Stefani Abigail Hutapea
//Hari, tanggal: Jumat, 1 Maret 2024
//Deskripsi: file konstruktor bangun ruang kubus

package org.bangunruang;
import org.bangundatar.BujurSangkar;
import org.bangundatar.SegitigaSamaSisi;


public class LimasSegiempat {
    private BujurSangkar alas;
    private SegitigaSamaSisi sisiLimas;

    public LimasSegiempat(BujurSangkar alas,SegitigaSamaSisi sisiLimas){
        this.alas=alas;
        this.sisiLimas=sisiLimas;
    }

    public double tinggiLimas(){
        double panjangSisiAlas= alas.getPanjangSisi()/2;
        double tinggiSisiLimas= sisiLimas.getTinggiSisi();
        return Math.sqrt(Math.pow(tinggiSisiLimas,2)-Math.pow(panjangSisiAlas,2));
    }
    public double volumeLimas(){
        double luasAlas=alas.hitungLuas();
        return ((luasAlas*tinggiLimas())/3);
    }
    public double luasPermukaan(){
        double luasAlas=alas.hitungLuas();
        return luasAlas+(sisiLimas.luasSegitiga())*2;
    }
}
