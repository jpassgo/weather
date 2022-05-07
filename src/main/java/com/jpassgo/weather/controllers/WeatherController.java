package com.jpassgo.weather.controllers;

import com.jpassgo.weather.models.Location;
import com.jpassgo.weather.services.WeatherForecastService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

  public WeatherForecastService weatherForecastService;

  @PostMapping
  public ResponseEntity weather(Location location) {
    return ResponseEntity.ok(weatherForecastService.getCurrentWeatherReport(location));
  }
}
