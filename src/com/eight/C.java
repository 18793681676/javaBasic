package com.eight;

public class C {
    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.setName("zhangsan");
        worker.setNum(22);
        worker.setSalary(200);
        worker.computeSalay();
        Salesman s1= new Salesman();
        s1.setBasic(1600);
        s1.setName("lisi");
        s1.setExsalary(800);
        s1.computeSalay();

    }
}
