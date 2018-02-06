package chapter2;

public class CurrentConditionsDisplay implements Observer,DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("現在の気象状況：温度"+ temperature +"度"
				+ " 湿度 "+ humidity + "%");
		
	}

}
