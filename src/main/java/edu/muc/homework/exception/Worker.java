package edu.muc.homework.exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Worker extends Employee {
    private double salary;
    private double commission;
    private int quantity;

    Worker() {
        this.lastname = "李";
        this.firstname = "小方";
    }


    void setSalary() {
        BufferedReader worker = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入普通员工的奖金：");
        try {
            salary = Float.valueOf(worker.readLine());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    void setQuantity() {
        BufferedReader worker = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入普通员工的销售额：");
        try {
            quantity = Integer.parseInt(worker.readLine());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    void setCommission() {
        BufferedReader comm = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入普通员工的底薪：");
        try {
            commission = Float.valueOf(comm.readLine());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public double earnings() {
        // TODO Auto-generated method stub
        return salary + commission + quantity;
    }

    public static void main(String[] args) {
        Worker w = new Worker();
        w.setSalary();
        w.setCommission();
        w.setQuantity();
        System.out.println("普通员工：" + w);
        System.out.println("薪资为：" + w.earnings());

    }
}
