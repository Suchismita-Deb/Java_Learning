package test;
import java.util.*;

public class list {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("A");list.add("B");list.add("A");list.add("B");
        list.add("A");list.add("B");list.add("A");list.add("B");
        list.add("A");list.add("B");list.add("A");list.add("B");
        list.add("A");list.add("B");list.add("A");list.add("B");
        System.out.println("Initial Size = "+ list.size());
        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(i);
            String currentString = list.get(i);
            if(currentString.equals("A")){
                String removed = list.remove(i);//No ConcurrentModificationException
                System.out.println("Removed :: " +removed +" List Size :: "+list.size());
                i--;
                System.out.println(i);
            }
        }
        System.out.println(list);

        list = new ArrayList();
        list.add("A");list.add("B");list.add("A");list.add("B");
        list.add("A");list.add("B");list.add("A");list.add("B");
        list.add("A");list.add("B");list.add("A");list.add("B");
        list.add("A");list.add("B");list.add("A");list.add("B");
        list.add("A");list.add("B");list.add("A");list.add("B");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String currentString = itr.next();
            if(currentString.equals("A")){
                //boolean remove = list.remove(currentString);//ConcurrentModificationException
                itr.remove();//Will Work as its currently being pointed
                System.out.println("Removed :: " +currentString +" List Size :: "+list.size());

            }
        }

        System.out.println(list);
    }
}
