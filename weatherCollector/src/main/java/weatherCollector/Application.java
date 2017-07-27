package weatherCollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;




@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Application {


	public static void main(String args[]) {
		SpringApplication.run(Application.class);
		

		RestTemplate restTemplate = new RestTemplate();
	    String getWeather = restTemplate.getForObject("http://localhost:8080/", String.class);
	    System.out.println(getWeather);
	    


	    
	    Weather weather = restTemplate.getForObject("http://localhost:8080/", Weather.class);
        //System.out.println("Station ID: " + test.getStationId());
        //System.out.println("Count: " + test.getCount());
        //System.out.println("Temperature: " + test.getTemperature());
        //System.out.println("Rain: " + test.getRain());
        
        int stationId = weather.getStationId();
        int chanceOfRain = weather.getRain();
        int tempInFarenheit = weather.getTemperature();
        double tempInCelsius = (tempInFarenheit-32)*(0.5556);
        
        
        System.out.println(chanceOfRain + "------" + stationId);
        
       
	    
	}
	
}