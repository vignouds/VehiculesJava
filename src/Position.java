
public class Position {
	private float latittude, longitude;
	
	//Constructeur 
	public Position(){
		this.latittude=0;
		this.longitude=0;
	}
	
	//Setters
	public void setLatittude(float lat) {
		this.latittude=lat;
	}
	
	public void setLongitude(float lng) {
		this.longitude=lng;
	}
	
	//Getters	
	public float getLatittude() {
		return this.latittude;
	}
	
	public float getLongitude() {
		return this.longitude;
	}
}
