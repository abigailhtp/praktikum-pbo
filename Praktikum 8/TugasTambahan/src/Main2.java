class Kupu{
    public void gerak(){

    }
}

class Ulat extends Kupu {
    public void gerak(){
        System.out.println("Ulat merayap");
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



public class Main2 {
    public static void main(String[] args){
        Ulat K= new Ulat();
        Data<Kupu> anu=new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
    }
}
