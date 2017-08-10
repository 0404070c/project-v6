package weatherApp;

public class Weather {
	private int stationId;
	private String status;
	private int temperature;
	private int rain;
	private int identity;
	private int count;
	
	public Weather(int stationId, String status, int temperature, int rain, int identity, int count) {
		this.stationId = stationId;
		this.status = status;
		this.temperature = temperature;
		this.rain = rain;
		this.identity = identity;
		this.count = count;
	}
	
	public int getStationId() {
		return stationId;
	}
	
	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
	
	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public Weather(){
		
	}

}
