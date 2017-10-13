package businessObjects;

public class Weather {

	private String cityName;
	private String stateName;
	private int highTemp;
	private int lowTemp;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getHighTemp() {
		return highTemp;
	}

	public void setHighTemp(int highTemp) {
		this.highTemp = highTemp;
	}

	public int getLowTemp() {
		return lowTemp;
	}

	public void setLowTemp(int lowTemp) {
		this.lowTemp = lowTemp;
	}

	// public class testHighTemp {
	// if(highTemp>180)
	// {
	// return "Temperature is too high";
	// }
	// else
	// {
	// DAOtidatabase.save()
	// return "High temp is within range";
	// }
	// }
	//
	// public class testLowTemp {
	// if(lowTemp<-30)
	// {
	// return "Temperature is too low";
	// else
	// return "Low temp is within range";
	// }
	// }

}
