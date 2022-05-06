package com.jpassgo.weather.clients;

import com.google.gson.JsonObject;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "dark-sky-api", url = "${dark-sky-api.url}")
public interface DarkSkyClient {

    @GetMapping
    JsonObject forecast(@Param String longitude, @Param String latitude);
}
