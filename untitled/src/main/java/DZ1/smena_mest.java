package DZ1;

import java.util.ArrayList;
import java.util.Arrays;

public class smena_mest {
    public static void main(String[] args) {
        Integer a[] =new Integer[] 
                {1,2,3,4,5
                };
        String b[] = new String[]{
                "a","b","c","d"      
                };
        final smena_mest smena = new smena_mest();
        smena.vivod(a);
        smena.castling(a,1,3);
        smena.vivod(a);
        smena.vivod(b);
        smena.castling(b,1,3);
        smena.vivod(b);

        ArrayList<Integer> integers = smena.mConvert(a);
        ArrayList<String> strings = smena.mConvert(b);

    }
    public <T> void castling(T[] massiv, int a, int b){
        T podmena = massiv[a];
        massiv[a] = massiv[b];
        massiv[b] = podmena;
    }

    public <T> void vivod(T[] massiv){
        for (T znach: massiv
             ) {
            System.out.print(znach + " ");
        }
        System.out.println();
    }

    public <T>  ArrayList<T> mConvert(T[] massiv){
        ArrayList <T> list = new ArrayList<>(Arrays.asList(massiv));
        return list;
    }
}
