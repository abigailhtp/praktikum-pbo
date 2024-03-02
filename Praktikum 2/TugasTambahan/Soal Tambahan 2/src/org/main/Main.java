//Nama file: Main.java
//Nama/NIM : Miriam Stefani Abigail Hutapea/24060122130051
//Hari, tanggal : Sabtu, 2 Maret 2024
//Deskripsi : file implementasi package mahasiswa dan wali mahasiswa

package org.main;
import org.walimahasiswa.WaliMahasiswa;
import org.mahasiswa.Mahasiswa;
import org.orang.Orang;

public class Main {
    public static void main (String[] args){
        Mahasiswa mhsw=new Mahasiswa ("Miriam Stefani","2406012214");
        mhsw.setNim("12345678");
        mhsw.setJurusan("Informatika\n");

        WaliMahasiswa wali=new WaliMahasiswa("James Bond","2406012213");
        wali.setNomorHp("087824536712");
        wali.setAlamat("Jalan Sukun no.1, Banyumanik");

        mhsw.setWali(wali);
        mhsw.cetak();


    }
}
