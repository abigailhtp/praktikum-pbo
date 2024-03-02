//Nama file: SegitigaSamaSisi.java
//Nama/NIM : Miriam Stefani Abigail Hutapea
//Hari, tanggal: Jumat, 1 Maret 2024
//Deskripsi: file konstruktor bangun datar Segitiga Sama Sisi


package org.bangundatar;
import org.poligon.Poligon;

public class SegitigaSamaSisi extends Poligon {
    private double tinggiSisi;
    private double panjangAlas;

    public SegitigaSamaSisi(double tinggiSisi, double panjangAlas){
        this.jumlahSisi=3;
        this.tinggiSisi=tinggiSisi;
        this.panjangAlas=panjangAlas;
    }
    public double luasSegitiga(){
        return (panjangAlas*tinggiSisi)/2;
    }

    public double getPanjangAlas(){
        return panjangAlas;
    }

    public double getTinggiSisi(){
        return tinggiSisi;
    }
}
