package com.mypack;

public class MethodReferencepractice {
	
	void testMethod(Screen screen,String sample) {
		screen.show(sample);
	}
	
	void display(String s) {
		System.out.println("babloo.............");
	}

	public static void main(String[] args) {
		MethodReferencepractice ob = new MethodReferencepractice();
		ob.testMethod(ob::display, "suf");

	}

}

interface Screen{
	void show(String s);
}
