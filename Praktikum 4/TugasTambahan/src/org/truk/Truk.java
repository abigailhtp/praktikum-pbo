package org.truk;
import org.kendaraan.Kendaraan;

public class Truk extends Kendaraan{
    private int kapasitasMuatan;
    private int beratMuatan;
    public Truk(String nama, int kapasitasMuatan){
        super(nama);
        this.kapasitasMuatan=kapasitasMuatan;
    }

    public int getKapasitasMuatan(){
        return kapasitasMuatan;
    }
    public void setKapasitasMuatan(int kapasitasMuatan){
        this.kapasitasMuatan=kapasitasMuatan;
    }

    public int getBeratMuatan(){
        return beratMuatan;
    }
    public void setBeratMuatan(int beratMuatan){
        this.beratMuatan=beratMuatan;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Jenis kendaraan : Truk");
        System.out.println("Kapasitas Truk :"+getKapasitasMuatan());
        System.out.println("Berat muatan Truk :"+getBeratMuatan());
    }

    public void muatBarang(int berat){
        if(berat+getBeratMuatan()>getKapasitasMuatan()){
            System.out.println("Berat melebihi kapasitas");
        }else{
            System.out.println("Berat muatan saat ini : "+(berat+getBeratMuatan())+" kg");
        }
    }

    public void klakson(){
        System.out.println(getNama()+" berbunyi, Honk Honk!");
    }
}
