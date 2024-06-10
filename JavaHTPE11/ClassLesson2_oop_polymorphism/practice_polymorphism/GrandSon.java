package JavaHTPE11.ClassLesson2_oop_polymorphism.practice_polymorphism;

public class GrandSon extends Son {
	private int _z;
	
	public GrandSon(int x, int y, int z) {
		super(x, y);
		_z = z;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.print("GrandSon: public boolean equals(Object obj)");
		return true;
	}
	
	
	public boolean equals(Father obj) {
		System.out.print("GrandSon: public boolean equals(Father obj)");	
		return true;
	}
	
	public boolean equals(GrandSon obj) {
		System.out.print("GrandSon: public boolean equals(GrandSon obj)");
		
		return true;
	}
	
	public void bar(int x, int y) {
		System.out.print("GrandSon: public void bar(int x, int y)");
	}
}
