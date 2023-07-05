package pizza.pizza;

public abstract class Pizza {
	
	protected String name;
	
	public void prepare() {
		System.out.println(name + "피자 준비중~");
	}
	
	public void bake() {
		System.out.println(name + "피자 굽는 중~");
	}
	
	public void cut() {
		System.out.println(name + "피자 자르는 중~");
	}
	
	public void box() {
		System.out.println(name + "피자 포장 중~");
	}
	
	public String getName() {
		return name;
	}
}
