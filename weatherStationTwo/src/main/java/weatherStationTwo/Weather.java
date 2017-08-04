package weatherStationTwo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
	@JsonProperty("stationId")
	private int stationId;
	@JsonProperty("available")
	private String available;
	@JsonProperty("count")
	private int count;
	@JsonProperty("temperature")
	private int temperature;
	@JsonProperty("rain")
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

}
