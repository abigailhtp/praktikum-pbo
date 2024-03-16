package org.mobil;
import org.kendaraan.Kendaraan;
import org.main.MKendaraan;

public class Mobil extends Kendaraan{
    private int jumlahPintu;

    public Mobil(String nama,int jumlahPintu) {
        super(nama);
        this.jumlahPintu=jumlahPintu;


    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }
    public void setJumlahPintu(){
        this.jumlahPintu=jumlahPintu;
    }
    public void klakson(){
        System.out.println(getNama()+" berbunyi, Vroom Vroom!");
    }
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Jenis kendaraan : mobil");
        System.out.println("Jumlah Pintu Mobil: "+getJumlahPintu());
    }

    public void bukaPintu(int nomorPintu){
        if (nomorPintu<=getJumlahPintu()) {
            System.out.println("Pintu mobil yang terbuka ada " + nomorPintu);
        }else{
            System.out.println("Pintu sudah terbuka semua");
        }
    }
}
