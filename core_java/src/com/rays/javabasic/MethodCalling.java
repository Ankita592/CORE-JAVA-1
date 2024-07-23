package com.rays.javabasic;

public class MethodCalling {
      public void sum(int a , int b ) {
    	  System.out.println("sum="+ (a+b));
      }
      public void multi(int a, int b) {
    	  System.out.println("multi="+(a*b));
      }
      public void divide(int a, int b) {
    	  System.out.println("divide="+(a/b));
      }
      public void minus(int a, int b) {
    	  System.out.println("minus="+ (a-b));
      }
      public static void main(String[] args) {
		MethodCalling m = new MethodCalling ();
	    m.sum (5 , 12);
	    m. multi(3,9);
	    m.divide(18,5);
	    m.minus(5,3);
	}
}
