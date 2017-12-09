package chapter1;

public abstract class Duck {
	public String quack() {
		return "グェーーーー";
	}
	public String swim() {
		return "スイスイ〜♪";
	}
	public String fly() {
		return "パタパタ";
	}
	
	public abstract void display();
}
