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
	private long id;
	private Coordinates coordinates;
	private Vector<Weather> vector = new Vector<Weather>();
	
	public City() {
	}
	
	public City(String name) {
		this.name=name;
		this.country=null;
		this.id=0;
		this.coordinates=null;			
	}
	
	public City(long id) {
		this.name=null;
		this.country=null;
		this.id=id;
		this.coordinates=null;
	}
	
	public City(Coordinates coordinates) {
		this.name=null;
		this.country=null;
		this.id=0;
		this.coordinates=coordinates;
	}
	
	public City(String name, String country) {
		this.name=name;
		this.country=country;
		this.id=0;
		this.coordinates=null;
	}
	
	public City(String name, String country, long id, Coordinates coordinates) {
		this.name=name;
		this.country=country;
		this.id=id;
		this.coordinates=coordinates;
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
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Coordinates getCoordinates() {
		return coordinates;
	}
	
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	
	public Vector<Weather> getVector() {
		return vector;
	}
	
	public void setVector(Vector<Weather> vector) {
		this.vector = vector;
	}
	
	
	
	

	

}
