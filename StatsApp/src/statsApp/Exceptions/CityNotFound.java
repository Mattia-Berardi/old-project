package statsApp.Exceptions;

public class CityNotFound {

	String err;
	
	public CityNotFound(String err) {
		this.err=err;
	}
	
	public String getErr() {
		return err;
	}

}
