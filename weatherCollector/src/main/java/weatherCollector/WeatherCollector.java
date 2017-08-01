package weatherCollector;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class WeatherCollector {

	//STANDARD MESSAGE
	@RequestMapping( 
			method = RequestMethod.GET,
            value="/"
            )
	public String message(){
		return ("This is the collector service");
	}
	
	//CONSUME AND REPORDUCE DATA FROM WEATHER STATION ONE
	@RequestMapping( 
			method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            value="/stationOne"
            )
	public Weather weather() throws Exception {
		try {
		RestTemplate restTemplate = new RestTemplate();
		Weather stationOne = restTemplate.getForObject("http://localhost:8001/", Weather.class);

		int idOne = stationOne.getStationId();
	    int countOne = stationOne.getCount();
	    int temperatureOne = stationOne.getTemperature();
	    int rainOne = stationOne.getRain();
	    
    	return new Weather(idOne, countOne, temperatureOne, rainOne);
    	//IF SERVICE NOT AVAILABLE RETURN EMPTY JSON
		} catch (Exception e) {
		    e.printStackTrace();
		    return new Weather(0,0,0,0);
		} 
	}
	
	
	
	/* OLD WAY, COMBINES JSONS INTO ONE
	private List<Weather> collectWeather() {
		RestTemplate restTemplate = new RestTemplate();
		Weather stationOne = restTemplate.getForObject("http://localhost:8001/", Weather.class);
		Weather stationTwo = restTemplate.getForObject("http://localhost:8002/", Weather.class);
		Weather stationThree = restTemplate.getForObject("http://localhost:8003/", Weather.class);
		
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
	    
		List<Weather> collection = new ArrayList<>();
		collection.add(new Weather(idOne, countOne, temperatureOne, rainOne));
		collection.add(new Weather(idTwo, countTwo, temperatureTwo, rainTwo));
		collection.add(new Weather(idThree, countThree, temperatureThree, rainThree));
	
		return collection;
	}
	*/
		
		
}
