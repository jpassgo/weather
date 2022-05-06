package com.jpassgo.weather.interceptors;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DarkSkyInterceptor implements RequestInterceptor {

    @Value("${x-rapidapi-host}")
    public String xRapidApiHost;
    @Value("${x-rapidapi-key}")
    public String xRapidApiKey;

    private static final String X_RAPIDAPI_HOST = "x-rapidapi-host";
    private static final String X_RAPIDAPI_KEY = "x-rapidapi-key";

    @Override
    public void apply(RequestTemplate template) {
        template.header(X_RAPIDAPI_HOST, xRapidApiHost);
        template.header(X_RAPIDAPI_KEY, xRapidApiKey);
    }
}
