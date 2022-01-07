package statsApp.Informazioni;

/** Classe che rappresenta le statistiche metereologiche.
 * 
 * @author Michele
 * @author Mattia
 *
 */

public class Weather {
	
	private double temp_max;
	private double temp_min;
	private double press_max;
	private double press_min;
	
	public Weather() {
		this.temp_max=0;
		this.temp_min=0;
		this.press_max=0;
		this.press_min=0;
	}

	public double getTemp_max() {
		return temp_max;
	}
	
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}
	
	public double getTemp_min() {
		return temp_min;
	}
	
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}
	
	public double getPress_max() {
		return press_max;
	}
	
	public void setPress_max(double press_max) {
		this.press_max = press_max;
	}
	
	public double getPress_min() {
		return press_min;
	}
	
	public void setPress_min(double press_min) {
		this.press_min = press_min;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
