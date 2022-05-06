package com.jpassgo.weather.controllers;

import com.jpassgo.weather.models.Location;
import com.jpassgo.weather.services.WeatherForecastService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    public WeatherForecastService weatherForecastService;

    public ResponseEntity weather(Location location) {
        return ResponseEntity.ok(weatherForecastService.getCurrentWeatherReport(location));
    }
}
