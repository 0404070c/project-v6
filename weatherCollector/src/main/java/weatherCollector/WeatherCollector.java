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
		return ("This is the collector service.");
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
		Weather stationOne = restTemplate.getForObject("http://35.202.53.47:8001/", Weather.class);

		int idOne = stationOne.getStationId();
		String statusOne = stationOne.getStatus();
	    int temperatureOne = stationOne.getTemperature();
	    int rainOne = stationOne.getRain();
	    int identityOne = stationOne.getIdentity();
	    int countOne = stationOne.getCount();
	    
    	return new Weather(idOne, statusOne, temperatureOne, rainOne, identityOne, countOne);
    	//IF SERVICE NOT AVAILABLE RETURN EMPTY JSON
		} catch (Exception e) {
		    e.printStackTrace();
		    return new Weather(1,"Unavailable",0,0,0,0);
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
		Weather stationTwo = restTemplate.getForObject("http://35.202.127.198:8002/", Weather.class);

		int idTwo = stationTwo.getStationId();
		String statusTwo = stationTwo.getStatus();
	    int temperatureTwo = stationTwo.getTemperature();
	    int rainTwo = stationTwo.getRain();
	    int identityTwo = stationTwo.getIdentity();
	    int countTwo = stationTwo.getCount();
	    
    	return new Weather(idTwo, statusTwo, temperatureTwo, rainTwo, identityTwo, countTwo);
    	//IF SERVICE NOT AVAILABLE RETURN EMPTY JSON
		} catch (Exception e) {
		    e.printStackTrace();
		    return new Weather(2,"Unavailable",0,0,0,0);
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
		Weather stationThree = restTemplate.getForObject("http://35.188.76.15:8003/", Weather.class);

	    int idThree = stationThree.getStationId();
	    String statusThree = stationThree.getStatus();
	    int temperatureThree = stationThree.getTemperature();
	    int rainThree = stationThree.getRain();
	    int identityThree = stationThree.getIdentity();
	    int countThree = stationThree.getCount();
	    
    	return new Weather(idThree, statusThree, temperatureThree, rainThree, identityThree, countThree);
    	//IF SERVICE NOT AVAILABLE RETURN EMPTY JSON
		} catch (Exception e) {
		    e.printStackTrace();
		    return new Weather(3,"Unavailable",0,0,0,0);
		} 
	}
	
		
}
