//First.java
package cn.edu.zucc;
public class First{
  public int i =100;
  protected int j = 200;
  private int k = 300;
  int m = 400;
  public void show1(){
  	System.out.println("cn.edu.zucc.First���е�show1()����");  	
  }  
  protected void show2(){
  	System.out.println("cn.edu.zucc.First���е�show2()����");  	
  }
  private void show3(){
  	System.out.println("cn.edu.zucc.First���е�show3()����");  	
  }
  void show4(){
  	System.out.println("cn.edu.zucc.First���е�show4()����");  	
  }
  public static void main(String[] args){
  	System.out.println("cn.edu.zucc.First���е�main����");
  }
}
class A{
  public void show(){
  	System.out.println("cn.edu.zucc.A���е�show����");
  }
}
