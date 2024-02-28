//Nama file : Titik.java
//Nama/NIM: Miriam Stefani Abigail Hutapea/24060122130051
//Hari/Tanggal: Rabu, 21 Februari 2024
//Deskripsi: Konstruktor untuk Mtitik

public class Titik {
    private double absis, ordinat;

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public Titik() {
        this(0, 0);
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public double getAbsis() {
        return this.absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }


    public double getOrdinat() {
        return this.ordinat;
    }

    public double getJarakPusat() {
        return Math.pow((Math.pow(absis, 2) + Math.pow(ordinat, 2)), 0.5);
    }

    public void refleksix(Titik titik){
        double ordinat=titik.getOrdinat();
        ordinat*=(-1);
        titik.setOrdinat(ordinat);
    }
    public void getRefleksiX(Titik titik){
        refleksix(titik);
    }

    public void refleksiy(Titik titik){
        double absis=titik.getAbsis();
        absis*=(-1);
        titik.setAbsis(absis);
    }
}





