package weatherStationTwo;

import java.util.Random;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherController {
	
	private int stationId = 2;
	private String available = "Available";
	private Random value = new Random(); 
	private int count = 1;
	private int temperature = 0 + value.nextInt(100);
	private int rain = 0 + value.nextInt(100);

	//GENERATE WEATHER JSON
	@RequestMapping( 
			method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            value="/"
            )
	public Weather weather() {
        return new Weather(stationId, available, count++, temperature, rain);
    }

}
