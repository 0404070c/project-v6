package weatherStation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
	
	private Random value = new Random(); 
	private int count = 1;
	
	private int stationId = 100000 + value.nextInt(900000);
	private int temperature = 0 + value.nextInt(100);
	private int rain = 0 + value.nextInt(100);

	@RequestMapping( 
			method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            value="/"
            )
	
	private List<Weather> getWeather() {

		List<Weather> resources = new ArrayList<>();
		resources.add(new Weather(stationId, count++, temperature, rain));

		return resources;
	}

}
