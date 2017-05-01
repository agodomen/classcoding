# 说明

修改此程序，从键盘输入年龄、身高、体重，确保输入的年龄、身高、体重为数值类型，如输入错误，重新输入.

```
import java.util.*;
public class Person {
	   private String name = null;
	   private int age = 0;
	   private double height = 0;
	   private double weight = 0;
	   
	   public Person(){
	         this.name="jack";
	         this.age=30;
	         this.height=1.8;
	         this.weight=80;
	   }

	   public Person(String name1,int age1,double height1,double weight1){
	         name=name1;
	         age=age1;
	         height=height1;
	         height=weight1;
	}
 void set()
 {
	 Scanner s1=new Scanner(System.in);
		 name=s1.nextLine();
		 age=s1.nextInt();
		 height=s1.nextDouble();
		 height=s1.nextDouble();

 }
	   public double Bmivalue(){
	       return weight/(height*height);
	   }
	   public double StdWeight(){
	       return 22*height*height;
	   }
	   public double ObesityDegree(){
	      return (weight-StdWeight())/StdWeight()*100;
	   }
	   public String Conclusion(){
		      if(ObesityDegree()<-10)     
		             return "瘦";
		      else
		      if(ObesityDegree()<20){
		           if(Bmivalue()<24.2)      
		              return "普通";
		           else    
		              return "超重";
		      }
		       else  
		             return "肥胖";
		   }
	   public String toString()
	   {
		   return "姓名："+name+"年龄："+age+" " +Conclusion();
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person p1=new Person();
		System.out.println(p1);
		
		
		Person p2=new Person("rose",20,1.6,45);		
		System.out.println(p2);
		
		Person p3=new Person();
		p3.set();		
		System.out.println(p3.Conclusion());
	}

}
```
