//Nama file: BujurSangkar.java
//Nama/NIM : Miriam Stefani Abigail Hutapea
//Hari, tanggal: Jumat, 1 Maret 2024
//Deskripsi: file konstruktor bangun datar bujursangkar


package org.bangundatar;
import org.poligon.Poligon;

public class BujurSangkar extends Poligon 
{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi)
    {
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas()
    {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi() 
    {
        return this.panjangSisi;
    }
}
