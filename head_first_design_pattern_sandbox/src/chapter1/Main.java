package chapter1;

public class Main {
	public static void main(String args[]) {
		Duck duck = new MallardDuck();
		duck.display();
		System.out.println(duck.swim());
		duck.performFly();
		duck.performQuack();
	
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
	

}
