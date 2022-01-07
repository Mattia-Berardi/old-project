package statsApp.Informazioni;

/** Classe che rappresenta le caratteristiche e le proprietà di ogni città.
 * 
 * @author Michele
 * @author Mattia 
 */
import java.util.Vector;


public class City {
	
	private String name;
	private String country;
	
	
	
	public City(String name) {
		this.name=name;
		this.country=null;
	}
	
	
	public City(String name, String country) {
		this.name=null;
		this.country=country;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
