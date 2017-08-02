package weatherApp;



import weatherApp.Weather;



import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherApp {
	
	@RequestMapping("/test")
    public String test(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "test";
    }

	@RequestMapping(value = "/weather", 
			produces = { MediaType.APPLICATION_JSON_VALUE }, 
			method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Weather>> getWeathers() {
		List<Weather> weathers = collectWeather();
		return new ResponseEntity<List<Weather>>(weathers, HttpStatus.OK);
	}
	
	private List<Weather> collectWeather() {
		RestTemplate restTemplate = new RestTemplate();
		Weather stationOne = restTemplate.getForObject("http://localhost:8000/stationOne", Weather.class);
		Weather stationTwo = restTemplate.getForObject("http://localhost:8000/stationTwo", Weather.class);
		Weather stationThree = restTemplate.getForObject("http://localhost:8000/stationThree", Weather.class);
		
		int idOne = stationOne.getStationId();
	    int countOne = stationOne.getCount();
	    int temperatureOne = stationOne.getTemperature();
	    int rainOne = stationOne.getRain();
	    
	    int idTwo = stationTwo.getStationId();
	    int countTwo = stationTwo.getCount();
	    int temperatureTwo = stationTwo.getTemperature();
	    int rainTwo = stationTwo.getRain();
	    
	    int idThree = stationThree.getStationId();
	    int countThree = stationThree.getCount();
	    int temperatureThree = stationThree.getTemperature();
	    int rainThree = stationThree.getRain();
	    
	    Weather weather1 = new Weather(idOne, countOne, temperatureOne, rainOne);
		Weather weather2 = new Weather(idTwo, countTwo, temperatureTwo, rainTwo);
		Weather weather3 = new Weather(idThree, countThree, temperatureThree, rainThree);
	    
		List<Weather> collection = new ArrayList<>();
		collection.add(weather1);
		collection.add(weather2);
		collection.add(weather3);
		
		return collection;
	}

	public List<Weather> getDummyWeathers() {
		
		Weather weather1 = new Weather(1, 3, 1, 89);
		Weather weather2 = new Weather(2, 7, 32, 66);
		Weather weather3 = new Weather(3, 6, 12, 77);
		
		List<Weather> weathers = new ArrayList<>();
		weathers.add(weather1);
		weathers.add(weather2);
		weathers.add(weather3);
		
		return weathers;
		
	}

}
	


























	/*
	 

	@RequestMapping( 
			method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            value="/"
            )
	public String getWeather(){
		RestTemplate restTemplate = new RestTemplate();
    	String getWeather = restTemplate.getForObject("http://localhost:8000/stationOne", String.class);

    	return getWeather;
    	
	}
	 */
	

	
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
		
