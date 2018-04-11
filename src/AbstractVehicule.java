
public abstract class AbstractVehicule implements Vehicule {
	private float nord, sud, est, ouest, speed;
	private Position position;
	
	// Constructeur
	public AbstractVehicule(){
		this.nord=0;
		this.sud=0;
		this.est=0;
		this.ouest=0;
		this.speed=0;
		this.position=new Position();
	}
	
	public Position getPosition(){
		return position;
	}
	
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
