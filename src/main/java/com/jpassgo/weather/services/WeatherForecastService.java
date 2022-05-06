package com.jpassgo.weather.services;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.jpassgo.weather.clients.DarkSkyClient;
import com.jpassgo.weather.models.Location;
import com.jpassgo.weather.models.CurrentWeather;
import org.springframework.stereotype.Service;

@Service
public class WeatherForecastService {

    public DarkSkyClient darkSkyClient;
    public Gson gson;

    public CurrentWeather getCurrentWeatherReport(Location location) {
        JsonObject forecastJsonResponse = darkSkyClient.forecast(
                location.getLongitude().toString(), 
                location.getLatitude().toString());

        return gson.fromJson(forecastJsonResponse.getAsJsonObject("currently"), CurrentWeather.class);
    }
}
