package se.hiq.hicollege.microservices;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/weather")

public class WeatherResource {

    Logger log = LoggerFactory.getLogger(WeatherResource.class);


    @GetMapping
    public ResponseEntity<HelloWeather> currentWeather(){
        return ResponseEntity.ok(new HelloWeather("Sunny",10L));
    }

}
