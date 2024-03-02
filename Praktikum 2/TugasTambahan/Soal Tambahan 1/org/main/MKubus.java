//Nama file: MKubus.java
//Nama/NIM : Miriam Stefani Abigail Hutapea
//Hari, tanggal: Jumat, 1 Maret 2024
//Deskripsi: file implementasi bangun ruang kubus

package org.main;
import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus
{
    public static void main(String[] args)
    {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas permukaan kubus dengan panjang sisi 4 satuan: " + kubus.hitungLuasAlas());
        System.out.println("Volume kubus dengan panjang sisi 4 satuan: " + kubus.hitungVolume());
    }
}
