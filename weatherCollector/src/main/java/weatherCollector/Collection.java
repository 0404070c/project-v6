package weatherCollector;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Collection {
	@JsonProperty("stationId")
	private int stationId;
	@JsonProperty("count")
	private int count;
	
	
	public Collection(int stationId, int count) {
		this.stationId = stationId;
		this.count = count;
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
	
	public Collection(){
		
	}
}
