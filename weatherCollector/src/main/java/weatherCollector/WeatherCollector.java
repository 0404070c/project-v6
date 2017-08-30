package weatherCollector;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import weatherCollector.Weather;

@RestController
public class WeatherCollector {
	
	//STANDARD MESSAGE
	@CrossOrigin
	@RequestMapping(
			method = RequestMethod.GET,
            value="/")
	public String message(){
		return ("This is the collector service.");
	}
	
	//COLLECT DATA FROM ALL WEATHER STATIONS AND ADD TO ARRAYLIST
	@CrossOrigin
	@RequestMapping(value = "/weather", 
			produces = { MediaType.APPLICATION_JSON_VALUE }, 
			method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Weather>> weatherStations(ArrayList<String> message){
		
		//LIST OF THE REST API ENDPOINTS FOR EACH WEATHER SERVICE.
		//TO ADD A NEW STATION, SIMPLY INCLUDE IP ADDRESS HERE.
		ArrayList<String> stationList = new ArrayList<String>();
		stationList.add("http://35.202.53.47:8001/");
		stationList.add("http://35.202.127.198:8002/");
		stationList.add("http://35.188.76.15:8003/");
		
		List<Weather> collection = new ArrayList<>();
		
		//LOOP THROUGH LIST OF WEATHER STATIONS.
		for (int i = 0; i < stationList.size(); i++) {
			//MAKE SURE SERVICE IS AVAILABLE.
			try {
			RestTemplate restTemplate = new RestTemplate();
			String url = stationList.get(i);
			Weather station = restTemplate.getForObject(url, Weather.class);
			
			int stationId = station.getStationId();
			String status = station.getStatus();
		    int temperature = station.getTemperature();
		    int rain = station.getRain();
		    int identity = station.getIdentity();
		    int count = station.getCount();
		    
		    //ADD NEW WEATHER STATION OBJECT TO COMBINED JSON.
		    Weather weatherStation = new Weather(stationId, status, temperature, rain, identity, count);
		    collection.add(weatherStation);
		}
			//ADD EMPTY OBJECT IF STATION IS UNAVAILABLE
			catch (Exception e) {
				int unavailableId = i+1;
				Weather unavailableStation = new Weather(unavailableId, "Unavailable", 0, 0, 0, 0);
			    collection.add(unavailableStation);
			} 
		}
		//RETURN COLLECTED JSON.
		return new ResponseEntity<List<Weather>>(collection, HttpStatus.OK);
	}	
}
