package weatherCollector;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
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
	
	public void setStationId(int stationId) {
		this.stationId = stationId;
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
