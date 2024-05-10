package latihanVeryEasy;

public class Senjata {
    private String bunyi;
    private int peluru;
    public Senjata(String bunyi){
        this.bunyi=bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void menembak(){
        int z=getPeluru()-1;
        System.out.println(getBunyi());
        System.out.println("Sisa peluru: "+z);
    }
}
