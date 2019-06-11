package com.June.eleven;

import java.util.ArrayList;
import java.util.List;

public class YoujianTest {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(new Youjian("张三","桥西","石家庄","河北","中国"));
        l.add(new Youjian("李四","城关","兰州","甘肃","中国"));
        l.add(new Youjian("王五","东丽","天津","天津","中国"));

        for(int i=0;i<l.size();i++)
        {
            Youjian p=(Youjian)l.get(i);
            System.out.println("姓名："+p.name +"；街道："+ p.street +"；市："+ p.city+"；省："+p.province+"；国家："+p.country);
        }
    }

}
