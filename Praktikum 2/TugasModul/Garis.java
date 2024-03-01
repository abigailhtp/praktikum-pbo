//Nama file : Garis.java
//Nama/NIM: Miriam Stefani Abigail Hutapea/24060122130051
//Hari/Tanggal: Rabu, 28 Februari 2024
//Deskripsi: Konstruktor File kelas garis

public class Garis {
    private Titik t1,t2;
    public Garis(Titik t1, Titik t2){
        this.t1=t1;
        this.t2=t2;
    }

    public Titik getTitikAwal(){
        return this.t1;
    }

    public Titik getTitikAkhir(){
        return this.t2;
    }

    public void setTitikAwal(Titik t1){
        this.t1=t1;
    }

    public void setTitikAkhir(Titik t2){
        this.t2=t2;
    }

    public double getPanjang(){
        return Math.pow((Math.pow((t2.getAbsis()-t1.getAbsis()), 2) + Math.pow((t2.getOrdinat()-t1.getOrdinat()), 2)), 0.5);
    }

    public double getGradien(){
        return (t2.getOrdinat()-t1.getOrdinat())/(t2.getAbsis()-t1.getAbsis());
    }

    public void getRefleksiY(){
        double absist1= t1.getAbsis();
        double absist2= t2.getAbsis();
        absist1*=(-1);
        absist2*=(-1);
        t1.setAbsis(absist1);
        t2.setAbsis(absist2);
    }

    public boolean isTegakLurus(Garis G){
        Garis A=new Garis (t1,t2);
        if( G.getGradien()==A.getGradien()){
            return true;
        }else{
            return false;
        }
    }
}

