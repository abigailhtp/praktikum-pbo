public class Coercion2 {
    public static void main(String[] args){
        double x=15.5;
        int output=(int) x;
        System.out.println(output);
    }
}

//pada soal nomor 2 konversi tipe data tidak dapat dilakukan karena
//ketika mengisi variable output, x tidak dapat dirubah menjadi integer begitu saja.
//Harus ditambahkan casting ke integer, sehingga menjadi int output=(int) x, maka hasilnya
//yaitu 15 (tanpa 0.5)