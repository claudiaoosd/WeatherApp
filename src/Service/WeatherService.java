package Service;

import java.io.IOException;

import DAO.DAOtidatabase;
import businessObjects.Weather;

public class WeatherService {
	
	
	public String saveWeather(Weather weather) throws IOException {
		
		DAOtidatabase db = new DAOtidatabase();
		
		if(weather.getHighTemp() >180)
			 {
			 return "Temperature is too high";
			 }
		
		else if(weather.getLowTemp() < -30) {
			return "Temperature is too low";
		}
		
		else {
			db.save(weather);
			return "you have successfully saved weather info";
		}
		
	
		
	}

}
