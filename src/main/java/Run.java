import java.io.*;
//import java.util.Scanner;

public class Run {

    private String name ;
    private int age;
    private double height;
    private double weight;

    public Run(){
        //	this.name = "jack";
        //	this.age = 30;
        //	this.height = 1.8;
        //	this.weight =80;
    }

    public Run(String name1,int age1,double height1,double weight1){

        this.name =name1;
        this.age =age1;
        this.height =height1;
        this.weight = weight1;
    }

    void set(){
        Run s1 =new Run();
        boolean valid =false;
        boolean vali =false;
        boolean val = false;
        boolean va = false;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (!valid){
            try{
                System.out.println("please input your name:");
                s1.name= in.readLine();
                valid =true;
            }catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("input name mistake ,please try again");
            }
            catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
                System.out.println("starded input name mistake");
            }
        }

        while(!vali){
            try{
                System.out.println("please input your age:");
                s1.age =Integer.parseInt(in.readLine());
                vali =true;
            }catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("input age "
                        + "mistake ,please try again");
            }
            catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
                System.out.println("starded input age mistake");
            }

        }
        while(!val){
            try{
                System.out.println("please input your height:");
                s1.height =Double.parseDouble(in.readLine());
                val=true;
            }catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("input height mistake ,please try again");
            }
            catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
                System.out.println("starded input height mistake");
            }
        }

        while(!va){
            try{
                System.out.println("please input your weight:");
                s1.weight= Double.parseDouble(in.readLine());
                va =true;
            }catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("input weight mistake ,please try again");
            }
            catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
                System.out.println("starded input weight mistake");
            }
        }

    }

    //

    //age = s1.nextInt();
    //height =s1.nextDouble();
    //weight =s1.nextDouble();


    public double Bmivalue() {
        return weight/(height*height);
    }

    public double Stdweight(){
        return 22*height*height;
    }

    public double ObesityDegree(){
        return (weight-Stdweight())/Stdweight()*100;
    }

    public String Conclusion(){
        if(ObesityDegree()<-10)
            return "thin";
        if(ObesityDegree()<-20){
            if(Bmivalue()<24.2)
                return "normal";
            else
                return "overweight";
        }
        else
            return "fat";
    }

    public String toString(){
        return "name:"+name+"age:"+age+""+Conclusion();
    }

    public static void main(String args[]) {
        //	Run p1 =new Run();
        //	System .out.println(p1);

        //	Run p2 =new Run("rose",20,1.6,45);
        //	System.out.println(p2);

        Run p3 = new Run();
        p3.set();
        System .out.println(p3.Conclusion());

    }
}