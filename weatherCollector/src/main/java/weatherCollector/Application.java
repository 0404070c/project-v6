package weatherCollector;

import java.awt.List;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Application {



	public static void main(String args[]) {
		SpringApplication.run(Application.class);
		

		RestTemplate restTemplate = new RestTemplate();
	    String getWeather = restTemplate.getForObject("http://localhost:8080/", String.class);
	    System.out.println(getWeather);
	    


	    
	    Weather test = restTemplate.getForObject("http://localhost:8080/", Weather.class);
        System.out.println("Station ID: " + test.getStationId());
        System.out.println("Count: " + test.getCount());
        System.out.println("Temperature: " + test.getTemperature());
        System.out.println("Rain: " + test.getRain());
        
        
       
	    
	}
	

         
     
	

	

	
}