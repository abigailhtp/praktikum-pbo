public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l=new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg= new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : "+bdg.hitungKeliling());
        //getclass getname digunakan untuk mendapatkan nama class yang digunakan
        System.out.println("tipe generic: "+bdg.get().getClass().getName());
    }

}
