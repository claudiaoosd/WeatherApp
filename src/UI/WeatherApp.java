package UI;

import java.io.IOException;
import java.util.Scanner;

import Service.WeatherService;
import businessObjects.Weather;

public class WeatherApp {
	
	
	//since we don't have a web app yet, let's use console
	public static void main(String[] args) throws IOException {
		
		System.out.println("Please enter city");
		String city = new Scanner(System.in).nextLine();
		
		System.out.println("Please enter state");
		String state = new Scanner(System.in).nextLine();
		
		System.out.println("Please enter high");
		int high = new Scanner(System.in).nextInt();
		
		System.out.println("Please enter low");
		int low = new Scanner(System.in).nextInt();
		
		Weather weather = new Weather();
		weather.setCityName(city);
		weather.setStateName(state);
		weather.setHighTemp(high);
		weather.setLowTemp(low);
		
		WeatherService weatherService = new WeatherService();
		
		System.out.println(weatherService.saveWeather(weather));
		
		
	}

}
