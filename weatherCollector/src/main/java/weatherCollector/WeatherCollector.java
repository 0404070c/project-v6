package weatherCollector;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class WeatherCollector {

	@RequestMapping( 
			method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            value="/"
            )
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
		
		
}
