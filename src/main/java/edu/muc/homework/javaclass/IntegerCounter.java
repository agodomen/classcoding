package edu.muc.homework.javaclass;

import java.util.Random;

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
public class IntegerCounter {
	
	//定义一维数组用于存储随机的整数
	int[] number=new int[1000];
	
	//定义用于存储整数的出现次数
	int[] counter=new int[101];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerCounter integerCount=new IntegerCounter();
		int N=1000;
		int n=0;
		for(int i=0;i<N;i++){
			//生成在1到100之间的整数
			n=(int)Math.floor((Math.random()*100+1));
			//存储随机生成的n
			integerCount.number[i]=n;
			//对出现的数进行统计，加一个出现运算
			integerCount.counter[n]+=1;
		}
		//打印输出生成的随机数
		System.out.println("\t*****生成的随机数*****");
		System.out.print(integerCount.number[0]);
		for(int i=1;i<N;i++){
			if(i%49==0){
				System.out.print("\n"+integerCount.number[i]);
			}else{
				System.out.print(" "+integerCount.number[i]);
			}
		}
		System.out.println("\n\t*****统计随机数*****");
		for(int i=1;i<=100;i++){			
			if(integerCount.counter[i]!=0)
				System.out.println(i+"出现的次数:"+integerCount.counter[i]);
		}
	}
	
	

}
