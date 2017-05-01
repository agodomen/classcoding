package edu.muc.homework.exception;

import java.util.*;

/**
 * File Name : classcoding - edu.muc.homework.exception
 * CopyRright (c) 1949-xxxx:
 * File Number：
 * Author：gwd
 * Date：on 5/1/17
 * Modify：gwd
 * Time ：
 * Comment：
 * Description：
 * Version：
 */
public class Person {
    private String name = null;
    private int age = 0;
    private double height = 0;
    private double weight = 0;

    public Person() {
        this.name = "jack";
        this.age = 30;
        this.height = 1.8;
        this.weight = 80;
    }

    public Person(String name1, int age1, double height1, double weight1) {
        name = name1;
        age = age1;
        height = height1;
        //作业题目错误
        weight = weight1;
    }

    void set() {
        Scanner s1 = new Scanner(System.in);
        name = s1.nextLine();
        //进行异常捕获
        boolean state = false;
        while (!state) {
            try {
                age = Integer.parseInt(s1.nextLine());
            } catch (Exception e) {
                System.out.println("age必须输入数值型数据，请重新输入age");
                continue;
            }
            state = true;
        }

        while (state) {
            try {
                height = Double.parseDouble(s1.nextLine());
            } catch (Exception e) {
                System.out.println("height必须输入数值型数据，请重新输入height");
                continue;
            }
            state = false;
        }

        while (!state) {
            try {
                weight = Double.parseDouble(s1.nextLine());
            } catch (Exception e) {
                System.out.println("weight必须输入数值型数据，请重新输入weight");
                continue;
            }
            state = true;
        }

    }

    public double Bmivalue() {
        return weight / (height * height);
    }

    public double StdWeight() {
        return 22 * height * height;
    }

    public double ObesityDegree() {
        return (weight - StdWeight()) / StdWeight() * 100;
    }

    public String Conclusion() {
        if (ObesityDegree() < -10)
            return "瘦";
        else if (ObesityDegree() < 20) {
            if (Bmivalue() < 24.2)
                return "普通";
            else
                return "超重";
        } else
            return "肥胖";
    }

    public String toString() {
        return "姓名：" + name + "年龄：" + age + " " + Conclusion();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Person p1 = new Person();
        System.out.println(p1);


        Person p2 = new Person("rose", 20, 1.6, 45);
        System.out.println(p2);

        Person p3 = new Person();
        p3.set();
        System.out.println(p3.Conclusion());
    }
}
