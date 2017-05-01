package edu.muc.homework.javaclass;

import java.util.Arrays;
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
public class Score {
	
	
	
	public String rankScore(int[] score) {
		// 进行分数排序
		Arrays.sort(score);
		String s="";
		int c=0;
		for(int i=score.length-1;i>=0;i--){
			if(score[i]>=0&&score[i]<=100&&c<=3){
				s=s+score[i]+"\n";
				c++;
			}else
				continue;
		}
		if(c<3)
			return null;
		return s;
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//存储考试的成绩
		int[] scoreArray = { 89, -23, 64, 91, 119, 52, 73 };
		Score score=new Score();
		String s=score.rankScore(scoreArray);
		if(s!=null){
			System.out.println("考试成绩的前三名为：");
			System.out.println(s);
		}else{
			System.out.println("有效成绩的个数小于3个");
		}
	}

}
