package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class temperture {
    public static void main(String[] args) {
        // List<String> list  = new ArrayList<String>();
        //String[] name_of_classmate = {"name0","name1", "name2", "name3"};
    /*
    name_of_classmate[0] = ("name2");
    name_of_classmate[1] = ("name1");
    name_of_classmate[2] =("name0");
    */
        List<String> list = new ArrayList<>();
        list.add("name0");
        list.add("name1");
        list.add("name2");
        list.add("name3");
        list.add("name4");
        list.add("name5");
        list.add("name6");
        list.add("name7");
        list.add("name8");
        list.add("name9");
        list.add("name10");
        list.add("name11");
        list.add("name12");
        list.add("name13");
        list.add("name14");
        list.add("name15");
        list.add("name16");
        list.add("name17");
        list.add("name18");
        list.add("name19");
        list.add("name20");
        list.add("name21");
        list.add("name22");
        Random r = new Random();

        System.out.println();
        Collections.shuffle(list);
        int q =0;
        for (int i = 0; i < list.size(); i++) {
            q++;
            int precimal = 1;
            double min = 35.8;
            double max = 36.9;
            double value = r.nextDouble() * (max - min) + min;
            String result = new BigDecimal(value).setScale(precimal, BigDecimal.ROUND_HALF_DOWN).toPlainString();
            System.out.println(q + list.get(i) + " " + "早测体温" + " " + result);
        }

    }
}
