public class Contains {

    public  boolean contains(String[] array, String value) {
        for (String s: array) {
            if (s.contains(value))
               return true;
        }
       return false;
    }
}
