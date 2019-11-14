//First.java
package cn.edu.zucc;
public class First{
  public int i =100;
  protected int j = 200;
  private int k = 300;
  int m = 400;
  public void show1(){
  	System.out.println("cn.edu.zucc.First类中的show1()方法");  	
  }  
  protected void show2(){
  	System.out.println("cn.edu.zucc.First类中的show2()方法");  	
  }
  private void show3(){
  	System.out.println("cn.edu.zucc.First类中的show3()方法");  	
  }
  void show4(){
  	System.out.println("cn.edu.zucc.First类中的show4()方法");  	
  }
  public static void main(String[] args){
  	System.out.println("cn.edu.zucc.First类中的main方法");
  }
}
class A{
  public void show(){
  	System.out.println("cn.edu.zucc.A类中的show方法");
  }
}
