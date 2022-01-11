package statsApp.Main;

import org.json.simple.*;
import java.util.*;
import statsApp.Informations.*;

public class GetData {

	City city = new City();
	
	public JSONObject Json(City city) {
				
		JSONObject object = new JSONObject();
		
		object.put("name", city.getName());
		object.put("country", city.getCountry());
		
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
