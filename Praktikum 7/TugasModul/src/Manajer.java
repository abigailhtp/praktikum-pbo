
public class Manajer extends Pegawai{
    int tunjangan=700000;
    public Manajer(String nama){
        super(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : "+tunjangan);
    }
}
