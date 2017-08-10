package weatherStationTwo;

import java.util.Random;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherController {
	
	//SET STATION NUMBER AND WEATHER DETAILS
	private int stationId = 2;
	private String status = "Available";
	private int temperature = 55;
	private int rain = 100;
	
	//CREATE RANDOM ID AND COUNT
	private Random value = new Random(); 
	private int identity = 1000000 + value.nextInt(9000000);
	private int count = 1;

	//GENERATE WEATHER JSON
	@RequestMapping( 
			method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            value="/"
            )
	public Weather weather() {
        return new Weather(stationId, status, temperature, rain, identity, count++);
    }

}
