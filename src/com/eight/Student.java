package com.eight;

import java.util.Arrays;

public class Student {
    /*private String number;
    private String name;
    private int Chineae;
    private int English;
    private int Math;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineae() {
        return Chineae;
    }

    public void setChineae(int chineae) {
        Chineae = chineae;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }
    public void mean(){
        int a=(getChineae()+getEnglish()+getMath())/3;
        System.out.println(getName()+"平均数"+a);
    }*/
    private  String sno;
    private  String name;
    private  int score;
    private  Course[] course;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Course[] getCourse() {
        return course;
    }

    public void setCourse(Course[] course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", course=" + Arrays.toString(course) +
                '}';
    }
}
