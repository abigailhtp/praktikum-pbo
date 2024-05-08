import java.util.*;
public class MapTest {
    public static void main(String[] args){
        Map<Integer,String> map= new HashMap<Integer,String>();
        //menempatkan elemen kunci dan nilai
        map.put(1,"satu");
        map.put(2,"dua");
        map.put(3,"tiga");
        map.put(4,"empat");
        System.out.println(map.get(1));
        //mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key=map.keySet();
        for(String v:map.values()){
            System.out.print(v+" ");
        }
        System.out.println("\n");

        for(Integer v:key){
            System.out.print(map.get(v)+" ");
        }
    }
}
