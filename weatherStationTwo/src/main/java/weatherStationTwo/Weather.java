package weatherStationTwo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
	@JsonProperty("stationId")
	private int stationId;
	@JsonProperty("status")
	private String status;
	@JsonProperty("temperature")
	private int temperature;
	@JsonProperty("rain")
	private int rain;
	@JsonProperty("identity")
	private int identity;
	@JsonProperty("count")
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

}
