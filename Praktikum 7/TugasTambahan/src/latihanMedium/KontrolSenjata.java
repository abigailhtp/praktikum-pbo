package latihanMedium;

public class KontrolSenjata {
    private Senjata senjata;
    public KontrolSenjata(Senjata s){
        this.senjata=s;
    }

    public void isiPeluru(int jumPeluru){
        int c=senjata.getPeluru()+jumPeluru;
        System.out.println(">> Peluru berhasil ditambah: "+c);
        senjata.setPeluru(c+senjata.getPeluru());
    }
    public boolean isAdaPeluru(){
        if (senjata.getPeluru()==0){
            return false;
        }else{
            return true;
        }
    }
    public String menusuk(){
        return "Menusuk menggunakan senjata";
    }

    public String pasangBayonet(){
        return "Memasang bayonet pada senjata";
    }
    public void menembak(char jumlah){
        System.out.println(">> Siap menembak "+jumlah+" kali");
        System.out.println("Peluru Habis");
    }

    public void menembak(int jumlah){
        int z=senjata.getPeluru()-jumlah;
        if(jumlah>senjata.getPeluru()){
            for(int i=1;i< senjata.getPeluru()+1;i++){
                System.out.println(senjata.getBunyi());
            }
            for(int i=1;i<jumlah-senjata.getPeluru()+1;i++) {
                System.out.println("Gagal tembak, peluru habis");
            }
            senjata.setPeluru(0);
            System.out.println(">> Peluru sisa: "+senjata.getPeluru());
        } else if (jumlah== senjata.getPeluru()) {
            for(int i=1;i<senjata.getPeluru()+1;i++){
                System.out.println(senjata.getBunyi());
            }
            senjata.setPeluru(0);
            System.out.println(">> Peluru sisa: "+senjata.getPeluru());
        }else{
            for(int i=1;i<jumlah+1;i++){
                System.out.println(senjata.getBunyi());
            }
            senjata.setPeluru(z);
            System.out.println(">> Peluru sisa: "+z);
        }
    }
}
