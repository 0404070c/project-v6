package weatherStation;

public class Weather {
	
	private int stationId;
	private int count;
	private int temperature;
	private int rain;
	
	public Weather(int stationId, int count, int temperature, int rain) {
		//super();
		this.stationId = stationId;
		this.count = count;
		this.temperature = temperature;
		this.rain = rain;
	}
	
	public int getStationId() {
		return stationId;
	}
	
	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	public int getRain() {
		return rain;
	}

	public void setRain(Integer rain) {
		this.rain = rain;
	}

	@Override
	public String toString() {
		return "Weather [stationId=" + stationId + ", count=" + count + ", temperature=" + temperature + ", rain=" + rain + "]";
	}

}
