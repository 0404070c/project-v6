package weatherStationThree;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WeatherController {
	
	//SET STATION NUMBER AND WEATHER DETAILS
	private int stationId = 3;
	private String status = "Available";
	private int temperature = 110;
	private int rain = 80;
	
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
		public ResponseEntity<Weather> weather(){
	        Weather weather = new Weather(stationId, status, temperature, rain, identity, count++);
	        return new ResponseEntity<Weather>(weather, HttpStatus.OK);
	    }

}
