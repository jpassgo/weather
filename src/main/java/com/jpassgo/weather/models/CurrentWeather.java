package com.jpassgo.weather.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrentWeather {

    public float temperature;
    public float humidity;
    public float cloudCover;
    public int uvIndex;
    public int visibility;
    public String summary;
}
