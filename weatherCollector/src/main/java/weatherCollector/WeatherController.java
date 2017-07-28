package weatherCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class WeatherController {
	
	//private Random value = new Random(); 
	//private int count = 1;
	
	//private int stationId = 100000 + value.nextInt(900000);
	//private int temperature = 0 + value.nextInt(100);
	//private int rain = 0 + value.nextInt(100);
/*
	@RequestMapping( 
			method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            value="/"
            )
	public Weather weather() {
        return new Weather(stationId, count++, temperature, rain);
    }
	*/
	/*
	@RequestMapping( 
			method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            value="/"
            )
	public Weather weather() {
		RestTemplate restTemplate = new RestTemplate();
		Weather stationOne = restTemplate.getForObject("http://localhost:8080/", Weather.class);
		
		int idOne = stationOne.getStationId();
	    int countOne = stationOne.getCount();
	    int temperatureOne = stationOne.getTemperature();
	    int rainOne = stationOne.getRain();
	    
		return new Weather(idOne, countOne, temperatureOne, rainOne);
	}
	*/
	@RequestMapping( 
			method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            value="/"
            )
	private List<Weather> collectWeather() {
		RestTemplate restTemplate = new RestTemplate();
		Weather stationOne = restTemplate.getForObject("http://localhost:8001/", Weather.class);
		//Weather stationTwo = restTemplate.getForObject("http://localhost:8002/", Weather.class);
		
		int idOne = stationOne.getStationId();
	    int countOne = stationOne.getCount();
	    int temperatureOne = stationOne.getTemperature();
	    int rainOne = stationOne.getRain();
	    
		List<Weather> collection = new ArrayList<>();
		collection.add(new Weather(idOne, countOne, temperatureOne, rainOne));
	
		return collection;
	}
		
		
}
	/*
	RestTemplate restTemplate = new RestTemplate();
    String getWeather = restTemplate.getForObject("http://localhost:8080/", String.class);
    //System.out.println(getWeather);
    
    Weather weather = restTemplate.getForObject("http://localhost:8080/", Weather.class);
    //System.out.println("Station ID: " + test.getStationId());
    //System.out.println("Count: " + test.getCount());
    //System.out.println("Temperature: " + test.getTemperature());
    //System.out.println("Rain: " + test.getRain());
    
    int chanceOfRain = weather.getRain();
    int tempInFarenheit = weather.getTemperature();
    double tempInCelsius = (tempInFarenheit-32)*(0.5556);
    
    
    System.out.println(chanceOfRain + "------" + stationId);
	*/
	
	
	
	/*
	private List<Weather> collectWeather() {
	
		List<Weather> collection = new ArrayList<>();
		resources.add(new Weather(stationId, count++, temperature, rain));
	
		return collection;
	}
	*/

