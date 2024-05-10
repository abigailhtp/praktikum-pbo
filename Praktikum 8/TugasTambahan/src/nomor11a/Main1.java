package nomor11a;

class Kupu{
    public void gerak(){

    }
}

class Ulat extends Kupu{
    public void gerak(){
        System.out.println("nomor11a.Ulat merayap");
    }
}

class Kepompong extends Kupu{
    public void gerak(){
        System.out.println("nomor11a.Kepompong diam");
    }
}

class KupuDewasa extends Kupu{
    public void gerak(){
        System.out.println("nomor11a.Kupu terbang");
    }
}

class Data<T>{
    T isi;
    public T getIsi(){
        return this.isi;
    }

    public void setIsi(T x) {
        this.isi = x;
    }
}

public class Main1{
    public static void main(String[] args){
        Ulat K=new Ulat();
        Data<Kupu> anu=new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}