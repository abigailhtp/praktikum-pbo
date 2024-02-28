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
}
