public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;
    public void set(T tipeBangunDatar){
        bangunDatar=tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }

    //ketika T diganti tidak berpengaruh apa-apa karena sama seperti mengganti nama variabel yang tidak berpengaruh apa-apa
}
