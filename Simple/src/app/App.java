package app;
import java.util.ArrayList;
import java.util.Iterator;

public class App {
    
    public static void main(String[] args){
        //System.out.println("Hello World");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }

}