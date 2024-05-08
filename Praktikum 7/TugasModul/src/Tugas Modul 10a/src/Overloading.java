//Nama: Miriam Stefani Abigail Hutapea
//NIM: 24060122130051

//Overloading memungkinkan sebuah class memiliki beberapa method dengan nama yang sama, namun dengan parameter yang berbeda

//Adapun syarat serta contoh overloading yaitu
// 1.memiliki nama method yang sama, namun memiliki tipe data serta parameter yang berbeda.
// 2. Berada pada class yang sama atau berada pada pewarisan class yang sama.

public class Overloading {
    static int tambah(int a, int b){
        return a+b;
    }
    static String tambah(String a, String b){
        return a+" tambah "+b;
    }
    public static void main (String[] args){
        System.out.println(tambah(1,2));
        System.out.println(tambah("1","2"));
    }
}
