package spring.duck.ducks;

import spring.duck.flyBehavior.FlyWithWings;
import spring.duck.quackBehavior.MuteQuack;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new MuteQuack();
	}

	public void display() {
		System.out.print("나는 decoy duck : ");
	}
}
