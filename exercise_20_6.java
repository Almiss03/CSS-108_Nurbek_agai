import java.util.Iterator;
import java.util.LinkedList;
public class exercise_20_6 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1_00_000; i++) {
            list.add(i);
        }
        Iterator iterator = list.iterator();
        long start = System.currentTimeMillis();
        while(iterator.hasNext()){
            iterator.next();
        }
        long finish = System.currentTimeMillis();
        System.out.println("iterator: " + (finish - start));
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long finish2 = System.currentTimeMillis();
        System.out.println("getter: " + (finish2 - start1));
    }
}