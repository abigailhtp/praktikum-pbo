//Nama file : Garis.java
//Nama/NIM: Miriam Stefani Abigail Hutapea/24060122130051
//Hari/Tanggal: Rabu, 28 Februari 2024
//Deskripsi: File kelas garis

class MGaris {
    public static void main(String[] args){
        Titik t1=new Titik(1,2);
        Titik t2=new Titik(3,6);
        Titik t3=new Titik(0,1);
        Titik t4=new Titik(0,2);

        Garis G=new Garis(t1,t2);
        Garis A=new Garis(t3,t4);
        System.out.println("Titik awal:("+G.getTitikAwal().getAbsis()+","+G.getTitikAwal().getOrdinat()+")");
        System.out.println("Titik akhir:("+G.getTitikAkhir().getAbsis()+","+G.getTitikAkhir().getOrdinat()+")");
        System.out.println("Panjang garis:"+G.getPanjang());
        System.out.println("Gradien garis:"+G.getGradien());

        G.getRefleksiY();
        System.out.println("Garis setelah direfleksi:");
        System.out.println("Titik awal:("+G.getTitikAwal().getAbsis()+","+G.getTitikAwal().getOrdinat()+")");
        System.out.println("Titik akhir:("+G.getTitikAkhir().getAbsis()+","+G.getTitikAkhir().getOrdinat()+")");

        System.out. println("Apakah garis G dan garis A merupakan garis yang sejajar?");
        if (G.isTegakLurus(A)){
            System.out.println("Ya");
        }else{
            System.out.println("Tidak");
        }
    }
}
//kesimpulan
//dalam satu folder tidak boleh ada 2 main
//jika konstruktor, maupun method pada file konstruktor dibuat private maka file main tidak dapat mengaksesnya
//atribut harus diprivate
//terdapat 4 relasi antarobjek:inheritance
//asosiasi (has a) cth : handphone has a button
//komposisi bagian yg gabisa dipisahkan cth laptop dengan cpu
//agregasi bisa cth: laptop dengan mouse
