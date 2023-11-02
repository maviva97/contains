import java.util.List;

public class AddAll {
    public String[] addAll(String[] array, String[] array2){
        for (int i=0; i<array.length; i++) {
            array2[i] = array[i];
//            System.out.println("Array2->" +array2[i]);
        }
        return  array2;
    }
    }
