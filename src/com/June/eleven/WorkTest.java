package com.June.eleven;

import java.util.ArrayList;
import java.util.List;
public class WorkTest {
        public static void main(String[] args) {

            List<Worker>list = new ArrayList<>();

            list.add(new Worker("zhang3", 18, 3000));
            list.add(new Worker("li4", 25, 3500));
            list.add(new Worker("wang5", 22, 3200));

            list.add(1, new Worker("zhao6", 24, 3300));
            list.remove(3);

            for (Worker a : list) {
                System.out.println(a);
            }
            System.out.println("================");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

        }

    }

