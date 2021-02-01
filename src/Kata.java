import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<Integer>(555);
        Gen<String> sOb = new Gen<String>("Строка "+iOb.getOb());
        Gen<Double> dOb = new Gen<Double>(2.5);
        Gen<Number> nOb = new Gen<Number>(10);
        System.out.println(iOb.getOb()+ dOb.getOb()+(Integer) nOb.getOb());
        iOb.showType();
        sOb.showType();
        System.out.println(sOb.getOb());
        try {
            System.out.println(iOb.getOb().toString().charAt(0));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Не вписался в строку! Выбери другой char.");
        }
        System.out.println(iOb.getOb().toString()+dOb.getOb().toString()+nOb.getOb().toString()+sOb.getOb());




    }



}
