package chapter1;

public abstract class Duck {
	
	FlyBhehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public String swim() {
		return "スイスイ〜♪";
	}
	
	
	public abstract void display();
	
	public void performQuack() {
		quackBehavior.quack();
	}
	public void performFly() {
		flyBehavior.fly();
	}
	public void setFlyBehavior(FlyBhehavior fb) {
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
