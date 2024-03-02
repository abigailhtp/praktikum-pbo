//Nama file: Kubus.java
//Nama/NIM : Miriam Stefani Abigail Hutapea
//Hari, tanggal: Jumat, 1 Maret 2024
//Deskripsi: file konstruktor bangun ruang kubus

package org.bangunruang;
import org.bangundatar.BujurSangkar;

public class Kubus
{
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan)
    {
        this.permukaan = permukaan;
    }

    public double hitungVolume()
    {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi * panjangSisi;
    }

    public double hitungLuasAlas()
    {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi;
    }
}
