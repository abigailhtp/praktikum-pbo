package org.main;
import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        Segitiga segitiga= new Segitiga(3,4,3);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang:"+persegi.hitungLuas());
        segitiga.printInfo();
        System.out.println("Luas segitiga adalah :"+ segitiga.luasSegitiga());
    }
}
