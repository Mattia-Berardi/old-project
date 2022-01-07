package statsApp.Main;

import org.json.simple.*;

public class GetData {

	public JSONObject getCityWeather(String city, String country) {
		JSONObject obj;
		String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + ", " + country + "&appid=" + api_key;
	
	
		return obj;
	}
	
	private String api_key = "28d53625a08af41f9d7fe9fa0b1c63a5";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
