//Nama file: Asersi2.java
//Deskripsi: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai 0


//class lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari=jariJari;
    }
    public double hitungKeliling(){
        double keliling= 2*Math.PI*jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args){
        double jariJari=0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l=new Lingkaran(jariJari);
        double kelilingLingkaran=l.hitungKeliling();
        System.out.println("keliling lingkaran= "+kelilingLingkaran);
    }
}

//secara konsep, ada yang kurang tepat, yaitu ketika jari-jari=0 memang dilakukan assert
//tetapi langkah-langkah yang dibawahnya tetap dijalankan, sehingga hasilnya yaitu keluar jari-jari tidak boleh nol dan keliling lingkaran=0
//padahal seharusnya keliling lingkaran tidak dihitung karena jari-jari=0