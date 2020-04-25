package com.mypack;

class Parent{
	public void p() {
		
	}
}
public class InnerClassPractice extends Parent {

	public void display() {
		System.out.println("in display");
	}
	
	public void test() {
		Intf1 i1 = new Intf1() {
			
			@Override
			public void show() {
				this.sex();
				//System.out.println(super.p);
			}
			
			public void sex() {
				System.out.println("sex");
			}
			
		};
		
		i1.show();
		this.display();
	}
	
	public static void main(String[] args) {
		//new InnerClassPractice().test();
		
		Intf1 i2 = () -> System.out.println("Lambda");
		i2.show();
		
		Intf2 i3 = System.out::println;
		i3.show("sufyan");
	}

}
