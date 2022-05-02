import java.util.*;
public class HW21_01 {
    public static void main(String[] args) {
        Set<String> fisrtSet = new LinkedHashSet<>(Arrays.asList("Dilya", "Nuraina", "Almira", "Dana", "Syr", "Alisher"));
        Set<String> secondSet = new LinkedHashSet<>(Arrays.asList("Nana", "Almira", "Dana", "Alisher", "Aidos"));
        Set<String> differenceSet = new LinkedHashSet<>(fisrtSet);
        differenceSet.removeAll(secondSet);
        System.out.println("Difference " + differenceSet +"\n");
        Set<String> unionSet = new LinkedHashSet<>(fisrtSet);
        unionSet.addAll(secondSet);
        System.out.println("\n" + "Union " + unionSet  +"\n");
        Set<String> intersectionSet = new LinkedHashSet<>();
        for (String e: secondSet) {
            if (fisrtSet.contains(e))
                intersectionSet.add(e);
        }
        System.out.println("Intersection: " + intersectionSet + "\n");
    }
}