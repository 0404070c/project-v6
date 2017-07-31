package weatherApp;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class WeatherApp {


	
	@RequestMapping( 
			method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            value="/"
            )
	public String getWeather(){
		RestTemplate restTemplate = new RestTemplate();
    	String getWeather = restTemplate.getForObject("http://localhost:8000/", String.class);

    	return getWeather;
	}
	
	
	

	
	/*
	private String test(){
	String url = "http://localhost:8000/";
	RestTemplate restTemplate = new RestTemplate();
	Weather[] response  = restTemplate.getForObject(url, Weather[].class);
	return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(
		    new Weather(list));
	}
	*/
	/*
	private List<Weather> collectWeather() {
		RestTemplate restTemplate = new RestTemplate();
		Weather allStations = restTemplate.getForObject("http://localhost:8000/", Weather[].class);
		
		int idOne = allStations.getStationOneId();
	    int countOne = allStations.getStationOneCount();
	    int temperatureOne = allStations.getStationOneTemperature();
	    int rainOne = allStations.getStationOneRain();
	    
	    int idTwo = allStations.getStationTwoId();
	    int countTwo = allStations.getStationTwoCount();
	    int temperatureTwo = allStations.getStationTwoTemperature();
	    int rainTwo = allStations.getStationTwoRain();
	    
	    int idThree = allStations.getStationThreeId();
	    int countThree = allStations.getStationThreeCount();
	    int temperatureThree = allStations.getStationThreeTemperature();
	    int rainThree = allStations.getStationThreeRain();
	    
		List<Weather> collection = new ArrayList<>();
		collection.add(new Weather(idOne, countOne, temperatureOne, rainOne,idTwo, countTwo, temperatureTwo, rainTwo, idThree, countThree, temperatureThree, rainThree));
	
		
		//System.out.println(idOne);
		return collection;
	}
	*/
		
}