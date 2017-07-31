package weatherApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
	@JsonProperty("stationOneId")
	private int stationOneId;
	@JsonProperty("stationOneCount")
	private int stationOneCount;
	@JsonProperty("stationOneTemperature")
	private int stationOneTemperature;
	@JsonProperty("stationOneRain")
	private int stationOneRain;
	@JsonProperty("stationTwoId")
	private int stationTwoId;
	@JsonProperty("stationTwoCount")
	private int stationTwoCount;
	@JsonProperty("stationTwoTemperature")
	private int stationTwoTemperature;
	@JsonProperty("stationTwoRain")
	private int stationTwoRain;
	@JsonProperty("stationThreeId")
	private int stationThreeId;
	@JsonProperty("stationThreeCount")
	private int stationThreeCount;
	@JsonProperty("stationThreeTemperature")
	private int stationThreeTemperature;
	@JsonProperty("stationThreeRain")
	private int stationThreeRain;
	
	public Weather(int stationOneId, int stationOneCount, int stationOneTemperature, int stationOneRain,
			int stationTwoId, int stationTwoCount, int stationTwoTemperature, int stationTwoRain, int stationThreeId,
			int stationThreeCount, int stationThreeTemperature, int stationThreeRain) {
		super();
		this.stationOneId = stationOneId;
		this.stationOneCount = stationOneCount;
		this.stationOneTemperature = stationOneTemperature;
		this.stationOneRain = stationOneRain;
		this.stationTwoId = stationTwoId;
		this.stationTwoCount = stationTwoCount;
		this.stationTwoTemperature = stationTwoTemperature;
		this.stationTwoRain = stationTwoRain;
		this.stationThreeId = stationThreeId;
		this.stationThreeCount = stationThreeCount;
		this.stationThreeTemperature = stationThreeTemperature;
		this.stationThreeRain = stationThreeRain;
	}



	public int getStationOneId() {
		return stationOneId;
	}

	public void setStationOneId(int stationOneId) {
		this.stationOneId = stationOneId;
	}

	public int getStationOneCount() {
		return stationOneCount;
	}

	public void setStationOneCount(int stationOneCount) {
		this.stationOneCount = stationOneCount;
	}

	public int getStationOneTemperature() {
		return stationOneTemperature;
	}

	public void setStationOneTemperature(int stationOneTemperature) {
		this.stationOneTemperature = stationOneTemperature;
	}

	public int getStationOneRain() {
		return stationOneRain;
	}

	public void setStationOneRain(int stationOneRain) {
		this.stationOneRain = stationOneRain;
	}

	public int getStationTwoId() {
		return stationTwoId;
	}

	public void setStationTwoId(int stationTwoId) {
		this.stationTwoId = stationTwoId;
	}

	public int getStationTwoCount() {
		return stationTwoCount;
	}

	public void setStationTwoCount(int stationTwoCount) {
		this.stationTwoCount = stationTwoCount;
	}

	public int getStationTwoTemperature() {
		return stationTwoTemperature;
	}

	public void setStationTwoTemperature(int stationTwoTemperature) {
		this.stationTwoTemperature = stationTwoTemperature;
	}

	public int getStationTwoRain() {
		return stationTwoRain;
	}

	public void setStationTwoRain(int stationTwoRain) {
		this.stationTwoRain = stationTwoRain;
	}

	public int getStationThreeId() {
		return stationThreeId;
	}

	public void setStationThreeId(int stationThreeId) {
		this.stationThreeId = stationThreeId;
	}

	public int getStationThreeCount() {
		return stationThreeCount;
	}

	public void setStationThreeCount(int stationThreeCount) {
		this.stationThreeCount = stationThreeCount;
	}

	public int getStationThreeTemperature() {
		return stationThreeTemperature;
	}

	public void setStationThreeTemperature(int stationThreeTemperature) {
		this.stationThreeTemperature = stationThreeTemperature;
	}

	public int getStationThreeRain() {
		return stationThreeRain;
	}

	public void setStationThreeRain(int stationThreeRain) {
		this.stationThreeRain = stationThreeRain;
	}

	public Weather(){
		
	}

}
