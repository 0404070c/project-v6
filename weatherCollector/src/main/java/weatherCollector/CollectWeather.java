package weatherCollector;

import org.springframework.web.client.RestTemplate;
import weatherCollector.Weather;

public class CollectWeather {	
		
		RestTemplate restTemplate = new RestTemplate();
		Weather station = restTemplate.getForObject("http://35.202.127.198:8002/", Weather.class);
		int stationId = station.getStationId();
		String status = station.getStatus();
	    int temperature = station.getTemperature();
	    int rain = station.getRain();
	    int identity = station.getIdentity();
	    int count = station.getCount();
		Weather newWeather = new Weather(stationId, status, temperature, rain, identity, count);
		
		public Weather getWeather(){
			return newWeather;
		}
	
}
