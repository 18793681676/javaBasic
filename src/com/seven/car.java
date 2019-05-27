package com.seven;

public class car {


        String mark;
        int price;
        int speed;
        //驾驶功能
        public void drive(){
            System.out.println("当前速度："+speed);
            System.out.println("启动自动驾驶");
        }
        //变速功能
        public void speedChange(int newSpeed){
            speed= newSpeed;
            System.out.println("变速之后的速度："+speed);
        }

        public void market(){
            System.out.println("品牌："+mark);
            System.out.println("价钱："+price);
        }
    }


