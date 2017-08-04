package weatherApp;

public class Weather {
	private int stationId;
	private String available;
	private int count;
	private int temperature;
	private int rain;
	
	public Weather(int stationId, String available, int count, int temperature, int rain) {
		this.stationId = stationId;
		this.available = available;
		this.count = count;
		this.temperature = temperature;
		this.rain = rain;
	}
	
	public int getStationId() {
		return stationId;
	}
	
	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getRain() {
		return rain;
	}

	public void setRain(int rain) {
		this.rain = rain;
	}
	
	public Weather(){
		
	}

}

