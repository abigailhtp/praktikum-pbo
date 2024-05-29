import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class LambdaMap {
    public static void main(String[] args){
        Map<String,String> mahasiswaMap=new HashMap<>();
        mahasiswaMap.put("24060122130051","Adi");
        mahasiswaMap.put("24060122120023","Budi");
        mahasiswaMap.put("24060121140045","Cica");

        mahasiswaMap.forEach((nim,nama)->System.out.println(nim+" "+nama));
        mahasiswaMap.forEach((nim,nama)-> {
            System.out.println (nim+" "+nama);
        });
    }
}
