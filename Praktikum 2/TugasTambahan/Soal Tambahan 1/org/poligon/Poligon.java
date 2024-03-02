//Nama file: Poligon.java
//Nama/NIM : Miriam Stefani Abigail Hutapea
//Hari, tanggal: Jumat, 1 Maret 2024
//Deskripsi: file konstruktor bangun datar bersisi banyak (>1)

package org.poligon;

public class Poligon 
{
    protected int jumlahSisi;

    public Poligon()
    {
        this.jumlahSisi = 1;
    }

    public void setJumlahSisi(int jumlahSisi)
    {
        this.jumlahSisi = jumlahSisi;
    }

    public int getJumlahSisi()
    {
        return this.jumlahSisi;
    }
}
