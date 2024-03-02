//Nama file:Mahasiswa.java
//Nama/NIM: Miriam Stefani Abigail Hutapea/24060122130051
//Hari, tanggal: Sabtu, 2 Maret 2024
//Deskripsi : file konstruktor yang berisi elemen mahasiswa


package org.mahasiswa;
import org.walimahasiswa.WaliMahasiswa;
import org.orang.Orang;

public class Mahasiswa extends Orang {
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;


    public Mahasiswa(String nama, String nik){
        super(nik,nama);
        this.nim=nim;
        this.jurusan=jurusan;
        this.wali= wali;
    }

    public String getNim(){
        return this.nim;
    }

    public String getJurusan(){
        return this.jurusan;
    }

    public WaliMahasiswa getWali(){
        return this.wali;
    }

    public void setNim(String nim){
        this.nim=nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan=jurusan;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali=wali;
    }

    public void cetak(){
        System.out.println("Data Mahasiswa:");
        System.out.println("Nama mahasiswa:"+getNama());
        System.out.println("NIK mahasiswa:"+getNik());
        System.out.println("NIM mahasiswa:"+getNim());
        System.out.println("Jurusan:"+getJurusan());
        System.out.println("Data Wali");
        System.out.println("Nama wali: "+wali.getNama());
        System.out.println("NIK Wali:"+wali.getNik());
        System.out.println("Nomor HP:"+wali.getNomorHp());
        System.out.println("Alamat:"+wali.getAlamat());
    }
}
