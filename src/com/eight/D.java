package com.eight;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       Student[] students = new Student[1];
       for (int i=0;i<students.length;i++) {
           Student student = new Student();
           /*提示输入信息*/
           System.out.println("请输入姓名");
           String name = input.next();
           System.out.println("请输入学号");
           String sno = input.next();
           Course[] courses = new Course[3];
           for (int j=0;j<3;j++){
               System.out.println("请输入课程名称");
               String cname = input.next();
               System.out.println("输入成绩");
              int score = input.nextInt();
              Course course = new Course();
              course.setCname(cname);
              course.setScore(score);
              courses[i]=course;
           }
           student.setName(name);
           student.setSno(sno);
           student.setCourse(courses);
           students[i]=student;
       }
       for (Student s:students){
           System.out.println(s);
       }
    }
}
