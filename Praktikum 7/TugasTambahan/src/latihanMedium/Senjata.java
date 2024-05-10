package latihanMedium;

public class Senjata {
    private String bunyi;
    private int peluru;
    private boolean menusuk;
    public Senjata(String bunyi){
        this.bunyi=bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    public void setMenusuk(boolean menusuk){
        this.menusuk=menusuk;
    }

}
