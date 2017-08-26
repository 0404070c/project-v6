package weatherApp;

import weatherApp.Weather;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherApp {
	
	//MAP /WEATHER TO NEW COLLECTED JSON
	@RequestMapping(value = "/weather", 
			produces = { MediaType.APPLICATION_JSON_VALUE }, 
			method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Weather>> getWeathers() {
		List<Weather> weathers = collectWeather();
		return new ResponseEntity<List<Weather>>(weathers, HttpStatus.OK);
	}
	
	//TEST
	@RequestMapping(
			method = RequestMethod.GET,
            value="/test")
	public String test(){
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject("http://35.193.192.238:8080/weather", String.class);
		return result;
	}
	
	//GET JSON DATA FROM WEATHERCOLLECTOR
	private List<Weather> collectWeather() {
		RestTemplate restTemplate = new RestTemplate();
		
		Weather stationOne = restTemplate.getForObject("http://35.192.230.250:8000/1", Weather.class);
		int idOne = stationOne.getStationId();
		String statusOne = stationOne.getStatus();
	    int temperatureOne = stationOne.getTemperature();
	    int rainOne = stationOne.getRain();
	    int identitiyOne = stationOne.getIdentity();
	    int countOne = stationOne.getCount();
	    Weather weather1 = new Weather(idOne, statusOne, temperatureOne, rainOne, identitiyOne, countOne);
		
		Weather stationTwo = restTemplate.getForObject("http://35.192.230.250:8000/2", Weather.class);
		int idTwo = stationTwo.getStationId();
	    String statusTwo = stationTwo.getStatus();
	    int temperatureTwo = stationTwo.getTemperature();
	    int rainTwo = stationTwo.getRain();
	    int identityTwo = stationTwo.getIdentity();
	    int countTwo = stationTwo.getCount();
	    Weather weather2 = new Weather(idTwo, statusTwo, temperatureTwo, rainTwo, identityTwo, countTwo);
	    
		Weather stationThree = restTemplate.getForObject("http://35.192.230.250:8000/3", Weather.class);
	    int idThree = stationThree.getStationId();
	    String statusThree = stationThree.getStatus();
	    int temperatureThree = stationThree.getTemperature();
	    int rainThree = stationThree.getRain();
	    int identitiyThree = stationThree.getIdentity();
	    int countThree = stationThree.getCount();
		Weather weather3 = new Weather(idThree, statusThree, temperatureThree, rainThree, identitiyThree, countThree);
	    
		//ADD COLLECTED DATA TO NEW ARRAYLIST
		List<Weather> collection = new ArrayList<>();
			collection.add(weather1);
			collection.add(weather2);
			collection.add(weather3);
		return collection;
	}

}
	
/*
package weatherApp;

import weatherApp.Weather;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherApp {
	
	//MAP /WEATHER TO NEW COLLECTED JSON
	@RequestMapping(value = "/weather", 
			produces = { MediaType.APPLICATION_JSON_VALUE }, 
			method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Weather>> getWeathers() {
		List<Weather> weathers = collectWeather();
		return new ResponseEntity<List<Weather>>(weathers, HttpStatus.OK);
	}
	
	//GET JSON DATA FROM WEATHERCOLLECTOR
	private List<Weather> collectWeather() {
		RestTemplate restTemplate = new RestTemplate();
		Weather stationOne = restTemplate.getForObject("http://35.192.230.250:8000/1", Weather.class);
		Weather stationTwo = restTemplate.getForObject("http://35.192.230.250:8000/2", Weather.class);
		Weather stationThree = restTemplate.getForObject("http://35.192.230.250:8000/3", Weather.class);
		
		int idOne = stationOne.getStationId();
		String statusOne = stationOne.getStatus();
	    int temperatureOne = stationOne.getTemperature();
	    int rainOne = stationOne.getRain();
	    int identitiyOne = stationOne.getIdentity();
	    int countOne = stationOne.getCount();
	    
	    int idTwo = stationTwo.getStationId();
	    String statusTwo = stationTwo.getStatus();
	    int temperatureTwo = stationTwo.getTemperature();
	    int rainTwo = stationTwo.getRain();
	    int identityTwo = stationTwo.getIdentity();
	    int countTwo = stationTwo.getCount();
	    
	    int idThree = stationThree.getStationId();
	    String statusThree = stationThree.getStatus();
	    int temperatureThree = stationThree.getTemperature();
	    int rainThree = stationThree.getRain();
	    int identitiyThree = stationThree.getIdentity();
	    int countThree = stationThree.getCount();
	    
	    Weather weather1 = new Weather(idOne, statusOne, temperatureOne, rainOne, identitiyOne, countOne);
		Weather weather2 = new Weather(idTwo, statusTwo, temperatureTwo, rainTwo, identityTwo, countTwo);
		Weather weather3 = new Weather(idThree, statusThree, temperatureThree, rainThree, identitiyThree, countThree);
	    
		//ADD COLLECTED DATA TO NEW ARRAYLIST
		List<Weather> collection = new ArrayList<>();
			collection.add(weather1);
			collection.add(weather2);
			collection.add(weather3);
		
		return collection;
	}

}
	
*/