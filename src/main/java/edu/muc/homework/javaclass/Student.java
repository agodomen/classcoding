package edu.muc.homework.javaclass;

import java.util.Arrays;
import java.util.Scanner;
/**
 * File Name : classcoding - edu.muc.homework.exception
 * CopyRright (c) 1949-xxxx:
 * File Number：
 * Author：gwd
 * Date：on 5/1/17
 * Modify：gwd
 * Time ：
 * Comment：定义的学生类，包括: 学生的学号(id), 学生的姓名(name), 学生的成绩(score[6])
 * Description：
 * Version：
 */

public class Student {
	// 定义学生的学号
	String id;
	// 定义学生的姓名
	String name;
	// 定义学生的年龄（按照要求变量名）
	int nextInt;
	// 定义学生的身高（按照要求变量名）
	double nextDouble;
	
	// 定义学生6门成绩的数组存储
	double[] score = new double[6];
	
	//设置平均成绩变量
	double averageScore=0;

	// 定义学生的缺省构造方法
	public Student() {

	}
	
	// 实现从键盘输入分数
	public void inputScore(){
		System.out.println("\t*****开始进行分数录入*****");
		Scanner scanner=new Scanner(System.in);
		double sum=0;
		for(int i=0;i<score.length;i++){
			System.out.print("请输入第"+i+"门成绩：");
			score[i]=scanner.nextDouble();
			sum+=score[i];
		}
		//计算学生成绩平均分
		averageScore=sum/score.length;
		//关闭数据流
		scanner.close();
	}	

	//设置年龄
	public void setNextInt(int nextInt){
		this.nextInt=nextInt;
	}
	
	//设置身高
	public void setNextDouble(double nextDouble){
		this.nextDouble=nextDouble;
	}
	
	// 设计带参数的构造方法
	public Student(String id, String name, double[] score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	// 设计函数，可以实现对分数的输入
	public void setScore(double[] score) {
		this.score = score;
	}

	// 设计函数，实现对求解平均值
	public double getAverageSocre() {
		// 初始化课门成绩和
		double sum = 0;
		// 初始化课平均值
		double average = 0;
		// 或得成绩课数
		int length = score.length;

		for (int i = 0; i < length; i++) {
			// 遍历所有门课，进行成绩的求和操作
			sum += score[i];
		}
		// 求解平均值
		average = sum / length;
		return average;

	}

	/**
	 * 使用toString方法实现对基本信息的显示
	 */
	@Override
	public String toString() {
		String s = "\t*****学生的基本信息*****\n" + "学号：" + id + "\t姓名：" + name+"\n年龄："+nextInt+"岁\t身高："+nextDouble+"米";
		// 或得成绩课数
		int length = score.length;
		
		for (int i = 0; i < length; i++) {
			// 遍历学生成绩
			s=s+"\n第"+(i+1)+"课成绩："+score[i];
		}
		
		s=s+"\n学生的平均分为:"+averageScore;
		
		return s;
	}

}

/**
 * @author yj
 * 用于测试Student类的功能模块
 *
 */
class TestRun {

	/**
	 *  主函数，可以启动运行
	 */
	public static void main(String[] args) {
		double[] score=new double[6];
		Student student=new Student("14048035","小明",score);		
		//输入分数
		double[] newScore={91,93,99,95,89,87};	
		//设置年龄
		student.setNextInt(20);
		//设置身高
		student.setNextDouble(1.63);
		//设置新的分数
		student.setScore(newScore);
		
		//实现键盘输入分数
		student.inputScore();
		
		//显示学生信息
		System.out.println(student.toString());
	}

}