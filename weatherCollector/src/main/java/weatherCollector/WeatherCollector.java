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
        value="/1"
        )
	public Weather weatherOne() throws Exception {
		try {
		RestTemplate restTemplate = new RestTemplate();
		Weather stationOne = restTemplate.getForObject("http://192.168.99.100:30001/", Weather.class);

		int idOne = stationOne.getStationId();
		String availableOne = stationOne.getAvailable();
	    int countOne = stationOne.getCount();
	    int temperatureOne = stationOne.getTemperature();
	    int rainOne = stationOne.getRain();
	    
    	return new Weather(idOne, availableOne, countOne, temperatureOne, rainOne);
    	//IF SERVICE NOT AVAILABLE RETURN EMPTY JSON
		} catch (Exception e) {
		    e.printStackTrace();
		    return new Weather(1,"Unavailable",0,0,0);
		} 
	}
	
	//CONSUME AND REPORDUCE DATA FROM WEATHER STATION TWO
	@RequestMapping( 
		method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE,
        value="/2"
        )
	public Weather weatherTwo() throws Exception {
		try {
		RestTemplate restTemplate = new RestTemplate();
		Weather stationTwo = restTemplate.getForObject("http://192.168.99.100:30002/", Weather.class);

		int idTwo = stationTwo.getStationId();
		String availableTwo = stationTwo.getAvailable();
	    int countTwo = stationTwo.getCount();
	    int temperatureTwo = stationTwo.getTemperature();
	    int rainTwo = stationTwo.getRain();
	    
    	return new Weather(idTwo, availableTwo, countTwo, temperatureTwo, rainTwo);
    	//IF SERVICE NOT AVAILABLE RETURN EMPTY JSON
		} catch (Exception e) {
		    e.printStackTrace();
		    return new Weather(2,"Unavailable",0,0,0);
		} 
	}
		
	//CONSUME AND REPORDUCE DATA FROM WEATHER STATION TWO
	@RequestMapping( 
			method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            value="/3"
            )
	public Weather weatherThree() throws Exception {
		try {
		RestTemplate restTemplate = new RestTemplate();
		Weather stationThree = restTemplate.getForObject("http://192.168.99.100:30003/", Weather.class);

	    int idThree = stationThree.getStationId();
	    String availableThree = stationThree.getAvailable();
	    int countThree = stationThree.getCount();
	    int temperatureThree = stationThree.getTemperature();
	    int rainThree = stationThree.getRain();
	    
    	return new Weather(idThree, availableThree, countThree, temperatureThree, rainThree);
    	//IF SERVICE NOT AVAILABLE RETURN EMPTY JSON
		} catch (Exception e) {
		    e.printStackTrace();
		    return new Weather(3,"Unavailable",0,0,0);
		} 
	}
		
}
