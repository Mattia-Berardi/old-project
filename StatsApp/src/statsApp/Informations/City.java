package statsApp.Informations;

/** Classe che rappresenta le caratteristiche e le proprietà di ogni città.
 * 
 * @author Michele
 * @author Mattia 
 */
import java.util.Vector;


public class City {
	
	private String name;
	private String country;
	private Vector<Weather> vector = new Vector<Weather>();
	
	
	public City(String name) {
		this.name=name;
		this.country=null;
	}
	
	
	public City(String name, String country) {
		this.name=null;
		this.country=country;
	}
	
	public City() {
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
	
	public Vector<Weather> getVector() {
		return vector;
	}
	
	public void setVector(Vector<Weather> vector) {
		this.vector = vector;
	}
	
	
	
	

	

}
