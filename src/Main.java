import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
public class Main {
    public static <T, CompareObjects> boolean Search(CompareObjects search,Comparable[] array){
        for(var i:array){
            if(i.compareTo(search)==0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Integer[] a = {124,2414,5315,21512,51,5521,4312};
        boolean w =Search(5315,a);
        System.out.println(w);
    }
}