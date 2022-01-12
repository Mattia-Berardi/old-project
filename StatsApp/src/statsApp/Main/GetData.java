package statsApp.Main;

import org.json.simple.*;
import java.util.*;
import java.io.*;
import statsApp.Informations.*;
import statsApp.Exceptions.*;

public class GetData {

	City city = new City();
	
	public JSONObject Json(City city) {
				
		JSONObject object = new JSONObject();
		
		object.put("name", city.getName());
		object.put("country", city.getCountry());
		object.put("id", city.getId());
		JSONObject coordinates = new JSONObject();
		coordinates.put("latitude", (city.getCoordinates()).getLatitude());
		coordinates.put("longitude", (city.getCoordinates()).getLongitude());
		object.put("coordinates", coordinates);
		
		JSONArray arr = new JSONArray();

		for(int i=0; i<(city.getVector()).size(); i++) {
			JSONObject weather = new JSONObject();
			weather.put("temp_max", (city.getVector()).get(i).getTemp_max());
			weather.put("temp_min", (city.getVector()).get(i).getTemp_min());
			weather.put("press_max", (city.getVector()).get(i).getPress_max());
			weather.put("press_min", (city.getVector()).get(i).getPress_min());
			arr.put(weather);
		}
	
		object.put("Weather", arr);
		
		return object;
	}
		
	public JSONObject getCityWeather(String city, String country) {
		JSONObject obj;
		String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + ", " + country + "&appid=" + api_key;
	
		return obj;
	}
	
	public City getCityWeatherEssential(String name) {
		JSONObject object = getCityWeather(name);
		City city = new City(name);
		city = getCityInfo(name);
		JSONArray weatherArray = object.getJSONArray("list");
		JSONObject counter;
		Vector<Weather> vector = new Vector<Weather>(weatherArray.length());
		
		try {
			
			for (int i = 0; i<weatherArray.length(); i++) {
				
				Weather weather = new Weather();
				counter = weatherArray.getJSONObject(i);
				JSONObject objectW = counter.getJSONObject("weather");
				weather.setTemp_max(objectW.getDouble("temp_max"));
				weather.setTemp_min(objectW.getDouble("temp_min"));
				weather.setPress_max(objectW.getDouble("press_max"));
				weather.setPress_min(objectW.getDouble("press_min"));
				vector.add(weather); 
		
			}
	
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		city.setVector(vector);
		
		return city;
	}
	
	public City getCityInfo(String name) {
		JSONObject object = getCityWeather(name);
		City city = new City(name);
		
		try {
			
			JSONObject cityObj = object.getJSONObject("city");
			String country = (String) cityObj.get("country");
			int id = (int) cityObj.get("id");
			JSONObject coordinatesObj = cityObj.getJSONObject("coord");
			double latitude = (double) coordinatesObj.get("lat");
			double longitude = (double) coordinatesObj.get("lon");
			Coordinates coordinates = new Coordinates(latitude,longitude); 
			city.setCountry(country);
			city.setId(id);
			city.setCoordinates(coordinates);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return city;
	}
	
	private String api_key = "28d53625a08af41f9d7fe9fa0b1c63a5";
	
	
}
