package JavaHTPE11.ClassLesson2_oop_polymorphism.practice_polymorphism;

public class GrandFather {
	protected int _x;
	
	public GrandFather(int x) {
		_x = x;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.print("GrandFather: public boolean equals(Object obj)");
		
		return true;
	}
	
	public void foo(int x) {
		System.out.print("GrandFather: public void foo(int x)");
	}
}
