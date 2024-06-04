package com.abstraction;

  class B extends A{
public void print() {
	System.out.println("From B");
}
public static void main(String[] args) {
	A obj=new B();
	//obj.print();
}
}
