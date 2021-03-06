package com.backendprojectweather.backendprojectweather.service;

import java.util.List;

import com.backendprojectweather.backendprojectweather.model.Weather;

public interface WeatherService {
	public Weather save(Weather weather);
	public Weather currentDateWeather();
	public List<Weather> findAll();
	public List<Weather> findAllByCurrentUser(Long user_id);
	public List<Weather> findByCityId(int id,Long user_id);
	public void deleteById(Long id);
}
