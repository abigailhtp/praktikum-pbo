//Nama file: KeranjangBelanja.java
//Nama/NIM : Miriam Stefani Abigail Hutapea/ 24060122130051
//Hari/Tanggal: Sabtu 9 Maret 2024
//Deskripsi: menambahkan item dan mencetak atribut keranjang

public class KeranjangBelanja {
    private String[] keranjang;
    private int count;

    public KeranjangBelanja(){
        this.keranjang = new String[5];
        this.count=0;
    }
    public void addItem (String item){
        keranjang[count]=item;
        count++;
        throw new AssertionError("Keranjang sudah penuh");
    }

    public void printItems(){
        for (int i=0;i<keranjang.length;i++){
            System.out.println(keranjang[i]);
        }
    }
}
