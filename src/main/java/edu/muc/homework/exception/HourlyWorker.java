package edu.muc.homework.exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HourlyWorker extends Employee {
    private double wage;
    private double hours;

    HourlyWorker() {
        super.toString();
        super.firstname = "明";
        super.lastname = "李";
    }

    void setWage() {
        BufferedReader wa = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入计时工人的每小时工资：");
        try {
            wage = Integer.parseInt(wa.readLine());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    void setHours() {
        BufferedReader time = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入计时工人的工作时间：");
        try {
            hours = Integer.parseInt(time.readLine());
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
        return wage * hours;
    }

    public static void main(String[] args) {
        HourlyWorker h = new HourlyWorker();
        h.setHours();
        h.setWage();
        System.out.println("计时工人：" + h + "\t薪资为：" + h.earnings());
    }

}
