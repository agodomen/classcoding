package edu.muc.homework.javaclass;
/**
 * 
 */

/**
 * @author yj
 * 用于测试Student类的功能
 *
 */
public class Test {

	/**
	 *  主函数
	 */
	public static void main(String[] args) {
		double[] score={77,97,91,99,87,93};
		Student student=new Student("14048035","小明",score);
		//显示学生信息
		System.out.println(student.toString());
		
		
		//输入新的分数
		double[] newScore={91,93,99,95,89,87};
		//设置新的分数
		student.setScore(newScore);
		//显示学生信息
		System.out.println(student.toString());
	}

}
