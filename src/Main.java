import java.util.*;

import static java.util.Collections.addAll;

public class Main {
    public static void main(String[] args) {
        String[] array = {"name","surname","fathername"};
        String value ="name";
        String value2="sasa";
         Contains c=new Contains();
        System.out.println(c.contains(array,value));
        System.out.println(c.contains(array,value2));

        System.out.println("   ");


        String[] array1 =new String[] {
                "America", "Australia", "Arabia", "Italia"};
        System.out.println("Array1->"+ Arrays.toString(array1));
        String[] array2= new String[array1.length];
        AddAll addAll=new AddAll();
        addAll.addAll( array1, array2);
        System.out.println("Array2->"+ Arrays.toString(array2));
}
}



