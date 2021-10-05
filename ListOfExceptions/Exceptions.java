import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("goodbye world");

        for(int i=0;i<myList.size();i++) {
            try {
                Integer value = (Integer) myList.get(i);
                System.out.println(value);
            } catch(ClassCastException e) {
                System.out.println("Unable to cast "+myList.get(i)+" error occured at index "+i);
            }
        }
    }
}