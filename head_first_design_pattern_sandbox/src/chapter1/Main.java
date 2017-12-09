package chapter1;

public class Main {
	public static void main(String args[]) {
		Duck duck = new MallardDuck();
		duck.display();
		System.out.println(duck.swim());
		System.out.println(duck.quack());
		System.out.println(duck.fly());
		}

}
