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
	
	private String api_key = "28d53625a08af41f9d7fe9fa0b1c63a5";
	
	
}
