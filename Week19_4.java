package com.company;

public class Week19_4 {
    public static void main(String[] args) {
        Integer[] nums = {1, 20, 4, 6, 18, 2};
        System.out.println(linearSearch(nums, 4));
        System.out.println(linearSearch(nums, 100));
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }
}