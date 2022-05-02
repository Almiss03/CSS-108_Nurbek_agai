package Activity_4;
import java.util.ArrayList;
public class Ex13_3 {
    public static void main(String[] args) {
        ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(15);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(196);
        sort(arrayList);
        for (Number number : arrayList) {
            System.out.print(number + " ");
        }
    }
    public static void sort(ArrayList<Number> list){
        for (int i = 1; i < list.size() ; i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if((int)list.get(j) > (int)list.get(i)){
                    int n = (int)list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, n);
                }
            }
        }
    }
}

