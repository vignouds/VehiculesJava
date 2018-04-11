
public abstract class AbstractVehicule implements Vehicule {
	private float nord, sud, est, ouest, speed;
	
	// Constructeur
	public AbstractVehicule(){
		
	}
	
	/*public Position getPosition(){
		return 
	*/
	public void setDirection(float n, float s, float o, float e) {
		this.nord=n;
		this.sud=s;
		this.ouest=o;
		this.est=e;
	}
	
	public void setSpeed(float sp) {
		this.speed=sp;
	}
}
