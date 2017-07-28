package weatherStation;

import java.util.Random;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherController {
	
	private Random value = new Random(); 
	private int count = 1;
	private int stationId = 1;
	private int temperature = 0 + value.nextInt(100);
	private int rain = 0 + value.nextInt(100);

	@RequestMapping( 
			method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            value="/"
            )
	public Weather weather() {
        return new Weather(stationId, count++, temperature, rain);
    }

}
