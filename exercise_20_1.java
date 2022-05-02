package com.company;
import org.w3c.dom.Text;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class exercise_20_1 {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Text.txt");
        FileReader reader = new FileReader(file);
        Scanner in = new Scanner(reader);
        ArrayList<String> list = new ArrayList<>();
        while(in.hasNext()){
            String[] array = in.nextLine().split(" ");
            for (int i = 0; i < array.length; i++) {
                list.add(array[i]);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}