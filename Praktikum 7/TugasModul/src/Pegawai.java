public class Pegawai {
    String nama;
    int gajiPokok=5000000;

    public Pegawai(String nama) {
        this.nama=nama;
    }


    public void setNama (String nama){
        this.nama=nama;
    }

    public void tampilData(){
        System.out.println("Nama : "+nama+", Gaji pokok:"+gajiPokok );
    }
}
