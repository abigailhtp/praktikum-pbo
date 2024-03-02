//Nama file: MLimasSegiempat.java
//Nama/NIM : Miriam Stefani Abigail Hutapea
//Hari, tanggal: Jumat, 1 Maret 2024
//Deskripsi: file implementasi bangun ruang limas segiempat

package org.main;
import org.bangundatar.*;
import org.bangunruang.LimasSegiempat;

public class MLimasSegiempat {
    public static void main(String[] args){
        BujurSangkar alas=new BujurSangkar(6);
        SegitigaSamaSisi sisiLimas= new SegitigaSamaSisi(5,6);
        LimasSegiempat limasSegiempat=new LimasSegiempat(alas, sisiLimas);
        System.out.println("Luas alas limas segiempat:"+alas.hitungLuas());
        System.out.println("Hitung luas sisi limas segiempat (sisi=segitiga sama sisi):"+sisiLimas.luasSegitiga());
        System.out.println("Luas permukaan limas segiempat:"+limasSegiempat.luasPermukaan());
        System.out.println("Volume limas segiempat:"+limasSegiempat.volumeLimas());
    }
}
