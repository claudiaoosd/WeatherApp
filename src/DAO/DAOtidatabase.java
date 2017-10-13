package DAO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import businessObjects.Weather;

public class DAOtidatabase {

	public void save(Weather weather) throws IOException {
		
		FileOutputStream out = new FileOutputStream("C:\\Workspace\\WeatherDemo\\weatherdata\\weatherInfo.txt");
		String weatherInfo = weather.getCityName() + weather.getStateName() + weather.getHighTemp() + weather.getLowTemp();
		out.write(weatherInfo.getBytes());
		out.close();
		
		//assume that the weather data is being saved in weather table in weather data base
		
	}
}
