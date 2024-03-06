//File: AngkaSial.java
//Deskripsi: Program penggunaan exception buatan sendiri, pengenalan klausa 'throw' dan 'throws'

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException a){
            System.out.println(a.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

//baris 12 tetap dieksekusi, tetapi ketika as diisi oleh nilai 10, bukan nilai 12 yang terletak dibawah baris 19.
//baris 21 diekseikusi, karena menampilkan "hati-hati memasukkan angka" setelah mengeprint hasil dari throw, yaitu jangan memasukkan angka 13
