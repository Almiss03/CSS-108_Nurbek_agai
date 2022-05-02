import java.util.ArrayList;
import java.util.Random;
public class hw13_2 {
    public static void main(String[] args){
        ArrayList<Number> san = new ArrayList<Number>();
        for(int i = 0; i<7; i++){
            san.add(i);
        }
        System.out.println(san.toString());
        shuffle(san);
        System.out.println(san.toString());
    }
    public static void shuffle(ArrayList<Number> list) {
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int index = random.nextInt(list.size());
            Number temp = list.get(index); // 46 35 46 86
            list.set(index, list.get(i));
            list.set(i, temp);
        }
    }
}