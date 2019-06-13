package com.June.eleven;

public class Worker {



        private int age;
        private String name;
        private double salary;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public Worker(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }


        @Override
        public String toString() {
            return "工人 姓名： " + name + "  年龄：" + age + "  工资：" + salary;
        }




    }


