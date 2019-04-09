package se.hiq.hicollege.microservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")


public class HelloWeather {
    private String forecast;
    private long temperature;

    public HelloWeather(){

    }
    public HelloWeather(String forecast, long temperature) {
        this.forecast = forecast;
        this.temperature = temperature;
    }

    public String getForecast() {
        return forecast;
    }

    public long getTemperature() {
        return temperature;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
